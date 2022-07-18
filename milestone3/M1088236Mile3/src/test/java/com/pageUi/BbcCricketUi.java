package com.pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcCricketUi {
	
	@FindBy(id="orbit-search-button")  
	public WebElement searchIcon;
	
	@FindBy(id="search-input") 
	public WebElement enterIntoSearchIcon;
	
	@FindBy(xpath = "(//span[contains(text(),'Cricket')])[2]") 
	public WebElement searchResults;

}
