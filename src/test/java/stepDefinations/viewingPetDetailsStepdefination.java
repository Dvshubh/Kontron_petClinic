package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.GenericUtils;
import utils.TestContextSetup;
import pageObjects.AddingOwner;
import pageObjects.ViewingPetDetails;

public class viewingPetDetailsStepdefination {
	public WebDriver driver;
    public TestContextSetup testContextSetup;

    public viewingPetDetailsStepdefination(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("User is on the PetClinics home page.")
    public void user_is_on_the_pet_clinics_home_page() throws InterruptedException { 
    	ViewingPetDetails ViewingPet=testContextSetup.pageObjectManager.getViewPetDetails();
    	ViewingPet.petTypesDisplayed();
    }

	@When("User when launch the URLs of the PetClinic.")
	public void user_when_launch_the_ur_ls_of_the_pet_clinic() {
    	ViewingPetDetails ViewingPet=testContextSetup.pageObjectManager.getViewPetDetails();
    	ViewingPet.petTypesDisplayed();
	}
	@Then("PET TYPES has been displayeds")
	public void pet_types_has_been_displayeds() {
		ViewingPetDetails ViewingPet=testContextSetup.pageObjectManager.getViewPetDetails();
		ViewingPet.clickOnPetTypes();
	}
	@Then("User can add new Pets Details")
	public void user_can_add_new_pets_details() {
		ViewingPetDetails ViewingPet=testContextSetup.pageObjectManager.getViewPetDetails();
		ViewingPet.AddNewPetDetails();
	}
	@Then("User can view Pets Details")
	public void user_can_view_pets_details() {
		 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		 
	}

	
	
}
