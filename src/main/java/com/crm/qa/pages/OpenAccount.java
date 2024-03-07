package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OpenAccount extends AddCustomer {

	@FindBy(xpath="//button[@ng-class='btnClass2']")
	WebElement openAcc;
	@FindBy(id="userSelect")
	WebElement yournameList;
	@FindBy(xpath="//option[text()='Diksha Gaikwad']")
	WebElement selecname;
	@FindBy(id="currency")
	WebElement currencyList;
	@FindBy(xpath="//option[text()='Rupee']")
	WebElement selectedCurr;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement process;
	@FindBy(xpath="//select[@ng-model='custId']")
	WebElement required;
	
	

	public OpenAccount(){
		PageFactory.initElements(driver, this);
	}
	
	public void openaccProcess() {
		 Assert.assertTrue(openAcc.isDisplayed()); 
		openAcc.click();
		System.out.println("open acc page entered");
		
		yournameList.click();
		System.out.println("list opens");
		Assert.assertTrue(selecname.isDisplayed()); 
		selecname.click();
		Assert.assertTrue(selecname.isSelected()); 
		System.out.println("Name selected");
		
		Assert.assertTrue(currencyList.isDisplayed()); 
		currencyList.click();
		System.out.println("currency list open");
		selectedCurr.click();
		Assert.assertTrue(selectedCurr.isSelected()); 
		System.out.println("currency selected");
		Assert.assertTrue(process.isDisplayed()); 
		process.click();
		System.out.println("info added sucess");
		org.openqa.selenium.Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		System.out.println("Alert Accepted");
		
	}
	public void invalidDataForopenacc() {
		currencyList.click();
		System.out.println("currency list open");
		selectedCurr.click();
		Assert.assertTrue(selectedCurr.isSelected()); 
		System.out.println("currency selected");
		process.click();
	
		Assert.assertTrue(required.isDisplayed()); 
		//	System.out.println("*********Addded");
		System.out.println(" Error Message display for field validation");
		
	}
	
	
}
