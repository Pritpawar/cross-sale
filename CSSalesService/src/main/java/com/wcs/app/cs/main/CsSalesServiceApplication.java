package com.wcs.app.cs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
@EnableJpaRepositories("com")
public class CsSalesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsSalesServiceApplication.class, args);
	}

}