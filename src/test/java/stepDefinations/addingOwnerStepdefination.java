package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddingOwner;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

import java.time.Duration;

public class addingOwnerStepdefination {

	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public addingOwnerStepdefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	// Background step definition
	@Given("User should be available on the PetClinic Page")
	public void user_should_be_available_on_the_pet_clinic_page() {
		System.out.println("User is on the PetClinic Page");
	}

	@When("Launch the browser from the config variables")
	public void launch_the_browser_from_the_config_variables() {
		System.out.println("Browser is launched using the config variables");
	}

	@When("User should be on PetClinic home page.")
	public void user_should_be_on_pet_clinic_home_page() {
		System.out.println("User is on PetClinic home page");
	}

	@Given("User is on the PetClinic home page.")
	public void user_is_on_the_pet_clinic_home_page() throws InterruptedException {
		AddingOwner addingOwner = testContextSetup.pageObjectManager.getAddingOwner();
		addingOwner.ownerTabDisplayed();
	}

	@When("User when launches the URL of the PetClinic.")
	public void user_when_launches_the_url_of_the_pet_clinic() {
		AddingOwner addingOwner = testContextSetup.pageObjectManager.getAddingOwner();
		addingOwner.ownerTabDisplayed();

	}

	@Then("Owners tab has been displayed.")
	public void owners_tab_has_been_displayed() {
		AddingOwner addingOwner = testContextSetup.pageObjectManager.getAddingOwner();
		addingOwner.ownerTabClick();

	}

	@And("User can click on ADD NEW link")
	public void user_can_click_on_add_new_link() {
		AddingOwner addingOwner = testContextSetup.pageObjectManager.getAddingOwner();
		addingOwner.clickOnAddNew();

	}

	@Then("New Owner with {string}, {string}, {string}, {string}, and {string} should be added.")
	public void new_owner_with_and_should_be_added(String firstName, String lastName, String address, String city,
			String telephone) {

		AddingOwner addingOwner = testContextSetup.pageObjectManager.getAddingOwner();
		addingOwner.newDetailsofOwner(firstName, lastName, address, city, telephone);

	}
}
