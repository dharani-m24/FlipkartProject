package com.flipkart.testExecution;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.Data.LoginData;
import com.flipkart.base.BaseClass;
import com.flipkart.page.ClickOnFlightsPage;
import com.flipkart.page.CursorOnElectronicsPage;
import com.flipkart.page.LogOutPage;
import com.flipkart.page.LoginFailedPage;
import com.flipkart.page.LoginPage;
import com.flipkart.page.NavigationToDifferentProductPage;
import com.flipkart.page.SearchPage;
import com.flipkart.page.SelectMenTShirtPage;
import com.flipkart.page.SelectRemoteControlToysPage;
import com.flipkart.page.VerfiyLabelsAndControls;
import com.flipkart.page.VerifyLogoPage;

public class MainTestExecution {

	BaseClass base;
	LoginData data;

	@BeforeMethod
	public void initialization() {
		base = new BaseClass();
		base.launchBrowser();

		System.out.println("Lauched Successfully");

	}

	@Test(priority = 0)
	public void verifylogo() {
		VerifyLogoPage image = new VerifyLogoPage();
		image.verifylogo();

	}

	@Test(priority = 1)
	public void loginFailed() {
		LoginFailedPage login = new LoginFailedPage();
		login.loginFailed();
	}

	@Test(priority = 2)
	public void login() {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());
	}

	@Test(priority = 3)
	public void Navigation() throws InterruptedException {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());

		NavigationToDifferentProductPage navigation = new NavigationToDifferentProductPage();
		navigation.verifyingNavigationtoProducts();

	}

	@Test(priority = 4)
	public void cursorOnElectronics() {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());

		CursorOnElectronicsPage page = new CursorOnElectronicsPage();
		page.hover();
	}

	@Test(priority = 5)
	public void searchProduct() throws InterruptedException {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());

		SearchPage search = new SearchPage();
		search.searchProduct();
	}

	@Test(priority = 6)
	public void selectFlights() throws InterruptedException {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());

		ClickOnFlightsPage flights = new ClickOnFlightsPage();
		flights.clickOnFlights();
	}

	@Test(priority = 7)
	public void selectToys() throws InterruptedException {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());

		SelectRemoteControlToysPage select = new SelectRemoteControlToysPage();
		select.selectRemoteControlToy();

	}

	@Test(priority = 8)
	public void selectTshirt() {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());

		SelectMenTShirtPage tShirt = new SelectMenTShirtPage();
		tShirt.selectMenTshirt();
	}

	@Test(priority = 9)
	public void logOut() {
		LoginPage login = new LoginPage();
		data = new LoginData();
		login.signIn(data.getNum(), data.getpass());
		LogOutPage logOut = new LogOutPage();
		logOut.logOut();
	}
	
	@Test(priority=10, enabled=false)
	public void verifyLabelAndContol() {
		VerfiyLabelsAndControls controls=new VerfiyLabelsAndControls();
		controls.verifyingLinks();
		controls.verifyingButtons();
		controls.verifyingLabels();
		
	}

	@AfterMethod
	public void closeBrowser() {
		base.closeBrowser();
	}

}
