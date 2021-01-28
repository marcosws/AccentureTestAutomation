package com.accenture.core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.accenture.utils.Common;

public class BasePage {
	
	private WebDriver driver;

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	protected enum Attribute{
		Id, Xpath, TagName, Name, ClassName, CssSelector;
	}
	
	private WebElement getElement(Attribute attribute, String value) {
		
		switch(attribute) {
			case Id:
				return driver.findElement(By.id(value));
			case Xpath:
				return driver.findElement(By.xpath(value));
			case TagName: 
				return driver.findElement(By.tagName(value));
			case Name: 
				return driver.findElement(By.name(value));
			case ClassName:
				return driver.findElement(By.className(value));
			case CssSelector:
				return driver.findElement(By.cssSelector(value));
		}
		return null;
		
	}
	
	protected String getTextElement(Attribute attribute, String value) {
		WebElement webElement = this.getElement(attribute, value);
		return webElement.getText();
	}
	
	protected void selectElement(Attribute attribute, String value, String text) {
		Select select = new Select(this.getElement(attribute, value));
		select.selectByVisibleText(text);
	}
	
	protected void editElement(Attribute attribute, String value, String text) {
		WebElement webElement = this.getElement(attribute, value);
		webElement.clear();
		webElement.sendKeys(text);
	}
	
	protected void clickElement(Attribute attribute, String value) {
		WebElement webElement = this.getElement(attribute, value);
		webElement.click();
	}
	protected void selectElement(Attribute attribute, String value, boolean checked) {
		WebElement webElement = this.getElement(attribute, value);
		if(checked != webElement.isSelected()) {
			webElement.click();
		}
	}
	
	protected String getNameElement(Attribute attribute, String value) {
		WebElement webElement = this.getElement(attribute, value);
		return webElement.getAttribute("name");
	}
	
	protected boolean waitElement(Attribute attribute, String value, int timeOutSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver,timeOutSeconds);
		WebElement webElement = null;
		try {
			if(attribute.equals(Attribute.Id)){
				webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id(value)));
			}
			else if(attribute.equals(Attribute.ClassName)){
				webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.className(value)));
			}
			else if(attribute.equals(Attribute.Name)){
				webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name(value)));
			}
			else if(attribute.equals(Attribute.TagName)){
				webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.tagName(value)));
			}
			else if(attribute.equals(Attribute.Xpath)){
				webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
			}
			else if(attribute.equals(Attribute.CssSelector)){
				webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(value)));
			}
		}
		catch(Exception e) {
			return false;
		}
		return webElement.isDisplayed();
	}
	
	protected void openDialog(String path) {
		Common.sleep(3000);
		Common.sendString(path);
	}
	
}
