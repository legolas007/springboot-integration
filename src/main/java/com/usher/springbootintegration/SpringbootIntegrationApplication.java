package com.usher.springbootintegration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.usher.springbootintegration.cache.mapper")
@EnableCaching
@EnableRabbit
@EnableAsync//异步任务
@EnableScheduling//定时任务
/**
 * 自定义健康状态指示器
 * 编写一个指示器，实现HealthIndicator
 * 指示器的名字 xxxHealthIndicator
 * 加入容器
 */
public class SpringbootIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootIntegrationApplication.class, args);
    }
}