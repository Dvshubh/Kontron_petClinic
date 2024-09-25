package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class hooks {
	TestContextSetup testContextSetup;

	public hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Before
	public void addingOwner() {
		System.out.println("Adding the Owener of the PetClinic@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	@After
	public void tearDown() throws IOException {
		testContextSetup.testBase.WebDriverManager().quit();
	}

	@AfterStep

	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver=testContextSetup.testBase.WebDriverManager();
		if (scenario.isFailed())
		{
			File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[]fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}

	}
}
