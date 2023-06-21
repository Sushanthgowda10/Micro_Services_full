package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMsProject2BillingServiceProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject2BillingServiceProviderMsApplication.class, args);
	}

}
