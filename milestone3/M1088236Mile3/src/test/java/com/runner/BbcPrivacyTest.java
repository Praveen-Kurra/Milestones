package com.runner;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.BbcPrivacyPage;
import com.utilities.BaseClass;

public class BbcPrivacyTest extends BaseClass {

	
	
	@Test
	public void privacyTest(Method method) throws InterruptedException {
		
		
	   log.info(method.getName()+" is being executed");
		
		logger = report.createTest(this.getClass().getName()+"::"+method.getName());
		
		logger.assignAuthor("Praveen");
		
		BbcPrivacyPage privacyPage=new BbcPrivacyPage(driver);
		
		privacyPage.clickPrivacyPolicy();
		Thread.sleep(5000);
		
		String reult=privacyPage.getResults();
		
		log.info("Checking results");
		if(reult.contains(config.getData("TestThreeResult"))) {
			
			Assert.assertTrue(true);
			log.info(this.getClass().getName() + "::" + method.getName() +"    is sucessfully Executed");
		}
		else {
			Assert.assertFalse(false);
			log.warn(this.getClass().getName() + "::" + method.getName()+"   is failed");
		}
		
		log.info(this.getClass().getName()+"::"+method.getName()+"  is Finished");
	}
}
