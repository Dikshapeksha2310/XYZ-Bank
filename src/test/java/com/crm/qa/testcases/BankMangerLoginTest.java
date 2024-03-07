package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.BankManagerLogin;

public class BankMangerLoginTest extends BankManagerLogin {
	BankManagerLogin bankmgrlogin;
	
	public BankMangerLoginTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		bankmgrlogin = new BankManagerLogin();	
	}
	@Test
	public void bankmgerLogintest() {
		bankmgrlogin.loginNavigation();
		System.out.println("Navigation SUcess");
		System.out.println(driver.getTitle());
		 Assert.assertEquals(driver.getTitle(), "XYZ Bank");
		System.out.println("user Inside welcome page of bank manager login ");
		
		
	}
	
}
