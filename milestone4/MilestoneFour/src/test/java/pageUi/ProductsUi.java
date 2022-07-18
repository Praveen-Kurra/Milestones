package pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsUi {
	
	@FindBy(css = "button[title='Products']")
	protected WebElement products;
	
	@FindBy(xpath = "//div[text()='By Brands']/following-sibling::a[@title='MACH3']")
	protected WebElement mache3;
	
    @FindBy(xpath="//div[contains(text(),'With sharper, Turbo cutting blades')]")
    protected WebElement results;

}
