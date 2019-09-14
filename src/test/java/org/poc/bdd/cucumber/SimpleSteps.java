package org.poc.bdd.cucumber;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleSteps {

	private StateObject stateObject;

    public SimpleSteps(StateObject stateObject) {
        this.stateObject = stateObject;
    }
	
	@When("^Click element \"([^\"]*)\" \"([^\"]*)\"$")
    public void click_element(String type, String value) throws Throwable {
    	stateObject.basicBehaviors.clickElement(stateObject.driver, type, value);
    }
		
	@Then("^Verify innerText \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void verify_innerText(String type, String value, String textToVerify, String errorMsg) throws Throwable {
		String actualText = stateObject.basicBehaviors.getInnerText(stateObject.driver, type, value);
    	Assert.assertEquals(errorMsg, textToVerify, actualText);
	}
}
