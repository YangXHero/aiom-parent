package com.yyx.aio;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan
@MapperScan("com.yyx.aio.mapper")
public class AIOMApplication {

	public static void main(String[] args) {
		SpringApplication.run(AIOMApplication.class, args);
	}
}
