package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMsProject2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject2EurekaServerApplication.class, args);
	}

}
