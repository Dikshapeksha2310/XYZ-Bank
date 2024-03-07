package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomer extends BankManagerLogin {

	@FindBy(xpath="//button[@ng-class='btnClass1']")
	WebElement AddCust;
	
	@FindBy(xpath="//input[@ng-model='fName']")
	WebElement firstn;
	@FindBy(xpath="//input[@ng-model='lName']")
	WebElement lastn;
	@FindBy(xpath="//input[@ng-model='postCd']")
	WebElement pcode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public AddCustomer(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void addcustPage() {
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		AddCust.click();
		System.out.println("User redirect To Add customer Page");
		String firstName = prop.getProperty("Firstname");
		String lastName = prop.getProperty("Lastname");
		String zipcode=prop.getProperty("postalcode");
		
		 Assert.assertTrue(submit.isDisplayed());
		 System.out.println("Add Customer page is displayed");
		firstn.sendKeys(firstName);
		lastn.sendKeys(lastName);
		pcode.sendKeys(zipcode);
		System.out.println("Information  Entered");
		submit.click();
		org.openqa.selenium.Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		System.out.println("Alert Accepted");
	}
		
			
			
		}
		
		
		
		
	

