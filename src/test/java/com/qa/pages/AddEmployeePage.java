package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.ElementActions;
import com.qa.util.WaitMethods;

import cucumber.api.Scenario;

/**
 * @author Dell 
 * This class has page factory code for PIM page
 *
 */
public class AddEmployeePage {
	WebDriver driver;
	Scenario scenario;
	
	// Page object repo

		@FindBy(xpath = "//span[text()='PIM']")
		WebElement pimPageLink;

		@FindBy(xpath = "//button[text()=' Add ']")
		WebElement addEmpButton;

		@FindBy(xpath = "//input[@name='firstName']")
		WebElement firstNameField;

		@FindBy(xpath = "//input[@name='middleName']")
		WebElement middleNameField;

		@FindBy(xpath = "//input[@name='lastName']")
		WebElement lastNameField;

		@FindBy(xpath = "//button[text()=' Save ']")
		WebElement saveButton;
		
		// page repo for search emp

		@FindBy(xpath = "//a[text()='Employee List']")
		WebElement empListPageLink;

		@FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
		WebElement searchByEmpNamefield;

		@FindBy(xpath = "//button[normalize-space()='Search']")
		WebElement empSearchButton;

		@FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/child::div[3]/child::div[1]")
		WebElement searchedEmpFandMname;
		
		// page class constructor
		/**
		 * @param driver
		 * @param scenario
		 */
		public AddEmployeePage(WebDriver driver, Scenario scenario) {

			this.driver = driver;
			this.scenario = scenario;
			PageFactory.initElements(driver, this);
		}
		
		// page operation method
		/**
		 * 
		 */
		public void navigateToPimPage() {
			ElementActions.clickElement(driver, pimPageLink, scenario);
		}
		
		/**
		 * @param fName
		 * @param mName
		 * @param lName
		 * This method will accept all the fields and click on login button to see homepage title as "Dashboard"
		 * @throws InterruptedException 
		 */
		public void addnewEmployee(String fName, String mName,String lName) throws InterruptedException{
			
			ElementActions.clickElement(driver, addEmpButton, scenario);
			WaitMethods.staticWait(5000);
			ElementActions.sendKeys(driver, firstNameField, scenario, fName);
			ElementActions.sendKeys(driver, middleNameField, scenario, mName);
			ElementActions.sendKeys(driver, lastNameField, scenario, lName);
			ElementActions.clickElement(driver, saveButton, scenario);
		
		}

		/**
		 * 
		 */
		public void navigateToEmpListPage(){
			ElementActions.clickElement(driver, empListPageLink, scenario);
		}
		
		/**
		 * @param fName
		 * @param mName
		 * @return
		 */
		public  String searchEmp(String fName,String mName){
			
			ElementActions.sendKeys(driver, searchByEmpNamefield, scenario, fName+mName);
			ElementActions.clickElement(driver, empSearchButton, scenario);
			return ElementActions.getText(driver, searchedEmpFandMname, scenario);
		}
}
