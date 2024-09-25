

Feature: Adding a new owner for the pet.

Background:
Given User should be available on the PetClinic Page
When  Launch the browser from the config variables
And  User should be on PetClinic home page.
  
  #//Before->Background->Scenario->After
 
  @RegressionTest
  Scenario Outline: adding a new pet owner for the Pet Clinic
    Given User is on the PetClinic home page.
    When  User when launches the URL of the PetClinic.
    Then  Owners tab has been displayed.
    And   User can click on ADD NEW link
    Then  New Owner with "<FirstName>", "<LastName>", "<Address>", "<City>", and "<Telephone>" should be added.

  Examples:
    | FirstName  | LastName  | Address       | City  | Telephone    |
    | John       | Doe       | 123 Street    | CityA | 1234567890   |
    | Jane       | Smith     | 456 Avenue    | CityB | 0987654321   |
  
  
  @SmokeTest
  Scenario: Adding one more owner for the PetClinic
  
  Given User is on the PetClinic home page.
  When  User when launch the URL of the PetClinic.
  Then  Owners tab has been displayed.
  And   User can click on ADD NEW link

