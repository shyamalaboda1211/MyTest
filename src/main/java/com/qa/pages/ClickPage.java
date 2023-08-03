package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.base.TestBase;


import io.appium.java_client.android.AndroidDriver;

public class ClickPage extends TestBase{
	
	public AndroidDriver mobileDriver;
	 
	@FindBy(className = "android.widget.Button")
	WebElement clickMeBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='tag_label']")
	WebElement labelText;	
	
	
	public ClickPage(AndroidDriver mobileDriver) {
		this.mobileDriver = mobileDriver;
		PageFactory.initElements(mobileDriver,this);
	}
	public String defaultText() {
		String text=labelText.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("0"))
		{	
			System.out.println("Label is visible as 0");
		}
		else {
			System.out.println("Label is not visible as 0");
		}
		return text;		
		
	}
	public String clickMe()	{	
		
		clickMeBtn.click();
		String text1=labelText.getText();
		return text1;
		
	}
	
	
	
	

}
