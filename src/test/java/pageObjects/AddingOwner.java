package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingOwner {
	public WebDriver driver;

	By Owners_tab = By.xpath("//*[@role='button']//span[@class='glyphicon glyphicon-user']");
	By AddNew = By.xpath("//*[@routerlink='/owners/add']");
	By FirstName = By.id("firstName");
	By LastName = By.id("lastName");
	By Address = By.id("address");
	By City = By.id("city");
	By ContactNumber = By.id("telephone");
	By AddOwner = By.xpath("//*[@type='submit']"); // Button to add new owner

	public AddingOwner(WebDriver driver) {
		this.driver = driver;
	}

	public void ownerTabDisplayed() {
		driver.findElement(Owners_tab);

	}

	public void ownerTabClick() {
		driver.findElement(Owners_tab).click();
	}

	public void clickOnAddNew() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(AddNew)).click();
	}

	public void newDetailsofOwner(String firstName, String lastName, String address, String city, String telephone) {
		driver.findElement(FirstName).sendKeys(firstName);
		driver.findElement(LastName).sendKeys(lastName);
		driver.findElement(Address).sendKeys(address);
		driver.findElement(City).sendKeys(city);
		driver.findElement(ContactNumber).sendKeys(telephone);
		driver.findElement(AddOwner).click();

	}
}
