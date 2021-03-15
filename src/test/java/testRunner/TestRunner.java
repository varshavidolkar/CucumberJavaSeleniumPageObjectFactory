package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"stepDefinations"},


monochrome=true,

plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/cucumber.json",
		"html:target/HtmlReports.html"},
tags = "@SmokeTest"
)
public class TestRunner {

}
