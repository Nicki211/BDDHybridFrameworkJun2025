package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Dell
 *
 */
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features", glue = { "com.qa.stepdefinations" }, tags = {

		"@BuzzCRUDTest" }, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }, monochrome = true)

//html:target/cucumber-reports (plugin for html report generation)


public class Runner {

}
