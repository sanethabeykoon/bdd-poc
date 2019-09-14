package org.poc.bdd.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverGenerator {

	public WebDriver getDriver(String driverType) {
		WebDriver driver = null;
		
		switch(driverType) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver","browserdrivers\\geckodriver.exe");
    	
				FirefoxOptions ffoptions = new FirefoxOptions();
				ffoptions.setCapability("marionette", true);
        
				driver = new FirefoxDriver(ffoptions);
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver","browserdrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				System.setProperty("webdriver.gecko.driver","browserdrivers\\geckodriver.exe");
		    	
				FirefoxOptions options = new FirefoxOptions();
				options.setCapability("marionette", true);
        
				driver = new FirefoxDriver(options);
		}
		
		return driver;
	}
}
