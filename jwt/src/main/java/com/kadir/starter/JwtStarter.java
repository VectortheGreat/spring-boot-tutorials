package com.kadir.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.kadir")
@EntityScan(basePackages = "com.kadir")
@EnableJpaRepositories(basePackages = "com.kadir")
public class JwtStarter {

	public static void main(String[] args) {
		SpringApplication.run(JwtStarter.class, args);
	}

}
