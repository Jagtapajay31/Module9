package com.appiumassessment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	public AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeTest
	public void test() throws MalformedURLException, InterruptedException {
//		service=new AppiumServiceBuilder()
//				.withAppiumJS(new File("C:\\Users\\os\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1")
//				.usingPort(4723)
//				.build();
//		service.start();
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("ajay");
//		options.setApp("E:\\Tops 2024\\appium\\apk file-20240916T045753Z-001\\apk file\\ApiDemos-debug.apk");
//		options.setApp("E:\\Tops 2024\\appium\\apk file-20240916T045753Z-001\\apk file\\General-Store.apk");
//		options.setApp("E:\\Tops 2024\\appium\\apk file-20240916T045753Z-001\\apk file\\instagram-254-0-0-19-109.apk");
		options.setApp("E:\\Tops 2024\\appium\\apk file-20240916T045753Z-001\\apk file\\facebook_lite_v321.0.0.13.113.apk");
		 driver=new AndroidDriver
				(new URL("http://127.0.0.1:4723/"),options);
		 Thread.sleep(2000);		 
	}
	public void dragndrop(WebElement source) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 719,
			    "endY", 960));
	}
	
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.15
			));		
	}
//	public void seekbar(WebElement slider) {
//		
//		int xAxisStartPoint=slider.getLocation().getX();
//		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
//		int yAxisStartPoint=slider.getLocation().getY();
//		
//		
//		TouchAction action=new TouchAction(driver);
//		
//		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
//		.moveTo(PointOption.point(xAxisEndPoint-100,yAxisStartPoint))
//		.release()
//		.perform();
//
//		
//		int xAxisStartPoint=slider.getLocation().getX();
//		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
//		int yAxisStartPoint=slider.getLocation().getY();
//		
//		
//		TouchAction action=new TouchAction(driver);
//		
//		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
//		.moveTo(PointOption.point(xAxisEndPoint-50,yAxisStartPoint))
//		.release()
//		.perform();
//		
//		//Get start point of seekbar.
//	       int startX = seekBar.getLocation().getX();
//	       System.out.println(startX);
//	    
//	      //Get vertical location of seekbar.
//	       int startY = seekBar.getLocation().getY();
//	       System.out.println(startY);
//	    
//	       //Get end point of seekbar.
//	       int endX = seekBar.getSize().getWidth();
//	       System.out.println(endX);
//	    
//	    
//	       //Set seekbar move to position.
//	       //endX * 0.6 means at 60% of seek bar width.
//	      //endX * 0.9 means at 100% of seek bar width.
//	       int moveToXDirectionAt = (int) (endX * 0.90);
//	       System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
//	    
//	       //Moving seekbar using TouchAction class.
//	       TouchAction act=new TouchAction(driver);
//	       act.press(PointOption.point(startX,startY)).moveTo(PointOption.point(moveToXDirectionAt,startY)).release().perform();
//	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();			
	}


}
