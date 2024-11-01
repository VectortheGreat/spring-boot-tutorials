package com.kadir.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = { "com.kadir" })
@ComponentScan(basePackages = { "com.kadir" })
@EnableJpaRepositories(basePackages = { "com.kadir" })
@EnableScheduling
public class ExceptionManagementApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementApplicationStarter.class, args);
	}

}
