package com.softtek.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish/message")
public class WishMessageGeneratorController {

	@Value("${server.port}")
	private int port;

	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/info")
	public ResponseEntity<String> fetchMessage() {
		
		LocalDateTime ldt=LocalDateTime.now();

		int hour=ldt.getHour();
		String body=null;

		if(hour<12) {
			body="Good morning";
		}
		else if(hour<16) {
			body="Good afternoon";
		}
		else if(hour<20) {
			body="Good evening";
		}
		else  {
			body="Good night";
		}

		return new ResponseEntity<String>("Your wish message is "+body+" :) .....  : using instace:-> "+instanceId+
				" @port: "+port,HttpStatus.OK);

		
	}
}
