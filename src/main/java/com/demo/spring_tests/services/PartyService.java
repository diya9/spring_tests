package com.demo.spring_tests.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.spring_tests.model.CoverageRequest;
import com.demo.spring_tests.model.Person;

@Service
public class PartyService {

	public boolean getPersons(Person person){
		//List<Person> persons = new ArrayList<>();
		boolean flag;
		if(person.getFirstName() != null && person.getLastName() != null){
			System.out.println("Display Person Records");
			flag= true;
		}else{
			System.out.println("No Record Found!!");
			flag= false;
		}
		return flag;
	}
	
	public void saveContract(CoverageRequest request){
		if(request.getWorkflowid() != null && request.getContractNumber() != null)
			System.out.println("Contract Created!!");
		else
			System.out.println("Please enter all details");
	}
}
