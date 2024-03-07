package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.AddCustomer;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.CustomerLogin;
import com.crm.qa.pages.Customers;
import com.crm.qa.pages.DepositPage;
import com.crm.qa.pages.OpenAccount;

public class DepositTest extends CustomerLogin{
	BankManagerLogin bankmgrlogin;
	AddCustomer addcustomer;
	OpenAccount openacc;
	Customers cust;
	CustomerLogin custLogin;
	DepositPage deposit;
	
	public DepositTest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		bankmgrlogin = new BankManagerLogin();	
		addcustomer=new AddCustomer();
		openacc=new OpenAccount();
		cust=new Customers();
		custLogin=new CustomerLogin();
		deposit=new DepositPage();
		}
	@Test
	public void depositProcess() {
		bankmgrlogin.loginNavigation();
		addcustomer.addcustPage();
		openacc.openaccProcess();
		openacc.invalidDataForopenacc();
		cust.customerDetailsCheck();
		cust.navigaeToHome();
		custLogin.navigationOfCustLogin();
		deposit.validinvalidDeposit();
		
	}
}
