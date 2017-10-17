package com.etsys.core.dao;

public interface JedisClient {

	public String set(String key, String value);
	
	public long incr(String key);
	
	public Long hset(String hkey, String key, String value);
	
	public String hget(String hkey, String key);
	
	public Long del(String key);
	
	public Long hdel(String hkey, String key);
	
	public Long expire(String key, int second);
	
	public String get(String key);
	
}
