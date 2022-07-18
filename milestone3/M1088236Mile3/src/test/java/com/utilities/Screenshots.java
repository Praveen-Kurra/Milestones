package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.resuable.GetDate;



/**
 * @author M1088236
 *
 */
public class Screenshots {
	/**
	 * 
	 * @param driver
	 * @return returns a string path where the screen shot is actually stored
	 */
	public static String CaptureScreenShot(WebDriver driver) {
		
	    File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("./ScreenShots/"+GetDate.getDatetimeFormat()+".png");
	    
	   
	    
	    try {
	    	FileUtils.copyFile(src, dest);

		} catch (IOException e) {
			System.out.println("unable to Caputure ScreenShot");
		}
	return  dest.getAbsolutePath();
	}

}
