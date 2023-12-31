package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMsProj08EmpRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj08EmpRestServiceApplication.class, args);
	}

}
