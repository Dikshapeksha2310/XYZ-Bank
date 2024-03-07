package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DepositPage extends CustomerLogin {
	
	@FindBy(id="accountSelect")
	WebElement account;
	
	@FindBy(xpath="//button[@ng-click='deposit()']")
	WebElement depositbutton;
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement reqfield;
	//input[@class="form-control ng-touched ng-dirty ng-invalid ng-invalid-required"]
	@FindBy(xpath="//label[text()='Amount to be Deposited :']")
	WebElement head;
	@FindBy(xpath="//input[@ng-model='amount']")
	WebElement amount;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//span[@ng-show='message']")
	WebElement msg;
	
	public DepositPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void validinvalidDeposit() {
		String accno=account.getText();
		Assert.assertEquals(accno, "1016");
		System.out.println("valid Account Number");
		//for Invalid data 
		depositbutton.click();
		Assert.assertTrue(reqfield.isDisplayed());
		String errormsg=reqfield.getText();
		System.out.println(errormsg);
		//valid Data 
	    depositbutton.click();
		Assert.assertTrue(head.isDisplayed());
		System.out.println("user On deposit page");
		String am=prop.getProperty("amountdeposit");
		amount.sendKeys(am);
		System.out.println("Amount Added");
		submit.click();
		Assert.assertTrue(msg.isDisplayed());
		String text=msg.getText();
		System.out.println("user get message: "+text);
		
	}

}
