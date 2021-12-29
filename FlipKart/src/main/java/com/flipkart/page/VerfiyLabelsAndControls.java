package com.flipkart.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.flipkart.base.BaseClass;



public class VerfiyLabelsAndControls extends BaseClass {
	
	public void verifyingLinks(){
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++){
			String link=links.get(i).getText();
			System.out.println("No of Links in a Homepage is:"+link);
		}
		
	}
	public void verifyingButtons(){
		List<WebElement> button=driver.findElements(By.tagName("button"));
		for(int i=0;i<button.size();i++){
			String buttons=button.get(i).getText();
			System.out.println("No of buttons in a Homepage is:"+buttons);
		}
	}
	public void verifyingLabels(){
		List<WebElement> labels=driver.findElements(By.tagName("label"));
		for(int i=0;i<labels.size();i++){
			String label=labels.get(i).getText();
			System.out.println("No of labels in a Homepage is:"+label);
		}
	}

}
