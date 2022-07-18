package stepDefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;
import reusable.BaseClass;
import utility.Screenshots;

public class SearchStepdefnition extends BaseClass {
	SearchPage search;
	
	@Given("i click on search icon")
	public void i_click_on_search_icon() {
	  test=report.createTest("search test");
		search=new SearchPage(driver);
		
	  search.clickSearchIcon();
	  
	  log.info("It clicks on search icon");
		
	}
	@When("^I enter (.+) and press enter$")
	public void i_enter_razor_and_press_enter(String text) {
	 
		search.enterTextIntoSearchBox(text);
		
		log.info("enter text into search box");
	}
	@Then("It should display Results")
	public void it_should_display_results() {
	
		String results=search.getResults();
		
		if(results.contains(config.getData("testTwoResults"))) {
		test.pass("test is passes");
			
			test.addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			
			log.info("test case is passes");
		}else {
			
			  test.fail("test case failed");
			  
			test.addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			log.warn("test case is failed");
		}
		
		
	}

}
