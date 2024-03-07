package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CustomerLogin extends Customers{
	
	@FindBy(xpath="(//button[@class=\"btn btn-primary btn-lg\"])[1]")
	WebElement custLoginButton;
	
	@FindBy(xpath="//label[text()=\"Your Name :\"]")
	WebElement yournametag;
	
	@FindBy(id="userSelect")
	WebElement namelist;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	@FindBy(xpath="//span[@class='fontBig ng-binding']")
	WebElement nametag;
	@FindBy(xpath="//strong[@class='ng-binding'][1]")
	WebElement accountno;
	@FindBy(xpath="//strong[@class='ng-binding'][2]")
	WebElement balance;
	@FindBy(xpath="//strong[@class='ng-binding'][3]")
	WebElement currency;
	
	public CustomerLogin(){
		PageFactory.initElements(driver, this);
	}
	
	public void navigationOfCustLogin() {
		Assert.assertEquals("XYZ Bank", driver.getTitle());
		System.out.println("User on Login Page");
		custLoginButton.click();
		Assert.assertTrue(yournametag.isDisplayed());
		System.out.println("User navigate to Customer login page");
		
		Select drop =new Select(namelist);
		Assert.assertTrue(namelist.isDisplayed());
		drop.selectByVisibleText("Diksha Gaikwad");
		Assert.assertTrue(loginbutton.isEnabled());
		loginbutton.click();
		Assert.assertTrue(nametag.isDisplayed());
		String username=nametag.getText();
		Assert.assertEquals(username, "Diksha Gaikwad");
		System.out.println("Welcome page with Valid userName :"+ username);
		System.out.println("User on Welcome page");
		String acc=accountno.getText();
		
		Assert.assertEquals(acc, "1016");
		String curr=currency.getText();
		
		Assert.assertEquals(curr, "Rupee");
	   System.out.println("Details are correct");
	   
		
		
		
		
	}
	
	
	
	
	
	

}
