package com.flipkart.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.BaseClass;

public class LoginFailedPage extends BaseClass {

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

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[3]/span")
	WebElement validationMessage;

	public LoginFailedPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginFailed() {
		if (closePopup.isDisplayed()) {
			closePopup.click();
		}
		loginBtn.click();
		userName.sendKeys("812492624");
		password.sendKeys("Dharani24");
		submit.click();

		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actTitle = driver.getTitle();
		if (expectedTitle.contains(actTitle)) {
			System.out.println("Title is matched");
		} else {

			String actualMessage = validationMessage.getText();
			System.out.println(actualMessage);
		}

	}

}
