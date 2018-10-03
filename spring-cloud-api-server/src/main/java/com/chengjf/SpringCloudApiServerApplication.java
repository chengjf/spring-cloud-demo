package com.chengjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiServerApplication.class, args);
	}
}
