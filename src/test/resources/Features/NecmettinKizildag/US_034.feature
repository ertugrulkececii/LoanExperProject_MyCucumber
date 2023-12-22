Feature: As an administrator, I want to be able to access and update my profile information.

  Scenario: [TC_001] Admin icon visibility and activity test
    Given go to "adminLoginPage"
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    Then test that the admin icon is visible
    And close page

  Scenario: [TC_002] Visibility and activation test of the elements in the menu that opens when you press the admin icon
    Given go to "adminLoginPage"
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    And click admin icon
    Then test that the profile button is visible and active
    Then test that the password button is visible and active
    Then test that the logout button is visible and active
    And close page


  Scenario: [TC_003] Admin profile update test
    Given go to "adminLoginPage"
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    And click admin icon
    Then click profile button
    Then verify that the title of the page is "Profile"
    And enter a new name in the nameBox
    And enter a new email in the emailBox
    And click submit button on admin profile page
    Then verify that the name has changed
    Then verify that the email has changed


  Scenario: [TC_004] Admin password update test
    Given go to "adminLoginPage"
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    And click admin icon
    And click password button
    Then verify that the title of the page is "Password Setting"
    And enter "oldAdminPassword" in the passwordBox
    And enter "newAdminPassword" in the newPasswordBox
    And enter "newAdminPassword" in the conformPasswordBox
    And click submit button on admin password page
    And click admin icon
    And click logout button
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    Then test that the admin icon is visible
    And close page

@nec
  Scenario: [TC_005] Admin logout test
    Given go to "adminLoginPage"
    And enter the valid admin username in the usernameBox
    And enter the valid admin password in the passwordBox
    And click login on admin login page button
    And click admin icon
    And click logout button
    Then test that the username textBox on admin login page is visible and active
    And close page
