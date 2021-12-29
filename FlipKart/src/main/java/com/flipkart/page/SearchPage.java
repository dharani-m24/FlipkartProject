package com.flipkart.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class SearchPage extends BaseClass {
	
	@FindBy(xpath="//input[@class='_3704LK']")
	WebElement searchInput;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct() throws InterruptedException {
		searchInput.click();
		searchInput.sendKeys("Mobile",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
	}

}
