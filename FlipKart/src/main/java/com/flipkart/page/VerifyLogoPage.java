package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class VerifyLogoPage extends BaseClass {

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement closePopup;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div")
	WebElement logoImage;

	public VerifyLogoPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifylogo() {

		closePopup.click();

		if (logoImage.isDisplayed()) {

			System.out.println("Logo is clearly visible");

		} else {
			System.out.println("Logo is invisible");
		}
	}

}
