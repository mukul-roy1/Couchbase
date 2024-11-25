package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.Couchbase.ReactorBasics;

@RestController
public class ReactorTestController {
	@Autowired
	ReactorBasics reactorBasics;
	
	@RequestMapping("/test")
	public void callRestThing() {
		reactorBasics.tryReactor();
	}
}
