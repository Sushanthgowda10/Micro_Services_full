package com.softtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.client.JustTicketServiceRestConsumer;

@RestController
@RequestMapping("/theater/api")
public class TheaterServiceController {

	@Autowired
	private JustTicketServiceRestConsumer client;

	@GetMapping("/yourmovie")
	public String displayShoppingDeatails(){
		System.out.println("HospitalServiceController.displayShoppingDeatails()");

		return "Your movie service ..."+client.fetchTicketDetails();
	}
}
