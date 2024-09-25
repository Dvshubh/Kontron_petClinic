package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.JavascriptExecutor;

public class ViewingPetDetails {

	public WebDriver driver;

	public ViewingPetDetails(WebDriver driver) {
		this.driver = driver;
	}

	By petTypes = By.xpath("//*[@title='pettypes']");
	By newPet = By.xpath("//button[@class='btn btn-default' and text()=' Add ']");
	By newPetName = By.xpath("//*[@id='name']");
	By Save = By.xpath("//button[@type='submit' and @class='btn btn-default' and text()='Save']");

	public void petTypesDisplayed() {
		driver.findElement(petTypes);
	}

	public void clickOnPetTypes() {
		driver.findElement(petTypes).click();
	}

	public void AddNewPetDetails() {
		driver.findElement(newPet).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(newPetName).sendKeys("Rat");
		driver.findElement(Save).click();
	}

	public void verifyPetDetails() 
	{
		System.out.println("Verification of Pet Details is Pending");
	}
}
