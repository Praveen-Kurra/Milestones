package reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import utility.Rwd;



public class Browser {

	

	public static WebDriver startBrwser(WebDriver driver, String browserName) {
	
	DesiredCapabilities	capabilities=Rwd.getCapabilities();
	
	
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
			driver = new ChromeDriver();

		} else if (browserName.equals("Edge")) {
		
			driver=new EdgeDriver();
			

		} else {
			System.out.println("Sorry this browser Doesnt support");
		}

		
		driver.manage().window().maximize();
		
	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Dimension dimension=new Dimension(1000,900);
		
		//driver.manage ().window ().setSize (dimension);
		
		driver.manage().deleteAllCookies();
		
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
}
