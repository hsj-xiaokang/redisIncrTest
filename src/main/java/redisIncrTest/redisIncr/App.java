package redisIncrTest.redisIncr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;

/**
 * redisTemplate测试 incr原子自增操作
 *
 */
/*@SpringBootApplication
public class App implements CommandLineRunner{
	
	@Autowired
    private StringRedisTemplate  stringRedisTemplate;
	//redis的键-key
	private final static String KEY = "HSJ-QPS-INCR";
	//线程池5个线程
	private final static ExecutorService  FIXED_POOL3 = Executors.newFixedThreadPool(8);
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RedisAtomicLong redisAtomicLong = new RedisAtomicLong(KEY, stringRedisTemplate.getConnectionFactory());
		//10个线程都去让他增加，总共1000002次
		for(long i = 0;i < 1000002;i++){
			FIXED_POOL3.execute(()->{redisAtomicLong.getAndIncrement();});
		}
	}
	
}*/
