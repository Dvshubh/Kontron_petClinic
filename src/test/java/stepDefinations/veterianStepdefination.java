package stepDefinations;

import io.cucumber.java.en.Then;
import pageObjects.AddingOwner;
import pageObjects.PageObjectManager;
import pageObjects.veterianDetails;
import utils.TestContextSetup;

public class veterianStepdefination {

	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public veterianStepdefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@Then("Veterinarians tab has been displayed.")
	public void veterinarians_tab_has_been_displayed() {
	   
	}
	@Then("User can click on ADD NEW link and added the new Veterinarian")
	public void user_can_click_on_add_new_link_and_added_the_new_veterinarian() {
		veterianDetails vd = testContextSetup.pageObjectManager.AddVeterianDetails();
		vd.veterinariansTabDisplayed();
		vd.clickonVeterinariansTab();
		vd.addVeterinariansDetails();
		vd.selectingTypeofVeterian();
	}
	@Then("Added vet shoud be displayed in the added list")
	public void added_vet_shoud_be_displayed_in_the_added_list() {
		veterianDetails ld = testContextSetup.pageObjectManager.AddVeterianDetails();
        ld.selectedSpecialities();
	}


}
