package org.poc.bdd.behavior;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleBehaviors extends CommonCore{

	public SimpleBehaviors() {
		super();
	}
	
	public void clickElement(WebDriver driver, String type, String value) {
		WebElement element = elementGenerator.getElement(driver, type, value);
		element.click();
	}
	
	public String getInnerText(WebDriver driver, String type, String value) {
		WebElement element = elementGenerator.getElement(driver, type, value);
		return element.getText();
	}
}
