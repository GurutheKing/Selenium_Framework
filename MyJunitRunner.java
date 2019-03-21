package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDefinitions",
		format= {"pretty", "html: html-docs", "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict=false
		)

public class MyJunitRunner {

}
