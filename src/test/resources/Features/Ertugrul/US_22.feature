Feature: As a registered user, I want to be able to log out of the site safely.

 @ert
  Scenario: [TC_22] You can go to the site with your user information. The visibility and effectiveness of the logout link is tested and returned to the home page.

   Given Navigate to the URL by entering in the browser's address "homePageURL" bar and pressing the Enter key.
    Then Click on the Login button.
    Then Fill in user information.
    And Test the functionality and visibility of the logout button.
    Then Return to the home page.
    And close page