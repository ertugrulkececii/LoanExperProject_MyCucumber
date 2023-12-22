@ert
Feature: As a User (Admin), having a page where I can see active users on the site and manage Deposit (withdrawal) transactions

  Background:
    * go to "homePageURL"
    * Click on the Login button.
    * Fill in user information.
    * Automatic deposit creation before main test

  Scenario: [TC_001] As a User (Admin), the test of being able to see active users on the site and manage Deposit (withdrawal) transactions

    * go to "adminLoginPage"
    * Enter "userNameErtugrul" and "adminPasswordErtugrul"
    * Click Manage User in Nawbar under Dashboard
    * Verify that the Active Users link is visible in the bar that appears after clicking Manage Users
    * Confirm that the Active Users link is active in the bar that appears after clicking Manage Users
    *  Verify that the Active Users link is visible in the bar that appears after clicking Manage Users
    * Verifies that the list headings on the Active User page can be viewed
    * Click on the Active Users link in the bar that appears and confirm that any user's Details button is visible and active.
    * Clicking the Details button confirms that the User Detail-Username page has been navigated to
    * On the User Detail page, under the Deposit heading, the view all icon appears and is confirmed to be active
    * Clicking on the icon confirms the 'Deposit History' page
    * It is confirmed that the list and list headings on the 'Deposit History' page can be viewed on the page that opens.
    * Verify that the 'Details' button is visible and active to access the information of any user selected from the list
    * Confirms that 'x requested x USD' can be displayed when clicked
    * It is confirmed that the Deposit Card can be displayed on the page that opens
    * It is confirmed that 'Date, Transaction Number, Username, Method, Amount, Charge, After Charge, Rate, Payable, Status' headings and values can be displayed in the Deposit Card.
    * It is confirmed that the titles and values of 'Successful Deposit', 'Pending Deposit', 'Rejected Deposit', 'Initiated Deposit' in Deposits can be viewed
    * It is confirmed that the 'Successful Deposit' banner is active and clicking on it takes you to the Successful Deposits page
    * Verify that the filter and search buttons on the Successful Deposits page are functional and active
    * It is confirmed that the page can be displayed with a list of successful deposits
    * It is confirmed that the 'Pending Deposit' banner is active and clicking on it takes you to the Pending Deposits page
    * Details Button appears in the List on the Pending Deposit page and confirms that it is active
    * When entering the Pending Deposit page, click on the Details of any user and verify that the 'Approve', 'Reject' Buttons can be displayed and are functional
    * When rejected, it is confirmed that the 'Reject Deposit Confirmation' page is displayed, the required fields are filled in and the message "Deposit request rejected successfully" is displayed.
    *  Click on the Reject button
    *  Fill in the Reason for Rejection section and Click SUBMIT button
    * Verify that Deposit request rejected successfully is visible
    *  close page

   Scenario: [TC_002-US_38] Verify that Accepting deposit with approve button test

    * go to "adminLoginPage"
    * Enter "userNameErtugrul" and "adminPasswordErtugrul"
    * Click Manage User in Nawbar under Dashboard
    * Verify that the Active Users link is visible in the bar that appears after clicking Manage Users
    * Confirm that the Active Users link is active in the bar that appears after clicking Manage Users
    *  Verify that the Active Users link is visible in the bar that appears after clicking Manage Users
    * Verifies that the list headings on the Active User page can be viewed
    * Click on the Active Users link in the bar that appears and confirm that any user's Details button is visible and active.
    * Clicking the Details button confirms that the User Detail-Username page has been navigated to
    * On the User Detail page, under the Deposit heading, the view all icon appears and is confirmed to be active
    * Clicking on the icon confirms the 'Deposit History' page
    * It is confirmed that the list and list headings on the 'Deposit History' page can be viewed on the page that opens.
    * Verify that the 'Details' button is visible and active to access the information of any user selected from the list
    * Confirms that 'x requested x USD' can be displayed when clicked
    * It is confirmed that the Deposit Card can be displayed on the page that opens
    * It is confirmed that 'Date, Transaction Number, Username, Method, Amount, Charge, After Charge, Rate, Payable, Status' headings and values can be displayed in the Deposit Card.
    * It is confirmed that the titles and values of 'Successful Deposit', 'Pending Deposit', 'Rejected Deposit', 'Initiated Deposit' in Deposits can be viewed
    * It is confirmed that the 'Successful Deposit' banner is active and clicking on it takes you to the Successful Deposits page
    * Verify that the filter and search buttons on the Successful Deposits page are functional and active
    * It is confirmed that the page can be displayed with a list of successful deposits
    * It is confirmed that the 'Pending Deposit' banner is active and clicking on it takes you to the Pending Deposits page
    * Details Button appears in the List on the Pending Deposit page and confirms that it is active
    * When entering the Pending Deposit page, click on the Details of any user and verify that the 'Approve', 'Reject' Buttons can be displayed and are functional
    * When rejected, it is confirmed that the 'Reject Deposit Confirmation' page is displayed, the required fields are filled in and the message "Deposit request rejected successfully" is displayed.
    * Click on the Approve button
    * When Approved, it is confirmed that the text '"Deposit request approved successfully"' is seen
    * close page

