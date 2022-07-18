package pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterUi {

	
	@FindBy(xpath = "//h3[contains(text(),'The Anchor Beard')]")
	protected WebElement results;
	
	@FindBy(css = "a[title='Styling'][class='event_menu_click']")
	protected WebElement styling;
}
