package org.poc.bdd.cucumber;

import cucumber.api.java.en.When;

public class ComplexSteps {
	
	private StateObject stateObject;

    public ComplexSteps(StateObject stateObject) {
        this.stateObject = stateObject;
    }
    
    @When("^Maximize browser window$")
    public void maximize_browser_window() throws Throwable {
    	stateObject.driver.manage().window().maximize();
    }
    
    @When("^Move to element \"([^\"]*)\" \"([^\"]*)\" and place pointer \\+?(-?\\d+) \\+?(-?\\d+)$")
    public void move_to_element_and_place_pointer(String type, String value, int xOffset, int yOffset) throws Throwable {
        stateObject.complexBehaviors.moveToElement(stateObject.driver, stateObject.actions, type, value, xOffset, yOffset);
    }

    @When("^Click and hold$")
    public void click_and_hold() throws Throwable {
    	stateObject.complexBehaviors.clickAndHold(stateObject.actions);
    }

    @When("^Move pointer \\+?(-?\\d+) \\+?(-?\\d+)$")
    public void move_pointer(int xOffset, int yOffset) throws Throwable {
    	stateObject.complexBehaviors.moveByOffset(stateObject.actions, xOffset, yOffset);
    }

    @When("^Release mouse$")
    public void release_mouse() throws Throwable {
    	stateObject.complexBehaviors.mouseRelease(stateObject.actions);
    }

    @When("^Perform action$")
    public void perform_action() throws Throwable {
    	stateObject.complexBehaviors.performActionChain(stateObject.actions, stateObject.action);
    }

}
