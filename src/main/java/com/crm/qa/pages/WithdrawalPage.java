package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WithdrawalPage extends DepositPage {
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	WebElement withdrawbutton;
	@FindBy(xpath="//label[text()='Amount to be Withdrawn :']")
	WebElement head;
	@FindBy(xpath="//input[@ng-model='amount']")
	WebElement amountwithdraw;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//span[@ng-show='message']")
	WebElement msg;
	
	
	public WithdrawalPage(){
		PageFactory.initElements(driver, this);
	}
	public void withdrawlProcess() {
		withdrawbutton.click();
		Assert.assertTrue(head.isDisplayed());
		System.out.println("User On Withdrwal page");
		amountwithdraw.sendKeys("5500");
		System.out.println("Amount Entered");
		submit.click();
		Assert.assertTrue(msg.isDisplayed());
		System.out.println(msg.getText());
		//invalid 
		amountwithdraw.sendKeys("888888");
		System.out.println("Amount Enter");
		submit.click();
		Assert.assertTrue(msg.isDisplayed());
		System.out.println(msg.getText());
		
	}
	
	
	
}
