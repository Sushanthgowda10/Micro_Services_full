package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceConsumerClient client;

	@GetMapping("/details")
	public String displayShoppingDetails() {
		System.out.println("ShoppingController::client comp class name::" + client.getClass());
		return "Pongal Shopping for family...." + client.fetchBillDetails();
	}
}
