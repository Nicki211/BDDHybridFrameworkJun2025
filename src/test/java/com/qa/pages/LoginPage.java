package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;

import cucumber.api.Scenario;

/**
 * @author Dell This class has page factory code for OrangeHRM login page
 */
public class LoginPage {

	WebDriver driver;
	Scenario scenario;

	/*
	 * Every Page should have 3 things : 
	 * 1.Page object repository - locate web elements using FindBy annotation 
	 * 2.Page class constructor 
	 * 3.Page operation methods
	 */

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement loginButton;

	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement homepageTitle;

	// page class constructor
	/**
	 * @param driver
	 * @param scenario
	 */
	public LoginPage(WebDriver driver, Scenario scenario) {

		this.driver = driver;
		this.scenario = scenario;
		PageFactory.initElements(driver, this);
	}

	// page operation methods
	/**
	 * @param userName
	 * @param userPassword
	 * @return 
	 * This method will accept username, password and click on login button to see homepage title as "Dashboard"
	 */
	public String logintoApplication(String userName, String userPassword) {

		ElementActions.sendKeys(driver, userNameField, scenario, userName);
		ElementActions.sendKeys(driver, passwordField, scenario, userPassword);
		ElementActions.clickElement(driver, loginButton, scenario);
		
		return ElementActions.getText(driver, homepageTitle, scenario);

	}

}
