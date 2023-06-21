package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj05InsuranceServiceMsProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj05InsuranceServiceMsProviderMsApplication.class, args);
	}

}
