package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.flipkart.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement closePopup;
	 

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement userName;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement submit;

	@FindBy(xpath = "//div[text()='Dharani']")
	WebElement accountHolderName;

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void signIn(String uName, String pass) {

		
		  if(closePopup.isDisplayed())
		  { 
			  closePopup.click();
			  }
		 
			System.out.println("Performing");
			loginBtn.click();
			userName.sendKeys(uName);
			System.out.println("hi"+uName);
			password.sendKeys(pass);
			System.out.println("hi"+pass);
			submit.click();
			
		
		
		System.out.println("Logined Successfully");
		String actualName = accountHolderName.getText();
		 System.out.println(actualName);
		String expectedName = "Dharani";
		Assert.assertEquals(actualName, expectedName);

	}

}
