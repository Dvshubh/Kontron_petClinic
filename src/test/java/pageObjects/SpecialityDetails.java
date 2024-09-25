package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialityDetails {
	
	public WebDriver driver;

	// Constructor
	public SpecialityDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locators
	By specialityTab = By.xpath("//*[@class='glyphicon glyphicon-th-list']/following-sibling::span[text()=' Specialties']");
	By addButton = By.xpath("//button[@class='btn btn-default' and normalize-space(text())='Add']");
	By nameField = By.xpath("//*[@id='name']");
	By saveButton = By.xpath("//*[@type='submit']");

	// Check if the Speciality tab is displayed
	public boolean isSpecialityTabDisplayed() {
		return driver.findElement(specialityTab).isDisplayed();
	}

	// Click on the Speciality tab
	public void clickSpecialityTab() {
		driver.findElement(specialityTab).click();
	}
	
	// Add a new Speciality
	public void addNewSepciality()
	{
		driver.findElement(addButton).click();
		driver.findElement(nameField).sendKeys("NavalRavikant");
		driver.findElement(saveButton).click();
	}
}
