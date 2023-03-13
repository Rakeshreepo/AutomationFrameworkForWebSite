package com.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class TC001_PageObject {

	WebDriver pdriver;
	public TC001_PageObject(WebDriver driver)
	{
		pdriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public @FindBy(id="twotabsearchtextbox") WebElement searchBox;
	
	public @FindBy(id = "nav-search-submit-button") WebElement clickSearchIcon;
	
	public @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div") WebElement clickOnSearchedResult;
	
	public @FindBy(name = "dropdown_selected_size_name") WebElement selectValueFromDropDownList;
	
	public @FindBy(id = "add-to-cart-button") WebElement clickOnAddTocart;
	
	public @FindBy(linkText = "Go to Cart") WebElement clickOnGoTocart;
	
	public @FindBys(@FindBy(xpath = "//div[@data-name='Subtotals']/span[text()]")) List<WebElement> getTextOfPriceAndQunatity;
	
	public @FindBy(name = "proceedToRetailCheckout") WebElement clickOnProceedToPay;
}
