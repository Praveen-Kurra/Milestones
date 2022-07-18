package milestone2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				".\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://indianbookworms.com/");

		driver.findElement(By.id("searchinput")).sendKeys("Ocean");

		driver.findElement(By.xpath("//input[@id='searchinput']/following-sibling::*")).click();



		driver.findElement(
				By.xpath("//div[@class='block pl-5 relative col-span-8']//h2[contains(text(),'The Ocean of Churn')]"))
				.click();

		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@class='sale-btn group']//span[contains(text(),'Book Chor')]")).click();

		String publisher = driver.findElement(By.xpath(
				"//td[@class='datasheet-features-type' and contains (text(),'Publisher')]/parent::tr//td[2]//span"))
				.getText();
		String pages = driver.findElement(By.xpath(
				"//td[@class='datasheet-features-type' and contains (text(),'Pages')]/parent::tr//td//span[contains(text(),'312')]"))
				.getText();

		System.out.println(publisher);
		System.out.println(pages);

		WebElement ele = driver.findElement(By.xpath("//a[@class='dropdown-toggle']//strong"));

		Actions a = new Actions(driver);

		a.moveToElement(ele).perform();

		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//ul[@class='nopadding']//li[4]//a")).click();

		driver.findElement(By.xpath("//div[@class='checkbox-list'][2]//label[3]//input")).click();

		driver.findElement(By.xpath(
				"//ul[@class='list-unstyled list-inline pull-right']//li[@class='hidden-sm hidden-xs hidden-md']//a"))
				.click();

		driver.findElement(By.xpath("//div[@class='form-group']//input[@id='login_phone']")).sendKeys("2345653234");

		driver.findElement(By.xpath("//div[@class='form-group']//button[@id='lg_ph']")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//div[@class='close-btn']//a//img")).click();

		Thread.sleep(5000);
		driver.quit();

	}

}
