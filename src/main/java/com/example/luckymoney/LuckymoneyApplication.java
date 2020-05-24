package com.example.luckymoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.yml")
@EnableConfigurationProperties
public class LuckymoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckymoneyApplication.class, args);
	}

}
