Feature:As an administrator, I want to have an admin panel to do my administrative work and to be able to log
  in to the admin panel with my registered email and password.


  Scenario: [TC_001>] Admin login page access test
    Given go to "adminLoginPage"
    Then test that the header of admin page is visible
    And close page


  Scenario: [TC_002] Visibility and activity test of form elements on admin login page
    Given go to "adminLoginPage"
    Then test that the username textBox on admin login page is visible and active
    Then test that the password textBox on admin login page is visible and active
    Then test that the login button on admin login page is visible and active
    And close page


  Scenario: [TC_003] Admin login test
    Given go to "adminLoginPage"
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    Then test that the admin icon is visible
    And close page
