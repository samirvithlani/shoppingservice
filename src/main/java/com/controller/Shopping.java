package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Shopping {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/payment/{price}")
	public String invokePayment(@PathVariable int price) {

		String url = "http://client/paynow/" + price;

		return restTemplate.getForObject(url, String.class);
	}

}
