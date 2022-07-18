package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageUi.BbcEditorPickUi;

public class BbcEditorPickPage  extends BbcEditorPickUi{
	WebDriver driver;
	
	public BbcEditorPickPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	
	public void clickTravelIcon() {
		
		travelIcon.click();
	}
	
	public String editorsGetText() {
		
	return	EditorText.getText();
	
	}
}
