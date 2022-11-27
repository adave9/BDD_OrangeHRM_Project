package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Selenium_WorkSpace\\BDD_OrangeHRM_Project\\src\\main\\java\\features\\login.feature","C:\\Selenium_WorkSpace\\BDD_OrangeHRM_Project\\src\\main\\java\\features\\addEmployee.feature"},
		//the path of the feature files
		glue= {"stepDefinations"},//step Defination Package Name
		plugin = {"pretty"},
		//"html:test-output"},
		//"jason:jason_output/cucumber.jason"},	  
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		)

	public class TestRunner {

	}