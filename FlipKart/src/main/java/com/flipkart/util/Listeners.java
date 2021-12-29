package com.flipkart.util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.flipkart.base.BaseClass;
import com.flipkart.extendReport.ExtendReport;

public class Listeners extends BaseClass implements ITestListener {
	
	WebDriver driver=null;

	ExtentTest test;

	ExtentReports extent = ExtendReport.getReportObject();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

		test.log(Status.PASS, "success");

		System.out.println(" Test execution " + result.getMethod().getMethodName() + " Passed...");

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		System.out.println(" Test execution " + result.getMethod().getMethodName() + " failed...");

		try {
			TakeScreenshot.getscreenshotpath(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

		// extent.flush();

	}

}
