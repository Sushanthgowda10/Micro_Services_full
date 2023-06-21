package com.nit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service")
public interface BillingServiceConsumerClient {

	@GetMapping("billing/api/info")
	public String fetchBillDetails();
}
