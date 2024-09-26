package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class veterianDetails {
	public WebDriver driver;

	public veterianDetails(WebDriver driver) {
		this.driver = driver;
	}

	By Veterinarians = By.xpath("//a[@class='dropdown-toggle' and @role='button' and contains(., 'Veterinarians')]");
	By AddNew = By.xpath("//*[@routerlink='/vets/add']");
	By FirstName = By.xpath("//*[@id='firstName']");
	By LastName = By.xpath("//*[@id='lastName']");
	By Type = By.xpath("//*[@id='specialties']");
	By SaveVet = By.xpath("//*[@type='submit' and @class='btn btn-default' and text()='Save Vet' ]");
	By displayedValue = By.xpath("//div[contains(text(), 'dentistry')]");

	public void veterinariansTabDisplayed() {
		driver.findElement(Veterinarians);

	}

	public void clickonVeterinariansTab() {
		driver.findElement(Veterinarians).click();
	}

	public void addVeterinariansDetails() {
		driver.findElement(AddNew).click();
		driver.findElement(FirstName).sendKeys("ShubhamRaj");
		driver.findElement(LastName).sendKeys("Verma");
		driver.findElement(Type).click();
	}

	public void selectingTypeofVeterian() {
		try {
			WebElement type = driver.findElement(Type);
			Select dropdown = new Select(type);
			dropdown.selectByVisibleText("dentistry");
			//List<WebElement> allOptions = dropdown.getOptions();
			//for (WebElement option : allOptions) {
			//	System.out.println(option.getText());
			dropdown.selectByVisibleText("dentistry");
			driver.findElement(SaveVet).click();
				//;
			//}
		} catch (StaleElementReferenceException e) {
			System.out.println("vALIDATION IN CATCH");

		}

	}

	public void selectedSpecialities() {
		String displayedTextElement = driver.findElement(displayedValue).getText().trim();
		Assert.assertEquals("dentistry", displayedTextElement, "The value displayed on the page is not as expected!");
	}

}
