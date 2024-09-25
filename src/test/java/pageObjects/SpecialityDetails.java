package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialityDetails {
	
	public WebDriver driver;
	public SpecialityDetails(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By Speciality_tab = By.xpath("//span[@class='glyphicon glyphicon-th-list']/following-sibling::span[text()=' Specialties']");
	By Add=By.xpath("//button[@class='btn btn-default' and normalize-space(text())='Add']");
	By Name=By.xpath("//*[@id='name']");
	By Save=By.xpath("//*[@type='submit']");
	
	
	public void specialityTabDisplayed() {
		driver.findElement(Speciality_tab);

		
	}

	public void specialityTabClick() {
		driver.findElement(Speciality_tab).click();
	}
	
	public void addNewSepciality()
	{
		driver.findElement(Add).click();
		driver.findElement(Name).sendKeys("NavalRavikant");
		driver.findElement(Save).click();
	}


}
