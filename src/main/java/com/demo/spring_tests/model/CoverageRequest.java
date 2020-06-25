package com.demo.spring_tests.model;

public class CoverageRequest {

	private String contractId;
	private String contractNumber;
	private String workflowid;
	private Person person;
	private Person driver;
	
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getWorkflowid() {
		return workflowid;
	}
	public void setWorkflowid(String workflowid) {
		this.workflowid = workflowid;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Person getDriver() {
		return driver;
	}
	public void setDriver(Person driver) {
		this.driver = driver;
	}
		
}
