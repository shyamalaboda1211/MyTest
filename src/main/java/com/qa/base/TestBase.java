package com.qa.base;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase{
	
	public AndroidDriver mobileDriver;
	public String appiumServer = "localhost";
	public int appiumPort = 4723;
	URL appiumURL = null;
	
	
	
	public AndroidDriver initializeDriver()
	{
		try {
			appiumURL =new URL("http://" + appiumServer + ":" + appiumPort + "/wd/hub");
			this.mobileDriver = new AndroidDriver(appiumURL,setAppCapabilitiesAndroid());
			}
		catch(Exception e) {
			e.printStackTrace();			
		}
		return mobileDriver;
		
	}
    
	private DesiredCapabilities setAppCapabilitiesAndroid() {
		String appApkFilePath = "C:\\Users\\rohit\\Downloads\\app-release.apk";
		
		DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
        cap.setCapability(MobileCapabilityType.FULL_RESET, true);
        cap.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        cap.setCapability(MobileCapabilityType.APP, appApkFilePath);
        return cap;
	}
	
	
	
	
	

}
