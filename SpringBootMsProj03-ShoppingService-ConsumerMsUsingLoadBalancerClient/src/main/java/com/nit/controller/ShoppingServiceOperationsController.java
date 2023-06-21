package com.nit.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceConsumerClient client;

	@GetMapping("/cart")
	public ResponseEntity<String> doShopping() {
		// use client comp
		String resultMsg = client.getBillingInfo();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Shopping the items(shirt, trouser)::" + resultMsg, HttpStatus.OK);
	}
}
