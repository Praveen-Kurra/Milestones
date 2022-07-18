package com.pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcPrivacyPolicyUi {
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	
	public WebElement privacyLocator;
	
	
	@FindBy(xpath = "//a[@title='Privacy Promise']")
	
	public WebElement promisesLocator;

}
