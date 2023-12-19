
Feature: [US_04] As a visitor, I want to have a home page where I can access general information on the site.

  Background:
    * goes to "homePageURL"

@Burak
  Scenario: [TC_01 > US_04] Test to access home page as a visitor
    * verifies that the home section under the menu heading is visible.
    * clicks on the home section
    * verifies that the get started button is visible
    * closes the page

  @Burak
  Scenario: [TC_02 > US_04] Access test to about page as a visitor
    * verifies that the about section under the menu heading is visible.
    * clicks on the about section.
    * verifies that the title contains about.
    * closes the page


  Scenario: [TC_03 > US_04] Test the visibility of the information in the Feature section
    * feature section to be visible in the body of the home page.
    * verifies that the headings are visible under the Feature section of the home page.
    * verifies that Support, Low Cost are displayed under the Feature section.
    * verifies that Support, Low Cost icons are displayed under the Feature section.
    * closes the page

  @Burak
  Scenario: [TC_04 > US_04] Test to reach the Featured Plans section
    * verifies that the Featured Plans section is displayed in the Home page.
    * verifies that the Basic Loan button is visible and active under the Featured Plans section.
    * clicks on the Basic Loan button.
    * verifies that Test Loan Card is displayed under Basic Loan button.
    * verifies that the Apply Now button is visible and active under Test Loan Card.
    * clicks on the Apply Now button.
    * verifies that the message You are not logged in! is displayed in the pop-up window.
    * verifies that there is a link button to the login page in the pop-up window.
    * clicks the close button in the window that opens.
    * verifies that the 'See All' button is visible under Featured plans.
    * clicks on the See All button.
    * verifies that the text Loan Plans is visible in the body of the page.
    * closes the page

  Scenario: [TC_05 > US_04] Test of trading on 'Test Loan Card' under Featured plans







