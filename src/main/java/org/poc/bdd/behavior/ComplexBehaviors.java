package org.poc.bdd.behavior;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ComplexBehaviors extends CommonCore{

	public ComplexBehaviors() {
		super();
	}
	
	public void moveToElement(WebDriver driver, Actions actions, String type, String value, int xOffset, int yOffset) {
		WebElement element = elementGenerator.getElement(driver, type, value);
		actions.moveToElement(element, xOffset, yOffset);
	}
	
	public void clickAndHold(Actions actions) {
		actions.clickAndHold();
	}
	
	public void moveByOffset(Actions actions, int xOffset, int yOffset) {
		actions.moveByOffset(xOffset, yOffset);
	}
	
	public void mouseRelease(Actions actions) {
		actions.release();
	}
		
	public void performActionChain(Actions actions, Action action) {
		action = actions.build();
		action.perform();
	}
}
