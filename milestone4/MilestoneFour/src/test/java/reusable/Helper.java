package reusable;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Screenshots;

public class Helper extends BaseClass {
	Actions action = new Actions(driver);

	public void click(By element) {

		try {
			driver.findElement(element).click();
		} catch (Exception e) {

		e.printStackTrace();
		}

	}

	public void enterText(By element, String text) {
		try {
			driver.findElement(element).sendKeys(text, Keys.ENTER);
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public String getText(By element) {
		try {
			return driver.findElement(element).getText();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "";
	}

	public void mouseOver(WebElement element) {
		try {
			action.moveToElement(element).perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public WebElement getWebelement(By element) {
		try {
			return driver.findElement(element);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return getWebelement(element);
	}

}
