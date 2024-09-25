package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtills;

	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		driver = testBase.WebDriverManager();

		pageObjectManager = new PageObjectManager(driver);

		genericUtills = new GenericUtils(driver);
	}
}
