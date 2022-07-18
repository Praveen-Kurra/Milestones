package com.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageUi.BbcCricketUi;

public class BbcCricketPage extends BbcCricketUi {

	WebDriver driver;
	
	public BbcCricketPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSearchIcon() {
		searchIcon.click();
		
	}
	
	public void enterTextIntoSearchBox(String text) {
		enterIntoSearchIcon.sendKeys(text,Keys.ENTER);
	}
	
	public String getResults() {
		return searchResults.getText();
	}
}
