Feature: As a registered user, I want to be able to access the login page from the home page in order to log in to my own panel.


  Scenario: [TC_001] Access test for registered user's login page

    Given go to "homePageURL"
    Then Test that the login button is visible and active
    And click login button
    And close page


  Scenario: [TC_002] Visibility and activity of user login form elements
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    Then test that the username textBox is visible and active
    Then test that the password textBox is visible and active
    Then test that the remember me checkBox is visible and active
    Then test that the forgot password link is visible and active
    Then test that the login button on login page is visible and active
    Then test that the register now link is visible and active
    And close page

  Scenario: [TC_003]  Username and password textBoxes when the 'Remember Me' checkBox is checked


  Scenario: [TC_004] User login with the 'Remember Me' textBox unselected
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    And enter the valid username in the usernameBox
    And enter the valid password in the passwordBox
    And click login button on user login page
    Then test that the dashboard button is visible and active
    And close page


  Scenario: [TC_005] Negatif login test as a user with valid userName and invalid password
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    And enter the valid username in the usernameBox
    And enter the invalid password in the passwordBox
    And click login button on user login page
    Then test that the These credentials do not match our records. warning is visible
    Then test that the login button on login page is visible and active
    And close page


  Scenario: [TC_006] Negatif login test as a user with invalid userName and valid password
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    And enter the invalid username in the usernameBox
    And enter the valid password in the passwordBox
    And click login button on user login page
    Then test that the These credentials do not match our records. warning is visible
    Then test that the login button on login page is visible and active
    And close page


  Scenario: [TC_007] Forgot password test
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    And click forgot password link
    When test that the submit button is visible and active
    And enter the valid username in the usernameBox on forgot password page
    And click submit button
    Then test that the Password reset email sent successfully warning is visible


  Scenario: [TC_008] Resend test of password reset mail
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    And click forgot password link
    When test that the submit button is visible and active
    And enter the valid username in the usernameBox on forgot password page
    And click submit button
    And click Try to send again link
    Then test that the header of Account Recovery is visible
    And enter the valid username in the usernameBox on forgot password page
    And click submit button
    Then test that the Password reset email sent successfully warning is visible
    And close page

  @wip
  Scenario: [TC_009] Register link working test
    Given go to "homePageURL"
    Then click login button
    And scroll down the page until the login form appears
    And click Register Now link
    Then test that the header of Account Recovery is visible
    And close page
