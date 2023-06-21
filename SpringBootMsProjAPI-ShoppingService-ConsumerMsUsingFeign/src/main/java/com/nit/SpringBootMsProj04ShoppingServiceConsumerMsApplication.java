package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringBootMsProj04ShoppingServiceConsumerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj04ShoppingServiceConsumerMsApplication.class, args);
	}

	@Bean
	public Sampler createSampler() {
	return Sampler.ALWAYS_SAMPLE;
	}


}
