package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.InvalidAddustomer;

public class InavalidAddCustomerTest extends TestBase {
	BankManagerLogin bankmgrlogin;
	InvalidAddustomer invalidaddcustomer;
	
	public  InavalidAddCustomerTest() {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		bankmgrlogin = new BankManagerLogin();	
		invalidaddcustomer=new InvalidAddustomer();
		
	}
	@Test
	public void additionofCustomer() {
		bankmgrlogin.loginNavigation();
		invalidaddcustomer.addCustInvalidData();
		
		
	}
}
