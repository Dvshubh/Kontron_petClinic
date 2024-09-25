package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddingOwner;
import pageObjects.PageObjectManager;
import pageObjects.SpecialityDetails;
import utils.TestContextSetup;

public class specialityDetailsStepdefination {

	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public specialityDetailsStepdefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("Validate the new Spciality Details")
	public void validate_the_new_spciality_details() throws InterruptedException {

		SpecialityDetails sd = testContextSetup.pageObjectManager.getSpecialityDetails();
		sd.clickSpecialityTab();
		sd.addNewSepciality();
	}

	@When("User when launch the URL of the PetClinic.")
	public void user_when_launch_the_url_of_the_pet_clinic() {
		
		
	}

	@Then("Specialities Tab has been displayed")
	public void specialities_tab_has_been_displayed() {
		
	}

}
