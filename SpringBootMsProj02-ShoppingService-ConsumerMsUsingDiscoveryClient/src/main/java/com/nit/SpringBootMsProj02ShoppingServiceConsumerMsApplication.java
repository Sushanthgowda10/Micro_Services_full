package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj02ShoppingServiceConsumerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02ShoppingServiceConsumerMsApplication.class, args);
	}

}
