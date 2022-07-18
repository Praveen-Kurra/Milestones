package stepDefnition;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FooterPage;
import reusable.BaseClass;
import utility.Screenshots;

public class FooterStepdefnition extends BaseClass {
	FooterPage footer;

	@When("i click styling under brands in footer")
	public void i_click_styling_under_brands_in_footer() {
		test=report.createTest("footer stylish test");
	    footer=new FooterPage(driver);

		footer.clickStylish();
		log.info("clicks on stylish under footer section");
	}
	@Then("it should diplays relevent articles")
	public void it_should_diplays_relevent_articles()
	{
		
	      footer.switchTabs();
	      log.info("Switching tabs from parent to child");
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,650)", "");
	      
	      log.info("Scrolling down the window");
	      
	      String text=footer.getresults();
	      
	      if(text.contains(config.getData("testThreeResult"))) {
		test.pass("test is passes");
			
		test.addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
	    	  
	     log.info("test case is passed");
	      }
	      else {
	    	  
	    	  test.fail("test case failed");
			  
				test.addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
	    	log.info("test case failed");
	      }	
	

	}	
}
