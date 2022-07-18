package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageUi.FooterUi;

public class FooterPage extends FooterUi {
	WebDriver driver;

	public FooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickStylish() {
		WebElement footer=	driver.findElement(By.id("footerContent"));

	    int links=footer.findElements(By.tagName("a")).size(); 
	    
	    for (int i = 1; i < 2; i++) {
	    	
	        String linksToOpen = Keys.chord(Keys.CONTROL, Keys.ENTER);
	        
	        footer.findElements(By.tagName("a")).get(i).sendKeys(linksToOpen);
	    }
	}

	public void switchTabs() {
		Set<String>handles=driver.getWindowHandles();

		Iterator<String> window=handles.iterator();
		
		  String parent=window.next();
		  
		  String Chind=window.next();
		  
		  driver.switchTo().window(Chind);
		
	}
	
	
	
	
	public String getresults() {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(results));
		
		return results.getText();
	}
}
