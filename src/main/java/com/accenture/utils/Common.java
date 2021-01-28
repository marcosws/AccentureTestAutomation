package com.accenture.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.accenture.core.Browser;

public class Common {
	

	public static String getPathDriver(Browser browser) {
		
		
		String userPath = System.getProperty("user.dir") + "//src//main//resources//drivers";
		String driverPath = "";
		Properties properties = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//properties//driverfactory.properties");
			properties.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		switch(browser) {
			case IE:
				driverPath = userPath.concat(properties.getProperty("driverfactory.driverpath.ie"));
				break;
			case FIREFOX:
				driverPath = userPath.concat(properties.getProperty("driverfactory.driverpath.firefox"));
				break;
			case CHROME:
				driverPath = userPath.concat(properties.getProperty("driverfactory.driverpath.chrome"));
				break;
			case OPERA:
				driverPath = userPath.concat(properties.getProperty("driverfactory.driverpath.opera"));
				break;
			case EDGE:
				driverPath = userPath.concat(properties.getProperty("driverfactory.driverpath.edge"));
				break;
		}
		
		return driverPath;
		
	}
	public static void sendString(String str) {
		try {
			Robot robot = new Robot();
			for(char ch:str.toCharArray()){
				if(ch == ':'){
		            robot.keyPress(KeyEvent.VK_SHIFT);  
		            robot.keyPress(KeyEvent.VK_SEMICOLON);  
		            robot.keyRelease(KeyEvent.VK_SEMICOLON);  
		            robot.keyRelease(KeyEvent.VK_SHIFT);
				}
				else if(Character.isUpperCase(ch)){
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress((int)ch);
					robot.keyRelease((int)ch);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}
				else {
					char upCh = Character.toUpperCase(ch);
					robot.keyPress((int)upCh);
					robot.keyRelease((int)upCh);
				}
			}
			Robot closeRobot = new Robot();
			closeRobot.keyPress(KeyEvent.VK_ENTER);
			closeRobot.delay(1000);
		} 
		catch (AWTException e) {
			e.printStackTrace();
		}

	}
	

	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
