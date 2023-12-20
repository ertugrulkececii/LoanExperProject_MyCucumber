
Feature: [US_04] As a visitor, I want to have a home page where I can access general information on the site.

  Background:
    * goes to "homePageURL"


  Scenario: [TC_01 > US_04] Test to access home page as a visitor
    * verifies that the home section under the menu heading is visible.
    * clicks on the home section
    * verifies that the get started button is visible
    * closes the page


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
    * verifies that the See All button is visible under Featured plans.
    * clicks on the See All button.
    * verifies that the text Loan Plans is visible in the body of the page.
    * closes the page


  Scenario: [TC_05 > US_04] Tests the customer satisfaction and frequently asked questions sections on the homepage.
    * verifies that the information on customer satisfaction on the homepage is visible.
    * verifies that the Frequently Asked Questions section is visible in the home page.
    * confirms that frequently asked questions are displayed under the Frequently Asked Questions heading.
    * verifies that the accordion buttons at the end of the frequently asked questions are visible and active.
    * verifies that a slider introducing company employees is visible in the home page.
    * verifies that the left-right buttons below the slider are visible and active.
    * closes the page

  @Burak
  Scenario: [TC_06 > US_004] Visibility test of the Blog Post section and 'Like To Become A Hero' on the home page.
    * verifies that the Blog Post section is visible in the home page.
    * verifies that the date and time of the blogs are visible.
    * verifies that the title Like To Become A Hero is visible in the home page.
    * verifies that the Take Loan button to the right of the Like To Become A Hero heading in the home page is visible and active.
    * closes the page












