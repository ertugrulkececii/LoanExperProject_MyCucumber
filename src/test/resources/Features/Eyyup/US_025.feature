
@eyyp
Feature:[US_025] As an administrator, I want to have an Answered Ticket page so that I can manage answered support tickets.



  @priority2
  Scenario: [TC_001>US_025] access test for the login page of the user registered as admin
    * go to admin "adminLoginPage" page
    * in the window that opens, you enter admin username
    * in the window that opens, you enter admin password
    * Click on the login button
    * verifies that it  log into the site

    # [TC_002>US_025] credits menu display test on admin panel sidebar

    * It is confirmed that there are "Loans" in the Side bar

    #[TC_003>US_025] Loans Pending under Loans menu, Running Loans, Term Loans, Paid Loans, Denied Loans, All Loans page headers display test
    * Loans is clicked from the side bar menu
    * Pending Loans is confirmed to be visible
    * Running Loans is confirmed to be visible
    * Due Loans is confirmed to be visible
    * Paid Loans is confirmed to be visible
    * Rejected Loans is confirmed to be visible
    * All Loans is confirmed to be visible

    #[TC_004>US_025]The test that the page titles under the Credits menu heading to the relevant pages
    * it is confirmed Pending Loans page title Pending Loans are  to open
    * it is confirmed Running Loans page title Running Loans are  to open
    * it is confirmed Due Loans page title Due Loans are  to open
    * it is confirmed Paid Loans page title Paid Loans are  to open
    * it is confirmed Rejected Loans page title Rejected Loans are  to open
    * it is confirmed All Loans page title All Loans are  to open

















  @priority1
    Scenario: Loans test
