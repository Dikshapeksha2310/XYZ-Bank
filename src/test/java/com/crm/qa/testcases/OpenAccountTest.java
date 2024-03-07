package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.AddCustomer;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.OpenAccount;

public class OpenAccountTest extends AddCustomer{
	BankManagerLogin bankmgrlogin;
	AddCustomer addcustomer;
	OpenAccount openacc;
	
	public  OpenAccountTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		bankmgrlogin = new BankManagerLogin();	
		addcustomer=new AddCustomer();
		openacc=new OpenAccount();
	}
	@Test
	public void openAccountTestSS() {
		bankmgrlogin.loginNavigation();
		addcustomer.addcustPage();
		System.out.println("Customer Added Sucessfully!!");
		//addcustomer.addCustInvalidData();
		
		openacc.openaccProcess();
		System.out.println("Open account for Customer");
		openacc.invalidDataForopenacc();
		
	}
	}
