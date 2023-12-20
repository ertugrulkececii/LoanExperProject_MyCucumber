@eyyp
Feature: [US_026] As an administrator, I want to have a pending loans page so I can see and process pending loans.

  Scenario: [TC_001>US_026] access test for the login page of the user registered as admin
    * go to admin "adminLoginPage" page
    * in the window that opens, you enter admin username
    * in the window that opens, you enter admin password
    * Click on the login button
    * verifies that it  log into the site


  Scenario: [TC_002>US_026] Test of access to the Pending Loans page
    * Loans is clicked from the side bar menu
    * click on Pending Loans from the menu that opens
    * it is confirmed Pending Loans page title Pending Loans are  to open

  Scenario: [TC_003>US_026] Pending Loans table Display test on Pending Loans page
    * Viewing the Pending Loans table

  Scenario: [TC_004>US_026] Table content display test in Pending Credits table.
    * SN information test in the Pending Loans table
    * Loan No.|Plan information test in the Pending Loans table
    * User information test in the Pending Loans table
    * Amount information test in the Pending Loans table
    * Installment Amount information test in the Pending Loans table
    * Installment information test in the Pending Loans table
    * Created | Next Installment information test in the Pending Loans table
    * Status information test in the Pending Loans table

  Scenario: [TC_005>US_026] A test for making a call using "Loan Number and Start Date - End Date" information in the Pending Loans table on the Pending Loans page
    *  Search with Date.
    *  Search with loan no.


  Scenario: [TC_006>US_026]The details of the selected loan and the Installment information are tested to be available under the Action heading in the Pending Loans table
    * Details information of the selected loan should be accessible under the Action heading in the Pending Loans table.
    * Installments information of the selected loan should be accessible under the Action heading in the Pending Loans table.

  Scenario: [TC_007>US_026] Credit details (Plan, Application Date, Credit Number, Amount, Per Installment, Total Installment, Installment, Total Payable, Profit, Status info) Accessibility test on details page
    * Details content must be accessible

  Scenario: [TC_008>US_026] User credit form, acceptance/reject test from the User Credit Form window in the Details page test
    * User credit form can be  accepted
    * User credit form can be rejected

  Scenario: [TC_009>US_026] installments content information display test
    * Click the Installments button
    * Loan Summary must be accessible

  Scenario: [TC_010>US_026] On the installment page, installment SN, Installment Date, Given, Delay, Visibility test with charging information
  * S.N., Installment Date, Given On, Delay, Charge headings can be seen
  * S.N., Instalment Date, Date Issued, Delay, Fee information can be seen
   # bug var icerik görüntülene miyor


Scenario: [TC_011>US_026] Returning test to Pending Loans page from installment page
  * Click the back button
  * Test to return to the Pending Loans page





















