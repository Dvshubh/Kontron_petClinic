package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.GenericUtils;

public class PageObjectManager {
	public AddingOwner adddingOwners;
	public ViewingPetDetails viewingPetDe;
	public GenericUtils genericUtills;
	public WebDriver driver;
	public SpecialityDetails specialityDetails;
	public veterianDetails VeterianDetails;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public AddingOwner getAddingOwner() {
		adddingOwners = new AddingOwner(driver);
		return adddingOwners;
	}

	public ViewingPetDetails getViewPetDetails() {
		viewingPetDe = new ViewingPetDetails(driver);
		return viewingPetDe;
	}

	public GenericUtils GenericValidation() {
		System.out.println("");
		return genericUtills;
	}

	public SpecialityDetails getSpecialityDetails() {
		specialityDetails = new SpecialityDetails(driver);
		return specialityDetails;
	}

	public veterianDetails AddVeterianDetails() {
		VeterianDetails = new veterianDetails(driver);
		return VeterianDetails;
	}
}
