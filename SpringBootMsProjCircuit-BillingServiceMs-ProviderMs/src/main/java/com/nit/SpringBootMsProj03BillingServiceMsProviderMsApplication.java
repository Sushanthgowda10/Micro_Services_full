package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj03BillingServiceMsProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj03BillingServiceMsProviderMsApplication.class, args);
	}
	@Bean
	public Sampler creatSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
