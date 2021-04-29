package com.demo.parking_access.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisMasterConfig {

    //master
    @Value("${spring.redis.master.host}")
    private String moocHost;

    @Value("${spring.redis.master.port}")
    private String moocPort;

    @Value("${spring.redis.master.passWord}")
    private String mooPassWord;

/*
    @Value("${spring.redis.master.password}")
    private String moocPassword;
*/

    //slave
    @Value("${spring.redis.slave.host}")
    private String icveHost;

    @Value("${spring.redis.slave.port}")
    private String icvePort;

    @Value("${spring.redis.slave.passWord}")
    private String icvePassWord;

/*
    @Value("${spring.redis.slave.password}")
    private String icvePassword;
*/

    //下面参数也可以配置在application.properties文件中
    private static final int MAX_IDLE = 1000; //最大空闲连接数
    private static final int MAX_TOTAL = 1024; //最大连接数
    private static final long MAX_WAIT_MILLIS = 100000; //建立连接最长等待时间


    //连接池配置
    @Bean
    public JedisPoolConfig jedisPoolConfig() { //int maxIdle, int maxTotal, long maxWaitMillis, boolean testOnBorrow
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(1000);
        poolConfig.setMaxTotal(1024);
        poolConfig.setMaxWaitMillis(100000);
        poolConfig.setTestOnBorrow(false);
        return poolConfig;
    }

    // @Bean
    public RedisConnectionFactory redisConnectionFactory(String host, int port, int index,String password) { //   int maxIdle, int maxTotal, long maxWaitMillis,

        RedisStandaloneConfiguration redisStandaloneConfiguration =
                new RedisStandaloneConfiguration();
        //设置redis服务器的host或者ip地址
        redisStandaloneConfiguration.setHostName(host);
        //设置默认使用的数据库
        redisStandaloneConfiguration.setDatabase(index);
        //设置密码
        redisStandaloneConfiguration.setPassword(RedisPassword.of(password));
        //设置redis的服务的端口号
        redisStandaloneConfiguration.setPort(port);
        //获得默认的连接池构造器(怎么设计的，为什么不抽象出单独类，供用户使用呢)
        JedisClientConfiguration.JedisPoolingClientConfigurationBuilder jpcb =
                (JedisClientConfiguration.JedisPoolingClientConfigurationBuilder) JedisClientConfiguration.builder();

        //通过构造器来构造jedis客户端配置
        JedisClientConfiguration jedisClientConfiguration = jpcb.build();
        //单机配置 + 客户端配置 = jedis连接工厂
        return new JedisConnectionFactory(redisStandaloneConfiguration, jedisClientConfiguration);



/*     //指定jedisPoolConifig来修改默认的连接池构造器
        jpcb.poolConfig(jedisPoolConfig(maxIdle, maxTotal, maxWaitMillis, false));*/


    }

    @Bean(name = "redisMasterTemplate")
    public RedisTemplate<String, Object> redisMasterTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(
                redisConnectionFactory(moocHost, Integer.parseInt(moocPort),0,mooPassWord));
        redisSerializeConfig(template);
        return template;
    }

    //------------------------------------
  /*  @Bean(name = "redisSlaveTemplate")
    public RedisTemplate redisSlaveTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(
                redisConnectionFactory(icveHost, Integer.parseInt(icvePort), 0,icvePassWord));
        redisSerializeConfig(template);
        return template;
    }*/


    //序列化操作
    public void redisSerializeConfig(RedisTemplate template){
        // JSON序列化配置
        Jackson2JsonRedisSerializer Jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        // om.activateDefaultTyping(LaissezFaireSubTypeValidator.instance, ObjectMapper.DefaultTyping.NON_FINAL);
        Jackson2JsonRedisSerializer.setObjectMapper(om);
        //String 的序列化
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();

        //key采用String的序列化方式
        template.setKeySerializer(stringRedisSerializer);
        //hash采用String的序列化方式
        template.setHashKeySerializer(stringRedisSerializer);
        //value序列化采用jackson
        template.setValueSerializer(Jackson2JsonRedisSerializer);
        //hash的value序列化采用Jackson
        template.setHashValueSerializer(Jackson2JsonRedisSerializer);
        template.afterPropertiesSet();

    }


/*
    //------------------------------------
    @Bean(name = "redisZjyTemplate")
    public StringRedisTemplate redisZjyTemplate() {
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(
                redisConnectionFactory(zjyHost, Integer.parseInt(zjyPort), zjyPassword, MAX_IDLE, MAX_TOTAL, MAX_WAIT_MILLIS, 0));
        return template;
    }*/
}
