package utility;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Feature"},glue= {"StepDefinition"},plugin = { "pretty"})

public class configuration extends AbstractTestNGCucumberTests {

}
