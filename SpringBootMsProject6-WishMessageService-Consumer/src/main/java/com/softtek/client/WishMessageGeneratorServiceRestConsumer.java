package com.softtek.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("WishMessageGenerator-Service")
public interface WishMessageGeneratorServiceRestConsumer {

	@GetMapping("/wish/message/info")
	public String fetchInsuranceDetails();
	
	
}
