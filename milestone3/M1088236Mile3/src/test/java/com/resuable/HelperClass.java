package com.resuable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelperClass {
	WebDriver driver;
	public HelperClass(WebDriver driver) {
		this.driver=driver;
	}

	
	public void clickOperation(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void sendText(By element,String text) {
		try {
			driver.findElement(element).sendKeys(text);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	
	public void mousehover(WebElement ele) {
		try {
			Actions action=new Actions(driver);
			action.moveToElement(ele).perform();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
