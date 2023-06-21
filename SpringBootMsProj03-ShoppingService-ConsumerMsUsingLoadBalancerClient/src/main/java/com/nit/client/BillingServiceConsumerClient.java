package com.nit.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {

	@Autowired
	private LoadBalancerClient client;

	public String getBillingInfo() {
		// get Billing-service Instance from eureka server based on Load factor
		ServiceInstance instance = client.choose("Billing-Service");

		// get the URI and form the url
		String url = instance.getUri() + "/billing/api/info";

		// Create RestTemplate object
		RestTemplate template = new RestTemplate();
		// invoke the producer MS service Method or operation by generating HTTP
		// call
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		String body = response.getBody();
		
		return body;
	}

}
