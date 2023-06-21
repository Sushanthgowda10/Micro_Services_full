package com.nit.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {

	@Autowired
	private DiscoveryClient client; // client component comes through auto-configuration

	public String getBillingInfo() {
		// find adn get ServiceInstances of Producer by using service Id
		List<ServiceInstance> listSI = client.getInstances("Billing-Service");

		// use first ServiceInstance from the list of instances
		ServiceInstance instance = listSI.get(0);

		// get Producer MS URI and make it as URL
		String url = instance.getUri() + "/billing/info";

		// create RestTemplate object
		RestTemplate template = new RestTemplate();

		// invoke the Producer MS Service method or operation by generating HTTP Call
		String response = template.getForObject(url, String.class);

		return response;
	}

}
