package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringBootMsProj08ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj08ConfigServerApplication.class, args);
	}

}
