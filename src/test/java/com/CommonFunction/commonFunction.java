package com.CommonFunction;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class commonFunction {
	
	public static WebDriverWait wait;
	public static WebDriver driver;
	
	
	public static void enterText(WebElement locaElement, String value)
	{
		locaElement.sendKeys(value);

	}
	
	public static void click(WebElement locaElement) {
		locaElement.click();

	}
	
	public static void switchwindow(WebDriver driver) {
		
		String parent = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver. getWindowHandles();
		
		System.out.println(allWindowHandles.toString());
		
		Iterator<String> I1= allWindowHandles.iterator();
		
        while(I1.hasNext()) {
        	String child_window = I1.next();
        	if(!parent.equals(child_window)) {
        		driver.switchTo().window(child_window);
        		System.out.println("Child window URL: "+driver.switchTo().window(child_window).getCurrentUrl());
        	}
        }
	}
	
	public static void selectDataFromDropDownList(WebElement locaElement, String text) {
		
		Select select = new Select(locaElement);
		select.selectByVisibleText(text);
	}
	
	public static String getText(WebElement localElement) {
		return localElement.getText();
	}
	
	public static void takeScreenShot(WebDriver webdriver,String fileWithPath) {
		
		try {
		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 
		 File DestFile=new File(fileWithPath);
		 
		 FileUtils.copyFile(SrcFile, DestFile);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
