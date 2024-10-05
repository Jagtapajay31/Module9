package com.appiumtesting;
/*
 * 1) Write an Appium Program to connect with emulator and open APIdemo.app application on your emulator
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ApiDemoOpen {
	public AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeTest
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver driver;

		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("ajay");
		options.setApp("E:\\Tops 2024\\appium\\apk file-20240916T045753Z-001\\apk file\\ApiDemos-debug.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		 Thread.sleep(2000);
	}
	
	@AfterTest
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();			
	}
}
