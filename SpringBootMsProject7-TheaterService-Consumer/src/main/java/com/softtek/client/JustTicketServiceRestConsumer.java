package com.softtek.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("JustTicket-Service")
public interface JustTicketServiceRestConsumer {

	@GetMapping("/just/ticket/info")
	public String fetchTicketDetails();
	
	
}
