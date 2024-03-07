package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TransactionPage extends WithdrawalPage{
	@FindBy(xpath="//button[@ng-click='transactions()']")
	WebElement transButton;
	@FindBy(xpath="//td[a='Transaction Type']")
	WebElement transcType;
	@FindBy(xpath="//td[a='Amount']")
	WebElement amountType;
	@FindBy(xpath="(//td[@class='ng-binding'])[2]")
	WebElement amount1;
	@FindBy(xpath="(//td[@class='ng-binding'])[3]")
	WebElement transtype1;
	@FindBy(xpath="(//td[@class='ng-binding'])[5]")
	WebElement amount2;
	@FindBy(xpath="(//td[@class='ng-binding'])[6]")
	WebElement transtype2;
	@FindBy(xpath="//button[@ng-click='reset()']")
	WebElement resetButton;
	@FindBy(xpath="//button[@ng-click=\"back()\"]")
	WebElement backButton;
	@FindBy(xpath="//strong[text()= Welcome ']")
	WebElement welcomepage;
	
	public TransactionPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void transactionProcess() {
		transButton.click();
		//validation of Transaction page correct amount and transaction type
		Assert.assertTrue(transcType.isDisplayed());
		Assert.assertTrue(amountType.isDisplayed());
		Assert.assertEquals(amount1.getText(), "10500");
		Assert.assertEquals(transtype1.getText(), "Credit");
		System.out.println(transtype1.getText());
		System.out.println(amount1.getText());
		Assert.assertEquals(amount2.getText(), "5500");
		Assert.assertEquals(transtype2.getText(), "Debit");
		System.out.println("User on Transaction Page");
		//click on reset Button
		resetButton.click();
		//after Click Header should be display only
		Assert.assertTrue(transcType.isDisplayed());
		Assert.assertTrue(amountType.isDisplayed());
		System.out.println("Transaction Reset");
		backButton.click();
		

		
	}
	
	
	
	
	
}
