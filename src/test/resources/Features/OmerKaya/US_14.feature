@omerKaya
Feature: [US_014] As a registered user, I want to be able to access and update my profile information.

  Scenario: [TC_01>US_014] Test that a registered user (User) can access, view and update their profile information.

    * go to "homePageURL" in the browser
    * user clicks on the login button and enters the system with the registered "validUserName" and "validPassword"
    * displays user profile information and updates first and last name
    * user uploads profile picture
    * user registers a "non-numeric zip code" and receives an error message
    * displays successful registration when the user enters the required informations