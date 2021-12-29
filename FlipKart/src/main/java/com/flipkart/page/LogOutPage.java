package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class LogOutPage extends BaseClass{
	
	@FindBy(xpath="(//div[@class='exehdJ'])[1]")
	WebElement profileHover;
	
	@FindBy(xpath="(//a[@class='_2kxeIr'])[10]")
	WebElement logOut;
	
	public LogOutPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void logOut() {
		Actions action=new Actions(driver);
		action.moveToElement(profileHover);
		action.build().perform();
		action.moveToElement(logOut);
		action.click().build().perform();
	}

}
