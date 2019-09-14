package org.poc.bdd.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.poc.bdd.behavior.SimpleBehaviors;
import org.poc.bdd.behavior.ComplexBehaviors;

public class StateObject {

	WebDriver driver;
	Actions actions;
	Action action;
	SimpleBehaviors basicBehaviors;
	ComplexBehaviors complexBehaviors;
}
