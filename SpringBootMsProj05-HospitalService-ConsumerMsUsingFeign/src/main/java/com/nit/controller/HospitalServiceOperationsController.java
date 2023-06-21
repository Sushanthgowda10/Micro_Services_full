package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.client.HospitalServiceConsumerClient;

@RestController
@RequestMapping("/hospital/api")
public class HospitalServiceOperationsController {

	@Autowired
	private HospitalServiceConsumerClient client;

	@GetMapping("/details")
	public String displayShoppingDetails() {
		System.out.println("Hospital Controller::client comp class name::" + client.getClass());
		return "Insurance Claimed...." + client.fetchBillDetails();
	}
}
