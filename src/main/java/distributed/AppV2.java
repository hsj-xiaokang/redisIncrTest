package distributed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * redis分布式锁-基于SETNX，「SET if Not eXists」
 * RedisTemplate 对应 setIfAbsent「absent 不存在的意思」 
 * 当前模块的运用程序加锁，集群发布很多个！！！
 * https://blog.csdn.net/wuzhiwei549/article/details/80692278
 *
 */
@SpringBootApplication
public class AppV2 implements CommandLineRunner{
	private final static Logger logger = Logger.getLogger(AppV2.class.getName());
	
	@Autowired
    private StringRedisTemplate  stringRedisTemplate;
	//redis的键-key
	private final static String LOCKKEY = "HSJ-QPS-D";
	private final static String LOCKKEY_VALUE = "1";
	//线程池5个线程
	private final static ExecutorService  FIXED_POOL3 = Executors.newFixedThreadPool(8);
	
	public static void main(String[] args) {
		SpringApplication.run(AppV2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//10个线程都去让他增加，总共1000002次
		for(long i = 0;i < 1002;i++){
			FIXED_POOL3.execute(()->{
				
				synchronized(this.getClass()){//锁住类，不是实例 Runnable command
					//默认没有获取锁
					boolean lock = false;
					try{					
						lock = stringRedisTemplate.opsForValue().setIfAbsent(LOCKKEY, LOCKKEY_VALUE);					
						if (lock) {
							logger.info(String.format("==【%s】===AppV2获取到锁：%s===", Thread.currentThread().getName(),lock));
							stringRedisTemplate.expire(LOCKKEY,1, TimeUnit.MINUTES); //成功设置过期时间- 在1s之后过期
						}else {
//							logger.info("AppV2没有获取到锁，不执行任务!");
						}
					}finally{
						if(lock){	
							stringRedisTemplate.delete(LOCKKEY);
//							logger.info("AppV2任务结束，释放锁!");		
						}else{
//							logger.info("AppV2没有获取到锁，无需释放锁!");
						}
					}
				}
				
			});
		}
	}
	
}
