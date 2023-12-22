
Feature: [US_028] As an administrator, I want to have a Due Loans page to view and process term loans.

  Scenario: [TC_01>US_028] Test on the admin's ability to access users' term loan plans, installments, and all loan-related information

    * go to admin "adminLoginPage" page
    * admin clicks on the login button and enters the system with the registered "adminValidUserName" and "adminValidPassword"
    * click on the loan tab on the page that opens. then click on the due loan tab on menu that opens and it is displayed
    * The administrator displays the Loans Table (with S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status).
    * The administrator searches the installation table with Loan No and Start Date - End Date.
    * The administrator accesses the Details and Installment information of the selected loan under the Action heading in the Due Installment Loans table.
    * The administrator views the user credit form status in the User Credit Form window on the Details page.
    * The admin displays Loan summary information (Loan Number, Plan, Loan Amount, Per Installment, Total Installment, Given Installment, Receivable, Delay Charge) on the Installments page.
    * The admin displays the installments on the user Installments page, with S.N., Installment Date, Given On, Delay, Charge information.
    * The administrator returns to the Due Loans page from the Installments page
    * On the Installments page, the admin displays that if the installments are more than 20, they continue to be listed on the next page.
