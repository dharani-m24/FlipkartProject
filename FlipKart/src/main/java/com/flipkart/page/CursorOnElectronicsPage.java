package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class CursorOnElectronicsPage extends BaseClass{


	@FindBy(xpath="(//div[@class='eFQ30H'])[5]")
	WebElement hoverElectronics;
	
	public CursorOnElectronicsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void hover() {
		Actions action=new Actions(driver);
		action.moveToElement(hoverElectronics);
		action.build().perform();
	}
	

}
