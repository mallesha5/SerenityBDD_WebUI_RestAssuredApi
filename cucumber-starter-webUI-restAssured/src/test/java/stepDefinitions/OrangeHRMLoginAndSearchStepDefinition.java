package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import pages.Dashboard;
import pages.Directory;
import pages.HomePage;

public class OrangeHRMLoginAndSearchStepDefinition {
	
	@Steps
	HomePage home;
	
	@Steps
	Dashboard dash;
	
	@Steps
	Directory dir;
	
	@Given("The user navigates to OrangeHRM page")
	public void user_is_on_home_page() {
		home.openApplication();
	}

	@When("The user enters {string} as username")
	public void the_user_enters_as_username(String username) {
	    home.enterUsername(username);
	}

	@When("The user enters {string} as password and clicks on login button")
	public void the_user_enters_as_password_and_clicks_on_login_button(String password) {
		home.enterPassword(password);
		home.clickOnLoginButton();
	}

	@Then("The user should be able to login")
	public void user_should_be_able_to_login() {
	   dash.verifyLogin();
	}
	
	@When("The user navigates to Directory page")
	public void the_user_navigates_to_directory_page() {
	    dir.verifyDirectoryPage();
	}
	
	@Then("The user should be able to search for employee {string}")
	public void the_user_should_be_able_to_search_for_employee(String empName) throws Exception {
	    dir.searchEmployee(empName);
	}
	
	@When("The user clicks on Logout button")
	public void user_clicks_log_out() {
	   //do nothing
	}
	
	@Then("The user successfully logs out")
	public void user_successfully_logs_out() {
	   dir.clickLogout();
	}

}
