package com.qa.stepdefinations;

import com.qa.base.Base;
import com.qa.pages.LoginPage;
import com.qa.util.CaptureScreenshot;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Dell
 * This class has all the test cases with steps to execute the test cases
 */
public class EmployeeCRUD extends Base {

	Scenario scenario;
	LoginPage objLoginPage;
	
	/**
	 * @param scenario Before hook to login to app
	 */
	@Before
	public void logintoApplication(Scenario scenario){
		this.scenario = scenario;
	}
	/**
	 * @throws Throwable
	 */
	@Given("^Navigate to PIM after log in with Admin user$")
	public void navigate_to_PIM_after_log_in_with_Admin_user() throws Throwable {
		
		scenario.write("Starting the Orange HRM application in browser");
		driver=initializeWebDriver();
		Thread.sleep(5000);
		scenario.embed(CaptureScreenshot.captureImage(driver), "image/png");
	    throw new PendingException();
	}

	/**
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @throws Throwable
	 */
	@When("^I Add employee with  first name as \"([^\"]*)\" and mname as \"([^\"]*)\" and lName as \"([^\"]*)\"$")
	public void i_Add_employee_with_first_name_as_and_mname_as_and_lName_as(String arg1, String arg2, String arg3) throws Throwable {
	    
	    throw new PendingException();
	}

	/**
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @throws Throwable
	 */
	@Then("^I  verify employeeAdded in list with  first name as \"([^\"]*)\" and mname as \"([^\"]*)\" and lName as \"([^\"]*)\"$")
	public void i_verify_employeeAdded_in_list_with_first_name_as_and_mname_as_and_lName_as(String arg1, String arg2, String arg3) throws Throwable {
	   
	    throw new PendingException();
	}

	/**
	 * @param arg1
	 * @throws Throwable
	 */
	@When("^I click on Edit button and update below values and save the Data$")
	public void i_click_on_Edit_button_and_update_below_values_and_save_the_Data(DataTable arg1) throws Throwable {
	    
	    throw new PendingException();
	}

	/**
	 * @param arg1
	 * @throws Throwable
	 */
	@Then("^I search the employee and ensure that it is searched using below values$")
	public void i_search_the_employee_and_ensure_that_it_is_searched_using_below_values(DataTable arg1) throws Throwable {
	    
	    throw new PendingException();
	}

	/**
	 * @throws Throwable
	 */
	@Then("^I select and Delete the Updated Employee and verify employee is not  in search result$")
	public void i_select_and_Delete_the_Updated_Employee_and_verify_employee_is_not_in_search_result() throws Throwable {
	    
	    throw new PendingException();
	}

	/**
	 * @param scenario After hook to close the app
	 */
	@After

	public void closeApplication(Scenario scenario) {
		
		scenario.write("Closing the application");

		closeBrowser();
	}
}

