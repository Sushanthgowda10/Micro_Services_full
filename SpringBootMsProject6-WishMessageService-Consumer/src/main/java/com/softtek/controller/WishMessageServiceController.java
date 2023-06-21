package com.softtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.client.WishMessageGeneratorServiceRestConsumer;

@RestController
@RequestMapping("/wish/message/api")
public class WishMessageServiceController {

	@Autowired
	private WishMessageGeneratorServiceRestConsumer client;

	@GetMapping("/youmessage")
	public String displayShoppingDeatails(){
		System.out.println("HospitalServiceController.displayShoppingDeatails()");

		return "Wish message service ..."+client.fetchInsuranceDetails();
	}
}
