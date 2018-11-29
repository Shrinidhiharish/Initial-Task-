package seleniumdemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)//this is to invoke cucumber framework
@CucumberOptions(features= {"File/cucumber.feature"},glue= {"defpackage"},
plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json" })//to configure feature file path and attaching the step definition file.
public class Configclass {

}
