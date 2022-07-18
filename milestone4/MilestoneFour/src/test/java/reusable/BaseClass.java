package reusable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import utility.*;

import utility.GetExtentReports;

public class BaseClass  {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static Logger log = LogManager.getLogger(BaseClass.class);
	public static GetExtentReports exreport;
	public static ExcelData excel;
	public static ConfigData config;

	public void initialize() {
		
	
		String BrowserTaken = config.getData("Browser");
		
		log.info("Setting up drivers");
		
		driver = Browser.startBrwser(driver, BrowserTaken);
	
	}

	
	public void setUp() {
		log.info("all classes are instantialtipon");
		excel = new ExcelData();
		config = new ConfigData();
		exreport = new GetExtentReports();
		report = exreport.reports;
		
	}
}
