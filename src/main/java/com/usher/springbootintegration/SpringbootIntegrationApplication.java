package com.usher.springbootintegration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.usher.springbootintegration.cache.mapper")
@EnableCaching
@EnableRabbit
public class SpringbootIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIntegrationApplication.class, args);
	}
}
