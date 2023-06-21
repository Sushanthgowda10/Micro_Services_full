package com.nit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Insurance-Service")
public interface HospitalServiceConsumerClient {

	@GetMapping("insurance/api/info")
	public String fetchBillDetails();
}
