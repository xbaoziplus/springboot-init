package com.xbaoziplus.project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description 线程池相关配置
 * @author xbaozi
 * @date 2022/9/14 16:49
 **/
@Configuration
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor(
            @Value("${thread.pool.coreSize}") Integer coreSize,
            @Value("${thread.pool.maxSize}") Integer maxSize,
            @Value("${thread.pool.keepalive}") Integer keepalive,
            @Value("${thread.pool.blockQueueSize}") Integer blockQueueSize
    ) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                coreSize,
                maxSize,
                keepalive,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(blockQueueSize),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        executor.prestartCoreThread();
        return executor;
    }
}