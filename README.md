Project Structure of the Project.
│   .classpath
│   .gitignore
│   .project
│   pom.xml
│
├───.settings
│       org.eclipse.core.resources.prefs
│       org.eclipse.jdt.core.prefs
│       org.eclipse.m2e.core.prefs
│
├───src
│   ├───main
│   │   └───java
│   │       └───petClinic
│   │           └───petClinic_Validation
│   │                   App.java
│   │
│   └───test
│       ├───java
│       │   ├───cucumberOptions          # Cucumber test runners
│       │   ├───features                 # Feature files for scenarios
│       │   ├───pageObjects              # Page Object Model classes
│       │   ├───stepDefinations          # Step definitions for scenarios
│       │   └───utils                    # Utility classes
│       └───resources                    # Resources needed for tests
│
├───target                               # Maven output folder
│   ├───classes                          # Compiled class files
│   ├───ExtentReport                    # Extent reports generated
│   ├───surefire-reports                # TestNG reports from Surefire plugin
│   └───test-classes                    # Compiled test classes
│
└───test-output                          # Test output files and reports

Prerequisites
Before running the tests, ensure you have the following installed:

Java Development Kit (JDK): Version 1.8 or higher
Apache Maven: Version 3.6 or higher
IDE: An Integrated Development Environment (e.g., IntelliJ IDEA, Eclipse)
ChromeDriver: Make sure the ChromeDriver executable is available in the project resources
Project Structure
The project is structured as follows:

bash
Copy code
D:.
│   .classpath
│   .gitignore
│   .project
│   pom.xml
│
├───src
│   ├───main
│   │   └───java
│   └───test
│       ├───java
│       │   ├───cucumberOptions
│       │   ├───features
│       │   ├───pageObjects
│       │   ├───stepDefinitions
│       │   └───utils
│       └───resources
│
└───test-output
**Running Cucumber Automation Project**
Follow these steps to run the Cucumber tests:

1. Clone the Repository
bash
Copy code
git clone https://github.com/Dvshubh/Kontron_petClinic.git
cd yourrepository
2. Open the Project in Your IDE
Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Install Dependencies
Navigate to the project root directory and install the necessary dependencies using Maven:

bash
Copy code
mvn clean install
4. Configure ChromeDriver
Ensure that the chromedriver.exe is placed in the src/test/resources directory. You can download it from the ChromeDriver download page and match the version with your installed Chrome browser.

5. Run the Tests
You can run the tests in several ways:

Option 1: Using the Command Line
To execute the tests from the command line, use:

bash
Copy code
mvn test
This command will compile the project and execute all tests defined in the feature files.

Option 2: From the IDE
In your IDE, locate the test runner class (e.g., TestNGRunner.java) under src/test/java/cucumberOptions/.
Right-click on the class and select Run to execute the tests.
6. View the Reports
After the tests are completed, you can find the generated reports in the following directories:

Extent Reports: Located in target/ExtentReport.
TestNG Reports: Located in target/surefire-reports and test-output.
Open the index.html file in a web browser to view the report.

Additional Notes
Ensure that your Chrome browser is up to date, as the ChromeDriver version must match the browser version.
If you encounter issues with browser compatibility, consider updating both Chrome and ChromeDriver.
Troubleshooting
If you face any issues while running the tests, consider the following:

Check the console output for any error messages.
Ensure that your Java and Maven installations are correctly configured.
Verify that the path to ChromeDriver is set correctly in your project.


