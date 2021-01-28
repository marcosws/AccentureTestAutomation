package com.accenture.context;

import java.util.concurrent.TimeUnit;

import com.accenture.core.Browser;
import com.accenture.core.DriverFactory;

public class ContextApp {
	
	private static final String SAMPLEAPP = "http://sampleapp.tricentis.com/101/app.php";
	
	public static void startAppication() {
		DriverFactory.setNavigator(Browser.IE);
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().get(SAMPLEAPP);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	
	public static void endApplication() {
		DriverFactory.killDriver();
	}

}
