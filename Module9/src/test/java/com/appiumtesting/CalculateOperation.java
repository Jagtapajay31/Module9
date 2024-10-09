package com.appiumtesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CalculateOperation {
	@Test
	public void operation() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "realme RMX2195");
		cap.setCapability("udid","ddaabb9f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability( "appPackage","com.dencreak.dlcalculator");
		cap.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UIAutomator2");
		
		URL url=new URL("http://127.0.0.1:4723/");
		
		AppiumDriver driver=new AppiumDriver(url, cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
//		Addition
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_c_a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click(); // =
		Thread.sleep(2000);
		String msg= driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		Thread.sleep(2000);
		
		System.out.println("addition is :"+ msg);
		
		
		//Subtraction
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();//7
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click(); //8
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_c_d")).click(); //-
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_a")).click(); //1
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click(); // =
		Thread.sleep(2000);		
		String msg1= driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		Thread.sleep(2000);
		
		System.out.println("subtraction is :"+ msg1);

		
		//Multiplication
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click(); //7
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click(); //8
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_b_d")).click(); //*
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_c")).click();  //3
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click(); // =
		Thread.sleep(2000);		
		String msg2= driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		Thread.sleep(2000);
		
		System.out.println("Multiplication is :"+ msg2);

		
		//Division
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click(); //7
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_b")).click(); //8
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_a_d")).click(); // /
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_d_c")).click();  //3
		Thread.sleep(2000);
		driver.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click(); // =
		Thread.sleep(2000);		
		String msg3= driver.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
		Thread.sleep(2000);
		
		System.out.println("Division is :"+ msg3);

	}

}
