package StepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import PropertyFileData.credentails;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import supportingClass.MobileClass;

public class ShoppingBagStepDefinition

{
	WebDriver driver=null;

	@Given("proper url and credentials for user login")
	public void proper_url_and_credentials_for_user_login() throws InterruptedException, IOException {
		credentails.usernamePassword();
    	this.driver=credentails.driver;
		driver.manage().window().maximize();
		
	}

	@When("I search for mobiles and click on search button")
	public void i_search_for_mobiles_and_click_on_search_button() throws InterruptedException, IOException {
		
		MobileClass.mobileStepDefinition();
        
	}

	@Then("I get navigated to webpage containing mobiles")
	public void i_get_navigated_to_webpage_containing_mobiles() {
	    System.out.println("Navigated to page containing mobiles");
 
	}
	
	@Then("I filter the mobile based on different filters by checking different checkboxes")
	public void i_filter_the_mobile_based_on_different_filters_by_checking_different_checkboxes() {
	    System.out.println("yet to implement");
 
	}
	
	@Then("then I sort it based on price")
	public void then_I_sort_it_based_on_price() {
	    System.out.println("yet to implement");
 
	}
	
	@Then("I extract the mobile information after filtering from the results found")
	public void i_extract_the_mobile_information_after_filtering_from_the_results_found() {
	    System.out.println("yet to implement");
 
	}

}
