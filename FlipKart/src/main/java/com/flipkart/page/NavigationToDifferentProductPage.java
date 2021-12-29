package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.BaseClass;

public class NavigationToDifferentProductPage extends BaseClass {
	
	@FindBy(xpath="(//div[@class='eFQ30H'])[1]")
    WebElement Topoffers;
    @FindBy(xpath="(//div[@class='eFQ30H'])[2]")
    WebElement groceries;
    @FindBy(xpath="(//div[@class='eFQ30H'])[3]")
    WebElement mobiles;
    
    
    public WebElement getMobiles() {
		return mobiles;
	}




	public NavigationToDifferentProductPage() {
        PageFactory.initElements(driver, this);
    }
   
  
    
    
    public void verifyingNavigationtoProducts() throws InterruptedException{
        Topoffers.click();
       
        Thread.sleep(2000);
        driver.navigate().back();
        groceries.click();
        Thread.sleep(2000);
        driver.navigate().back();
        mobiles.click();
        Thread.sleep(2000);
        driver.navigate().back();
       
    }

}
