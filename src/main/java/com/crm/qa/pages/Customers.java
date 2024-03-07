package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Customers extends OpenAccount {

	
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	WebElement customersbutton;
	
	@FindBy(xpath="//div[@class='marTop ng-scope']")
	WebElement box;
	
	@FindBy(xpath="//button[@ng-click='deleteCust(cust)']")
	WebElement deleteaftersearch;
	
	@FindBy(xpath="(//button[@ng-click='deleteCust(cust)'])[1]")
	WebElement delete;
	
	@FindBy(xpath="//input[@ng-model='searchCustomer']")
	WebElement searchbar;
	
	@FindBy(xpath="	//tr[@class='ng-scope']")
	WebElement searchvalidate;
	
	@FindBy(xpath="//td[text()='Potter']")
	WebElement aftersearch;
	
	@FindBy(xpath="//table[@class='table table-bordered table-striped']")
	WebElement blank;
	
	@FindBy(xpath="//button[@class='btn home']")
	WebElement homebutton;
	
	public Customers(){
		PageFactory.initElements(driver, this);
	}
	
	public void customerDetailsCheck() {
		customersbutton.click();
		Assert.assertTrue(box.isDisplayed()); 
		System.out.println("User navigate to customer page");
	
		 delete.click();
		 System.out.println("Customer data deleted");
		 //after deletion this data not shown in customers data so we use false 
		// Assert.assertFalse(afterdel.isDisplayed());
		 //for search
		 
		 searchbar.click();
		 searchbar.sendKeys("Harry");
		 System.out.println("Data Enter for Search");
		 Assert.assertTrue(aftersearch.isDisplayed());
		 System.out.println("data search");
		 deleteaftersearch.click();
		 Assert.assertTrue(blank.isDisplayed());
		 System.out.println("deleted!!!");
		 
	}
	public void navigaeToHome(){
		
		homebutton.click();
		Assert.assertEquals("XYZ Bank",driver.getTitle() );
		System.out.println("User navigate To Home Page");
	
		
	}

	
	
	
}
