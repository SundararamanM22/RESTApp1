package com.practice.restapplication1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.restapplication1.service.RESTApplication1Service;

@RestController
public class RESTApplication1Controller {
	@Autowired
	RESTApplication1Service rSer;
	
	@GetMapping(value = "/RESTApplication/status")
	public String status() {
		return rSer.status();
	}
	
	@GetMapping(value = "/display")
	public String display() {
		return "REST Application 1 is running from REST Application 2";
	}
}
