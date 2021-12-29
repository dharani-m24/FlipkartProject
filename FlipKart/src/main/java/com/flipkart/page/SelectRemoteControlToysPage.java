package com.flipkart.page;



import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class SelectRemoteControlToysPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='eFQ30H'][9]")
	WebElement hoverOnBaby;
	
	@FindBy(xpath="(//a[@class='_6WOcW9'])[5]")
	WebElement hoverOnToys;
	
	@FindBy(xpath="(//a[@class='_6WOcW9 _3YpNQe'])[2]")
	WebElement clickRemoteToys;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")
	WebElement clickToy;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement clickAddToCart;
	
	@FindBy(xpath="//button[@class='_2KpZ6l FYrnUt']")
	WebElement closePopUp;
	
	
	
	public SelectRemoteControlToysPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectRemoteControlToy() throws InterruptedException {
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hoverOnBaby);
		
		action.build().perform();
		Thread.sleep(2000);
		action.moveToElement(hoverOnToys);
		action.build().perform();
		Thread.sleep(2000);
		action.moveToElement(clickRemoteToys);
		action.click().build().perform();
		clickToy.click();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		closePopUp.click();
		clickAddToCart.click();
		driver.switchTo().window(tabs.get(1)).close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		driver.navigate().back();
		
	
		
		
		
	
		
		
	}
}
