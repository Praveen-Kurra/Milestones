package pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchUi {

	
	@FindBy(id="searchIconId")
	protected WebElement searchIcon;
	
	@FindBy(id="search-box-input")
	protected WebElement searchBox;
	
	@FindBy(xpath = "//h1[contains(text(),'Results For')]")
	protected WebElement results;
}
