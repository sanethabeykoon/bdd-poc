package org.poc.bdd.common;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ElementGenerator {
		
	public WebElement getElement(WebDriver driver, String type, String value) {
		WebElement element = null;
		
		switch (type) {
		  case "id":
			element = driver.findElement(By.id(value));
		    break;
		  case "name":
			element = driver.findElement(By.name(value));
		    break;
		  case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
		}
		
		return element;
	}
	
	public List<WebElement> getElements(WebDriver driver, String type, String value) {
		List<WebElement> elementList = null;
		
		switch (type) {
		  case "tagname":
			  elementList = driver.findElements(By.tagName(value));
		    break;
		  case "xpath":
			  elementList = driver.findElements(By.xpath(value));
			break;
		}
		
		return elementList;
	}
	
}
