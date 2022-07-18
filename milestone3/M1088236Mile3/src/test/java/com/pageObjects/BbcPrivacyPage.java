package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageUi.BbcPrivacyPolicyUi;

public class BbcPrivacyPage  extends BbcPrivacyPolicyUi{
	
	WebDriver driver;
	
	public BbcPrivacyPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	
	public void clickPrivacyPolicy() {
		
		privacyLocator.click();
	}
	
	public String getResults() {
		return promisesLocator.getText();
	}
}
