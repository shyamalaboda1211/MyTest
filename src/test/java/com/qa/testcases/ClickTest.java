package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.base.TestBase;
import com.qa.pages.ClickPage;

public class ClickTest extends TestBase{	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
	@BeforeTest
	public void initialize()
	{
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		mobileDriver = initializeDriver();
	}
	@AfterTest
	 public void tearDown()
	 {
		extent.flush();
		this.mobileDriver.quit();
	    
	 }
	
	@Test(description = "Verify label text")
	public void verifyLabelText()	{		
		ExtentTest test = extent.createTest("My Project").assignAuthor("Shyamala").assignCategory("Functional Test").assignDevice("Android");
		test.info("Verifying the label text");
		ClickPage cp = new ClickPage(mobileDriver);
		String defText = cp.defaultText();
		Assert.assertEquals(defText,"0");
		test.pass("Default Label Text is 0");
		String text1 = cp.clickMe();
		Assert.assertEquals(text1,"1");
		test.pass("Label Text after first click is 1");
		String text2 = cp.clickMe();
		Assert.assertEquals(text2,"2");
		test.pass("Label Text after second click is 2");
		String text3 = cp.clickMe();
		Assert.assertEquals(text3,"MAX");
		test.pass("Label Text after third click is MAX");
		
	}	
	
	
	
	
	
}
