package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // enables the Eureka R & D server related Autoconfiguration activites
public class BootMsProj01RAndDServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj01RAndDServerEurekaApplication.class, args);
	}

}
