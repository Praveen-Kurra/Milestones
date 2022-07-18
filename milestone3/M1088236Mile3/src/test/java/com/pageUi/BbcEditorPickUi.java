package com.pageUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcEditorPickUi {
	
	//(//span[text()='Travel'])[1]
	
	// (//li[@class='orb-nav-traveldotcom'] //a[@href='https://www.bbc.com/travel'])[1]
	
	@FindBy(xpath = "(//span[text()='Travel'])[1]")
	
	public  WebElement travelIcon;
	
	@FindBy(xpath = "//p[contains(text(),'Editor')]")
	
    public   WebElement EditorText;
	


	
}
