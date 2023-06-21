package com.softtek.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/just/ticket")
public class JustTicketServiceController {

	@Value("${server.port}")
	private int port;

	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/info")
	public ResponseEntity<String> fetchTicket() {

		return new ResponseEntity<String>("Your Ticket for *RRR* is booked "+" :) .....  : using instace:-> "+instanceId+
				" @port: "+port,HttpStatus.OK);

		
	}
}
