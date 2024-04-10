package com.practice.restapplication1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RESTApplication1Service {
	@Autowired
	RestTemplate rt;
	
	public String status() {
		String url = "http://3.26.202.168/display";
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, null, String.class);
		String status = response.getBody();		
		return status;
	}
}
