package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageUi.SearchUi;

public class SearchPage extends SearchUi {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	public void enterTextIntoSearchBox(String text) {
		searchBox.sendKeys(text,Keys.ENTER);
	}
	
	public String getResults() {
		return results.getText();
	}
}
