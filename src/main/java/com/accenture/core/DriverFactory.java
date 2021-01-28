package com.accenture.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.accenture.utils.Common;


public class DriverFactory {

	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setNavigator(Browser browser){
		
		switch(browser){
			case IE:
				System.setProperty("webdriver.ie.driver", Common.getPathDriver(browser));
				driver = new InternetExplorerDriver();
				break;
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", Common.getPathDriver(browser));
				driver = new FirefoxDriver();
				break;
			case CHROME:
				System.setProperty("webdriver.chrome.driver", Common.getPathDriver(browser));
				driver = new ChromeDriver();
				break;
			case OPERA:
				System.setProperty("webdriver.opera.driver", Common.getPathDriver(browser));
				driver = new OperaDriver();
				break;
			case EDGE:
				System.setProperty("webdriver.edge.driver", Common.getPathDriver(browser));
				driver = new EdgeDriver();
				break;
		}
	}
	
	public static void killDriver() {
		driver.quit();
	}
	

}
