package com.appiumtesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.offset.PointOption;

/*
 * 2) Write an Appium Program to connect with Realdevice and open APIdemo.app application on your
realdevice.
 */
public class RealDevice {
	public AndroidDriver driver;
	AppiumDriverLocalService service;
	@Test
	public void devices() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "realme RMX2195");
		cap.setCapability("udid","ddaabb9f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability( "appPackage","io.appium.android.apis");
		cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
		public void longPressAction(WebElement ele)
		{
			((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
					ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
							"duration",2000));
		}
		public void seekbar(WebElement slider) {
			
			int xAxisStartPoint=slider.getLocation().getX();
			int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
			int yAxisStartPoint=slider.getLocation().getY();
			
			
			TouchAction action=new TouchAction(driver);
			
			action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
			.moveTo(PointOption.point(xAxisEndPoint-100,yAxisStartPoint))
			.release()
			.perform();
			
}
}