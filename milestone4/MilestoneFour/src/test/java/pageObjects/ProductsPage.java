package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageUi.ProductsUi;

public class ProductsPage extends ProductsUi{
	
	WebDriver driver;
	
	public ProductsPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void gotoProducts() {
		Actions action=new Actions(driver);
		
		action.moveToElement(products).perform();
	}
	
	public void clickMacheThree() {
		mache3.click();
	}
	
	public String getResults() {
	return	results.getText();
	}
}
