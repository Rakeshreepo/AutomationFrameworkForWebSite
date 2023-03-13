package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.TestData.TC001_TestData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(TC001_TestData.getApplicationURL());
		
		
		
	}

	//After method
	@AfterSuite
	public void tearDown()
	{

		//driver.quit();
	}

}
