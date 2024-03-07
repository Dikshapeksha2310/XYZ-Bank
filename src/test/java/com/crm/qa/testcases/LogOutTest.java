package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddCustomer;
import com.crm.qa.pages.BankManagerLogin;
import com.crm.qa.pages.CustomerLogin;
import com.crm.qa.pages.Customers;
import com.crm.qa.pages.DepositPage;
import com.crm.qa.pages.LogoutPage;
import com.crm.qa.pages.OpenAccount;
import com.crm.qa.pages.TransactionPage;
import com.crm.qa.pages.WithdrawalPage;

public class LogOutTest extends TestBase {
	BankManagerLogin bankmgrlogin;
	AddCustomer addcustomer;
	OpenAccount openacc;
	Customers cust;
	CustomerLogin custLogin;
	DepositPage deposit;
	WithdrawalPage withdraw;
	TransactionPage transaction;
	LogoutPage logout;
	public LogOutTest(){
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
		withdraw=new WithdrawalPage();
		transaction=new TransactionPage();
		logout =new LogoutPage();
		}
	@Test
	public void logoutTest() {
		bankmgrlogin.loginNavigation();
		addcustomer.addcustPage();
		openacc.openaccProcess();
		openacc.invalidDataForopenacc();
		cust.customerDetailsCheck();
		cust.navigaeToHome();
		custLogin.navigationOfCustLogin();
		deposit.validinvalidDeposit();
		withdraw.withdrawlProcess();
		transaction.transactionProcess();
		logout.logoutProcess();
		
	}
}
