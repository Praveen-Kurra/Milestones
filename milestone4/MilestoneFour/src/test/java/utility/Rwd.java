package utility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Rwd {

	public static  DesiredCapabilities getCapabilities() {
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();

		mobileEmulation.put("deviceName", "iPhone XR");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();

		chromeOptions.put("mobileEmulation", mobileEmulation);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		
		capabilities.setCapability("screen-resolution", "1280x1024");

		return capabilities;

	}
}
