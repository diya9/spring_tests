package com.demo.spring_tests.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_tests.model.Person;
import com.demo.spring_tests.services.PartyService;

@RestController
public class SearchController {

	@Autowired
	PartyService partyService;
	@PostMapping(path="/personInfo", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public void searchPerson(@RequestBody Person person){
		boolean flag = partyService.getPersons(person);
		
		if(flag)
			System.out.println("Display Records...");
		else
			System.out.println("No Record Found!!");
	}
}
