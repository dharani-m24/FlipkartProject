package com.flipkart.util;

import com.flipkart.base.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot extends BaseClass {
	
	public static String getscreenshotpath(String Testcasename) throws IOException {
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\reports\\"+Testcasename+".png";
		File file=new File(path);
		FileUtils.copyFile(source,file);
		 System.out.println("The screenshot is taken");
		return path;

}

}
