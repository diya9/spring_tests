package com.demo.spring_tests.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_tests.model.CoverageRequest;
import com.demo.spring_tests.services.PartyService;

@RestController
public class PartyController {
	
	@Autowired
	private PartyService partyService;

	@PostMapping(path="/save", consumes= {})
	public void saveContract(@RequestBody CoverageRequest request){
		partyService.saveContract(request);
	}
	
	
}
