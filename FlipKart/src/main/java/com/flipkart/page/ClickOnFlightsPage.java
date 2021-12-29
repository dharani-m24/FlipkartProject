package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class ClickOnFlightsPage extends BaseClass {
	
	@FindBy(xpath="(//div[@class='eFQ30H'])[8]")
	WebElement flights;
	
	@FindBy(xpath = "//img[@class='_2xm1JU']")
	WebElement logoImage;
	
	public ClickOnFlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFlights() throws InterruptedException {
		flights.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

}
