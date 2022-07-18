package com.runner;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.BbcEditorPickPage;
import com.utilities.BaseClass;

public class BbcEditorPickTest extends BaseClass {

	@Test
	public void editorPickTest(Method method) {

		log.info(method.getName() + " is being executed");

		logger = report.createTest(this.getClass().getName() + "::" + method.getName());

		logger.assignAuthor("Praveen");

		BbcEditorPickPage editorPage = new BbcEditorPickPage(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		editorPage.clickTravelIcon();

		Duration d = Duration.ofSeconds(30);
		
		WebDriverWait wait = new WebDriverWait(driver, d);

		wait.until(ExpectedConditions.visibilityOf(editorPage.EditorText));

		String result = editorPage.editorsGetText();

		if (result.equals(config.getData("TestOneResult"))) {

			Assert.assertTrue(true);
			log.info(this.getClass().getName() + "::" + method.getName() +"    is sucessfully Executed");
			
		} else {
			Assert.assertTrue(false);
			log.warn(this.getClass().getName() + "::" + method.getName()+"   is failed");
		}

		
		log.info(this.getClass().getName()+"::"+method.getName()+"  is Finished");
	}

}
