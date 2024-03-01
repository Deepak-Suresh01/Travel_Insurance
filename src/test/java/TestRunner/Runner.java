package TestRunner;
//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(features={".//FeatureFile/policybazaar.feature"},
	glue= {"StepDefination"},plugin=/* {"pretty","html:Reports/myreports.html",
												"rerun:target/rerun.txt",
												"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}*/
	{"pretty", "html:reports/myreportss.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	,
	dryRun = false,
	monochrome = true,
	publish = true
	//tags = "@regression"
	)

public class Runner extends AbstractTestNGCucumberTests{
	
}