package redisIncrTest.redisIncr;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

@Component
public class RedisOPSBean {
	
	@SuppressWarnings("rawtypes")
	@Autowired
    private RedisTemplate  redisTemplate;
	
	
	/**
	 *  jedisCluster.set(key, value, "NX", "EX", expireSeconds);  // SET IF NOT EXIST
	 *  spring boot1.x RedisTemplate 实现 setnx exptime (扩展 redisTemplate.setIfAbsent)
	 *  https://blog.csdn.net/u012903926/article/details/90640057
	 *  @author:heshengjin qq:2356899074
	    @date 2019年11月11日 下午5:54:26
	 */
	@SuppressWarnings("unchecked")
	public  boolean setIfAbsent(final String key, final Serializable value, final long expireSeconds) {
	    Boolean result = (Boolean) redisTemplate.execute(new RedisCallback<Boolean>() {
	        @SuppressWarnings("rawtypes")
			@Override
	        public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
	            RedisSerializer valueSerializer = redisTemplate.getValueSerializer();
	            RedisSerializer keySerializer = redisTemplate.getKeySerializer();
	            Object obj = connection.execute("set", keySerializer.serialize(key), 
	                                valueSerializer.serialize(value),
	                                "NX".getBytes(StandardCharsets.UTF_8),
	                                "EX".getBytes(StandardCharsets.UTF_8),
	                                String.valueOf(expireSeconds).getBytes(StandardCharsets.UTF_8));
	            return obj != null;
	        }
	    });
	    return result;
	}

}
