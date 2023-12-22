@ert
Feature: [US_53] As an administrator (admin), I would like to have a Succesfully Deposit page to be able to view successfully deposited transactions.

  Scenario: [TC_001-US_53] Testing the visibility and activity of the Succesful Deposits page

    * go to "adminLoginPage"
    * Enter "userNameErtugrul" and "adminPasswordErtugrul"
    * Click on Nawbarda Deposits under Dashboard
    * Successful Deposits" page link
    * Clicking on the "Successful Deposits" page link under the Deposits menu item confirms access to the "admin/deposit/successful" page
    * Confirms that the Successful Deposits list is displayed on the page
    * List headings 'Gateway, Initiated,'User','Amount','Conversion','Status','Action' and the information under them are verified to be visible
    * To access the details of the approved deposit, the 'Details' button appears and confirms that it is active
    * Click on Details
    * It is confirmed that 'Date,Trx Number,Username,Method,Amount,Charge,After Charge,Rate,Payable,Status' information is displayed on the detail page of the withdrawal transaction selected from the list.
    * close page
