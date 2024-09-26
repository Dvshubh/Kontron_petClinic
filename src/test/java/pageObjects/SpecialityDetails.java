package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SpecialityDetails {

	public WebDriver driver;

	// Constructor
	public SpecialityDetails(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By specialityTab = By
			.xpath("//*[@class='glyphicon glyphicon-th-list']/following-sibling::span[text()=' Specialties']");
	By addButton = By.xpath("//button[@class='btn btn-default' and normalize-space(text())='Add']");
	By nameField = By.xpath("//*[@id='name']");
	By saveButton = By.xpath("//*[@type='submit']");
	By Specialist = By.xpath("//input[@ng-reflect-model='HeartSpecialist']");

	
	public boolean isSpecialityTabDisplayed() {
		return driver.findElement(specialityTab).isDisplayed();
	}

	
	public void clickSpecialityTab() {
		driver.findElement(specialityTab).click();
	}

	
	public void addNewSepciality() throws InterruptedException {
		driver.findElement(addButton).click();

		driver.findElement(nameField).sendKeys("HeartSpecialist");

		driver.findElement(saveButton).click();

		String specialistValidation = driver.findElement(Specialist).getText().trim();

		Assert.assertEquals(" ", specialistValidation, "The value displayed on the page is not as expected!");
	}
}
