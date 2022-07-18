package stepDefnition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProductsPage;
import reusable.BaseClass;
import reusable.Browser;
import utility.Screenshots;

public class ProductsStepDefnition extends BaseClass {
	
	ProductsPage products;
	
	@Before
	public void Initialize(Scenario scenario) {
		
		
		log.info("Initializing all the methods");
		
		setUp();
		
		initialize();
		test=report.createTest(scenario.getName()+"::test1");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		exreport.addSystemenvironment(driver);
		report.flush();
		Browser.quitBrowser(driver);
		
		log.info("Closing the browser"+" after this "+scenario.getName());
		
	}
	
	
	@Given("i am on the Gillette HomePage")
	public void i_am_on_the_gillette_home_page() {
		test=report.createTest("This is Products test");

		driver.get(config.getData("Url"));
		
		log.info("Landing on home page");
	}
	
	@And("i mouseHover on Products")
	public void i_mouse_hover_on_products() {

	 products=new ProductsPage(driver);
	 
	 products.gotoProducts();
	 
	 log.info("Clicking on products");
	 
	}
	
	@When("I click on MCHE3 under Brands")
	public void i_click_on_mche3_under_brands() {
		
          products.clickMacheThree();
		
	}
	
	@Then("It should navigates to Mache3 Page")
	public void it_should_navigates_to_mache3_page() {
		
       log.info("Navigated sucessfully");
		
	}
	
	@And("check Gillette MACH3 Turbo is displayed or not")
	public void check_gillette_mach3_turbo_is_displayed_or_not() {
		
		
		String result=products.getResults();
		
		if(result.contains(config.getData("testOneResult"))) {
			
			test.pass("test is passes");
			
			test.addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			
			log.info("test case is passed");
		}
		else {
		  test.fail("test case failed");
		  
			test.addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			
			log.warn("test case is failed");
		}
	
	}

}
