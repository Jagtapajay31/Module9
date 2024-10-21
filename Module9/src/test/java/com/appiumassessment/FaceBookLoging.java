package com.appiumassessment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FaceBookLoging extends BaseClass {
	
	@Test
	public void loging() throws InterruptedException {
		
		//click Allow
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/"
				+ "android.widget.ScrollView/android.widget.LinearLayout/"
				+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
		Thread.sleep(2000);
		
		//click create account
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[2]/android.view.ViewGroup/"
				+ "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.View")).click();
		Thread.sleep(2000);
	
		
		//click next
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		//fill the name
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView[1]")).sendKeys("Jason");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView[2]")).sendKeys("mike");
		Thread.sleep(2000);
		
		//click nextbutton
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		//click allow
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/\"\r\n"
				+ "				+ \"android.widget.ScrollView/android.widget.LinearLayout/\"\r\n"
				+ "				+ \"android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
		Thread.sleep(2000);
		
		//click number button
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		//click DOB
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[3]/"
				+ "android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View[5]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[9]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[9]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[8]/android.view.View")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/"
				+ "android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.view.View[2]")).click();
		Thread.sleep(2000);
		
		//password
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.MultiAutoCompleteTextView")).sendKeys("Tops@123");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		
		//sign up
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout[2]/android.view.ViewGroup[4]/android.view.ViewGroup[7]/android.view.ViewGroup")).click();
		
		
		driver.quit();
	}
}
