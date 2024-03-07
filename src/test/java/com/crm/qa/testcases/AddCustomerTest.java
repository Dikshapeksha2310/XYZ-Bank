package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.AddCustomer;
import com.crm.qa.pages.BankManagerLogin;

public class AddCustomerTest extends AddCustomer {
	BankManagerLogin bankmgrlogin;
	AddCustomer addcustomer;
	
	public  AddCustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		bankmgrlogin = new BankManagerLogin();	
		addcustomer=new AddCustomer();
		
	}
	@Test
	public void additionofCustomer() {
		bankmgrlogin.loginNavigation();
		addcustomer.addcustPage();
		System.out.println("Customer Added Sucessfully!!");
		
		//addcustomer.addCustInvalidData();
	}
	


	

}
