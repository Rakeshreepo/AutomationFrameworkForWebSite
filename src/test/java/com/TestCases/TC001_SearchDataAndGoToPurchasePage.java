package com.TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.CommonFunction.commonFunction;
import com.PageObject.TC001_PageObject;
import com.TestData.TC001_TestData;

public class TC001_SearchDataAndGoToPurchasePage extends baseClass {
	
	@Test
	public void TC001_TestCase()
	{
		try {
			TC001_PageObject objPageObject = new TC001_PageObject(driver);
			
			commonFunction.enterText(objPageObject.searchBox, TC001_TestData.enterTextInSearchBox());
			
			commonFunction.click(objPageObject.clickSearchIcon);
			
			commonFunction.click(objPageObject.clickOnSearchedResult);
			
			commonFunction.switchwindow(driver);
			
			commonFunction.selectDataFromDropDownList(objPageObject.selectValueFromDropDownList, TC001_TestData.selectSizeFromDropDownList());
			
			commonFunction.click(objPageObject.clickOnAddTocart);
			
			commonFunction.click(objPageObject.clickOnGoTocart);
			
			List<String> list = new ArrayList<String>();
			
			for(WebElement priceList: objPageObject.getTextOfPriceAndQunatity) {
				
				if(priceList!=null) {
					
					list.add(priceList.getText());
				}
			}
			
			String quentityOfProduct= list.get(0);
			
			Assert.assertEquals(quentityOfProduct, list.get(0));
			
			System.out.println("Quentity of Product :"+ quentityOfProduct);
			
			String priceOfProduct= list.get(1);
			
			Assert.assertEquals(priceOfProduct, list.get(1));
			
			System.out.println("Price of Product :"+priceOfProduct);
			
			commonFunction.click(objPageObject.clickOnProceedToPay);
			
			commonFunction.takeScreenShot(driver, TC001_TestData.pathOfScreenShot());
		}
		catch (Exception e) {
			Assert.fail();
			System.out.println(e.getMessage());
		}
		
	}

}
