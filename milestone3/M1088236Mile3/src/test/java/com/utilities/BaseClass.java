package com.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


/**
 * @author M1088236
 *
 */
public class BaseClass {
	public WebDriver driver;
	public ConfigData config;
	public ExcelData excel;
	public ExtentReports report;
	public ExtentTest logger;
	public ExtentSparkReporter spark;
	

	public static Logger log = LogManager.getLogger(BaseClass.class);

	@BeforeSuite
	public void initialize() {
		excel = new ExcelData();
		config = new ConfigData();
		excel = new ExcelData();


		log.info("Intilizing all the Methods");
	}

	@BeforeClass
	public void setUp() {
		String BrowserTaken = config.getData("Browser");
		String UrlFromConfig = config.getData("Url");

		driver = Browser.startBrwser(driver, BrowserTaken, UrlFromConfig);
		log.info("Setting Up Browser");
		GetExtentReports exreport=new GetExtentReports(driver);
		   report=exreport.reports;

	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			Screenshots.CaptureScreenShot(driver);

			logger.pass("Passed").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			 Screenshots.CaptureScreenShot(driver);

			log.info("Passed the Test Case");

		} else if (result.getStatus() == ITestResult.FAILURE) {
			Screenshots.CaptureScreenShot(driver);
			logger.fail("Failed ").addScreenCaptureFromPath(Screenshots.CaptureScreenShot(driver));
			log.warn("This is Failed");
		}
		Browser.quitBrowser(driver);
		
	}

	@AfterSuite
	public void Clear() {
		report.flush();
		log.info("Finished Extent Report");

	}

}
