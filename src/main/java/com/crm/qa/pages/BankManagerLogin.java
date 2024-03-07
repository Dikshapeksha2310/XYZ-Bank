package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class BankManagerLogin extends TestBase {
	
	@FindBy(xpath="(//button[@class='btn btn-primary btn-lg'])[2]")
	WebElement bankmgerlogin;
	
	public BankManagerLogin(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginNavigation() {
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		String currentUrl=driver.getCurrentUrl();
		//System.out.println("currentUrl***"+currentUrl);
		 Assert.assertEquals(currentUrl, driver.getCurrentUrl());
		 System.out.println("User Redirected to XYZ Bank Application");
		String title=driver.getTitle();
		 //System.out.println("Title of page ="+title);
		 Assert.assertEquals(title, "XYZ Bank");
		 bankmgerlogin.click();
		 System.out.println("Navigate to Bank Manger  welcome page");
		 
	}
 
}
