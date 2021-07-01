package redisIncrTest.redisIncr;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;

/**
 * eval "return {KEYS[1],KEYS[2],ARGV[1],ARGV[2]}" 2 key1 key2 firstValue secondValue
		1) "key1"
		2) "key2"
		3) "firstValue"
		4) "secondValue"
 * 
 *  说明： redis lua 原子操作 可行
 *       redison分布式锁  原子操作 可行
 *       不加锁 不具备原子操作 不可行
 *  @author:heshengjin qq:2356899074
 *  @date 2020年12月17日 上午11:14:48
 */
@SpringBootApplication
public class AppLua implements CommandLineRunner{	
	private final static Logger logger = Logger.getLogger(AppLua.class.getName());
    @Autowired
    private StringRedisTemplate  stringRedisTemplate;
    @Resource
	private RedissonClient redissonClient;

	public final static String KEY1 = "10";//"eval \"return redis.call('set',KEYS[1],1000)\" 1 10";  //初始化KEY：10 ，VALUE:1000
	public final static String KEY1_VALUE = "1000";
	public final static String KEY2 = "5";//"eval \"return redis.call('set',KEYS[1],500)\" 1 5";//初始化KEY：5 ，VALUE:500
	public final static String KEY2_VALUE = "500";

	public final static StringBuilder LUA =        new StringBuilder()
			                                                  //.append(" eval \" ")
    		                                                  .append(" local i = 1 ")//lua 的KEY下标从1开始
    		                                                  .append(" while( tonumber(i) <= table.getn( ARGV) ) do ")//校验库存
    		                                                  .append("   if tonumber(ARGV[i]) > tonumber(redis.call('get',KEYS[i])) then return error('please notice here,stock is over!-----by goods stock.') end ")
    		                                                  .append("   i = i + 1 ")
    		                                                  .append(" end ")
    		                                                  .append(" i= 1 ")//重置index从1开始，进行减库存操作
    		                                                  .append(" while( tonumber(i) <= table.getn( ARGV) ) do ")
    		                                                  .append(" redis.call('decrby' , KEYS[i],ARGV[i]) ")
    		                                                  .append(" i = i + 1 ")
    		                                                  .append(" end ")
    		                                                  .append(" return i-1 ");//执行成功的个数
    		                                                  //.append(" \" 2 10 5 1 1"); //2表示两个KEY，KEY：10 5，VALUE：1 1 --两个KEY每次减少都是1
	//线程池10个线程
	private final static ExecutorService  FIXED_POOL = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) {
		SpringApplication.run(AppLua.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 //初始化数据
		 stringRedisTemplate.opsForValue().set(KEY1, KEY1_VALUE);
		 stringRedisTemplate.opsForValue().set(KEY2, KEY2_VALUE);
		 DefaultRedisScript<Long> defaultRedisScript = new DefaultRedisScript<Long>();
	     //设置脚本
		 defaultRedisScript.setScriptText(LUA.toString());
	     //定义返回类型。注意如果没有这个定义，spring不会返回结果
		 defaultRedisScript.setResultType(Long.class);
	        
		    //key
	        final List<String> keyList = new ArrayList<String>();
	        keyList.add(KEY1);
	        keyList.add(KEY2);
	        //两个KEY每次减少都是1
	        final Object[] valueDecrby = new Object[]{"1","1"};
		//10个线程都去让他减库存，执行总共501次
		//第501次lua脚本报错，KEY：5的商品无库存，以后终止执行减库存操作
		//最终KEY：5库存应该等于0，KEY：10库存应该等于500
		for(long i = 0;i < 501;i++){
			FIXED_POOL.execute(()->{
				//*******************************
				//    lua 原子操作 可行
				//*******************************
				try {
					Long restult = stringRedisTemplate.execute(defaultRedisScript,keyList,valueDecrby);
					logger.info("本次执行结果：" + restult);
				} catch (Exception e) {
					System.out.println("减库存失败，没有库存了，"+e.getMessage());
				}
				
				
				
				
				//*******************************
				//    redison分布式锁  原子操作 可行
				//*******************************
//	    		// 1.获取分布式锁
//		        RLock lock = redissonClient.getLock("my:lock");
//		        // 2.进行加锁操作
//		        lock.lock();
//		        try {
//		        	
//				long value1 = Long.parseLong(stringRedisTemplate.opsForValue().get(KEY1));
//				long value2 = Long.parseLong(stringRedisTemplate.opsForValue().get(KEY2));
//				if(value1 > 0 && value2 > 0){
//					stringRedisTemplate.opsForValue().increment(KEY1, -1);
//					stringRedisTemplate.opsForValue().increment(KEY2, -1);
//				}
//				
//	               //DO SOMETHING HERE...
//		        } catch (Exception e) {
//		            System.out.println(e.getMessage());
//		            Thread.currentThread().interrupt();
//		        } finally{
//			        // 3.释放锁资源
//			        lock.unlock();
//		        }
				
				
				
		        
				//*******************************
				//    不加锁 不具备原子操作 不可行
				//*******************************
//				long value1 = Long.parseLong(stringRedisTemplate.opsForValue().get(KEY1));
//				long value2 = Long.parseLong(stringRedisTemplate.opsForValue().get(KEY2));
//				if(value1 > 0 && value2 > 0){
//					stringRedisTemplate.opsForValue().increment(KEY1, -1);
//					stringRedisTemplate.opsForValue().increment(KEY2, -1);
//				}
				
				
			});
		}
	}
	
}
