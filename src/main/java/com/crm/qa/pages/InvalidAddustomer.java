package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class InvalidAddustomer extends TestBase {

	
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
	public InvalidAddustomer(){
		PageFactory.initElements(driver, this);
	}
	public void addCustInvalidData() {
		AddCust.click();
		System.out.println("Button click");
		String firstName = prop.getProperty("FirstnameIN");
		String lastName = prop.getProperty("LastnameIN");
		String zipcode=prop.getProperty("postalcodeIN");
		
		firstn.sendKeys(firstName);
		lastn.sendKeys(lastName);
		pcode.sendKeys(zipcode);
		System.out.println("Information Added");
		
		submit.click();
		
		//System.out.println("Bug");
	//	Assert.assertFalse(driver.getPageSource().contains("Customer added successfully"));
		
	
		org.openqa.selenium.Alert alt1 = driver.switchTo().alert();
	String alertmsg=	alt1.getText();
		
	System.out.println(alertmsg);
	Assert.assertFalse(true);
	System.out.println("Bug");
	//Assert.assertEquals(alt1.getText(),"Customer added successfully with customer id :");
	
		alt1.accept();
		
		
}
}
