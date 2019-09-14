package org.poc.bdd.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.poc.bdd.behavior.ComplexBehaviors;
import org.poc.bdd.behavior.SimpleBehaviors;
import org.poc.bdd.common.DriverGenerator;

public class CommonSteps {

	private StateObject stateObject;

    public CommonSteps(StateObject stateObject) {
        this.stateObject = stateObject;
    }
    
    @Given("^Environment is set up \"([^\"]*)\" \"([^\"]*)\"$")
    public void environment_is_set_up(String driverType, String url) throws Throwable {
    	stateObject.driver = new DriverGenerator().getDriver(driverType);
    	
    	stateObject.actions = new Actions(stateObject.driver);
    	stateObject.basicBehaviors = new SimpleBehaviors();
    	stateObject.complexBehaviors = new ComplexBehaviors();
    	
    	stateObject.driver.get(url);
    }
    
    @When("^Wait execution \"([^\"]*)\" (\\d+)$")
    public void wait_execution(String timeUnit, int value) throws Throwable {
    	stateObject.driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
    }
    
    @Then("^Close browser$")
    public void close_browser() throws Throwable {
        
    }
}
