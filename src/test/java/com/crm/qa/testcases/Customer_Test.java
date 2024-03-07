package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.AddCustomer;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.Customers;
import com.crm.qa.pages.OpenAccount;

public class Customer_Test extends OpenAccount {
	BankManagerLogin bankmgrlogin;
	AddCustomer addcustomer;
	OpenAccount openacc;
	Customers cust;
	
	public Customer_Test() {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		bankmgrlogin = new BankManagerLogin();	
		addcustomer=new AddCustomer();
		openacc=new OpenAccount();
		cust=new Customers();
	}
	@Test
	public void CustomerTest() {
		bankmgrlogin.loginNavigation();
		addcustomer.addcustPage();
		openacc.openaccProcess();
		openacc.invalidDataForopenacc();
		cust.customerDetailsCheck();
		cust.navigaeToHome();
		
	}
	
}
