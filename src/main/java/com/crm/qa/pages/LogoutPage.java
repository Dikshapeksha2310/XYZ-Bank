package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class LogoutPage extends TestBase {
	@FindBy(xpath="//strong[text()=' Welcome ']")
	WebElement welcomepage;
	
	@FindBy(xpath="//button[@ng-show='logout']")
	WebElement Logoutbutton;

	@FindBy(xpath="//button[@ng-click='home()']")
	WebElement HomeButton;
	@FindBy(xpath="//label[text()='Your Name :']")
	WebElement verification;

	public LogoutPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void logoutProcess() {
	
	Assert.assertTrue(welcomepage.isDisplayed());
	System.out.println("User on Welcome Page");
	Logoutbutton.click();
	
	Assert.assertTrue(verification.isDisplayed());
	System.out.println("User Logout");
	HomeButton.click();
	
	Assert.assertEquals(driver.getTitle(), "XYZ Bank");
	System.out.println("User on Home Page");
}
}