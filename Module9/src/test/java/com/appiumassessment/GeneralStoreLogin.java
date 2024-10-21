package com.appiumassessment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GeneralStoreLogin extends BaseClass {
	
	@Test
	public void store() throws InterruptedException {
		
		//username
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ajay");
		Thread.sleep(3000);
		//radio button
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(3000);
		//select country
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Brazil\"));"))
		.click();
		Thread.sleep(5000);
		
		//click login button
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		
		//Add product to cart
		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Nike Blazer Mid '77\"));"))
		.click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
		Thread.sleep(2000);
		//view product
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(2000);
	}
}
