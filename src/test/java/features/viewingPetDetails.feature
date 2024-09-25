Feature: viewing pet details.



@Smoke
 Scenario: adding new pet details
  
  Given User is on the PetClinics home page.
  When  User when launch the URLs of the PetClinic.
  Then  PET TYPES has been displayeds
  And   User can add new Pets Details
  
  @Smoke
  Scenario: viewing new pets details
  
  Given User is on the PetClinics home page.
  When  User when launch the URLs of the PetClinic.
  Then  PET TYPES has been displayeds
  And   User can view Pets Details
