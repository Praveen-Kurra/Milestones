package com.utilities;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.resuable.GetDate;


/**
 * @author M1088236
 *
 */
public class GetExtentReports {
	
public 	ExtentReports reports;
public 	ExtentSparkReporter spark;
public GetExtentReports(WebDriver driver) {
	
	File fis=new File("./ExtentReports/"+GetDate.getDatetimeFormat()+".html");
	reports=new ExtentReports();
	spark=new ExtentSparkReporter(fis);
	spark.config().setDocumentTitle("Mindtree");
	reports.attachReporter(spark);
	
	Capabilities capabilities=((RemoteWebDriver)driver).getCapabilities();
	
	reports.setSystemInfo("Browser Name",capabilities.getBrowserName());
	reports.setSystemInfo("Browser Version",capabilities.getBrowserVersion());
	reports.setSystemInfo("OS",System.getProperty("os.name"));
	reports.setSystemInfo("Java Version",System.getProperty("java.version"));
	
}	
	
	

}
