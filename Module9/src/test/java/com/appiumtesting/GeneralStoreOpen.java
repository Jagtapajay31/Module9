package com.appiumtesting;
/*
 * 3) Write an Appium Program to connect with emulator wit ecommerce based application using
Generalstore.app to perform locators like name, dropdown etc
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GeneralStoreOpen {
	
	public AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeTest
	public void before() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("ajay");
		options.setApp("E:\\Tops 2024\\appium\\apk file-20240916T045753Z-001\\apk file\\General-Store.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		 Thread.sleep(2000);
	}
	
		
		@Test
		public void cart() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ajay");
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Brazil\"));"))
		.click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		}
		
		public  void swipeAction(WebElement ele,String direction) throws InterruptedException { 
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
					"elementId", ((RemoteWebElement)ele).getId(),
				 
				    "direction", direction,
				    "percent", 0.15
				));		
			
		for (int i = 1; i <5; i++) {
			WebElement ele1 =driver.findElement(By.xpath("//android.widget.LinearLayout["+i+"]"));
			Thread.sleep(2000);
			swipeAction(ele, "up");
			Thread.sleep(2000);
		}
		}


//		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Nike Blazer Mid '77\"));"))
//		.click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		Thread.sleep(2000);
//		
		
	
	@AfterTest
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();		
	}

}
