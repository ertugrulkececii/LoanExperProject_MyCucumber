package StepDefinitions.EyyupDemir;

import Pages.adminPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class adminPanelEDStepDefinitions {

    adminPanel adminPanel = new adminPanel();

    @Given("go to admin {string} page")
    public void go_to_admin_page(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("adminLoginPage"));

    }

    @Given("in the window that opens, you enter admin username")
    public void in_the_window_that_opens_you_enter_admin_username() {
        adminPanel.usernameBox.sendKeys(ConfigReader.getProperty("adminEyyup"));

    }

    @Given("in the window that opens, you enter admin password")
    public void in_the_window_that_opens_you_enter_admin_password() {
        adminPanel.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Given("Click on the login button")
    public void click_on_the_login_button() {
        adminPanel.loginButton.click();
        ReusableMethods.wait(1);
    }

    @Given("verifies that it  log into the site")
    public void verifies_that_it_log_into_the_site() {
        Assert.assertTrue(adminPanel.sideBarLoans.isDisplayed());
    }

    @Given("Loans is clicked from the side bar menu")
    public void loans_is_clicked_from_the_side_bar_menu() {
        adminPanel.sideBarLoans.click();
        ReusableMethods.wait(2);
    }

    @Given("It is confirmed that there are {string} in the Side bar")
    public void it_is_confirmed_that_there_are_in_the_side_bar(String string) {
        Assert.assertTrue(adminPanel.sideBarLoans.isDisplayed());
    }


    @Given("Pending Loans is confirmed to be visible")
    public void pending_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue(adminPanel.pendingLoans.isDisplayed());
    }

    @Given("Running Loans is confirmed to be visible")
    public void running_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue(adminPanel.runningLoans.isDisplayed());
    }

    @Given("Due Loans is confirmed to be visible")
    public void due_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue(adminPanel.dueLoans.isDisplayed());
    }

    @Given("Paid Loans is confirmed to be visible")
    public void paid_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue(adminPanel.paidLoans.isDisplayed());
    }

    @Given("Rejected Loans is confirmed to be visible")
    public void rejected_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue(adminPanel.rejectedLoans.isDisplayed());
    }

    @Given("All Loans is confirmed to be visible")
    public void all_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue(adminPanel.allLoans.isDisplayed());
    }

    @Given("it is confirmed Pending Loans page title Pending Loans are  to open")
    public void it_is_confirmed_pending_credits_page_title_pending_loans_are_to_open() {
        adminPanel.pendingLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPanel.pendingLoansIn.isDisplayed());
    }

    @Given("it is confirmed Running Loans page title Running Loans are  to open")
    public void it_is_confirmed_running_loans_page_title_running_loans_are_to_open() {
        adminPanel.runningLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPanel.runningLoansIn.isDisplayed());
    }

    @Given("it is confirmed Due Loans page title Due Loans are  to open")
    public void it_is_confirmed_due_loans_page_title_due_loans_are_to_open() {
        adminPanel.dueLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPanel.dueLoansIn.isDisplayed());
    }

    @Given("it is confirmed Paid Loans page title Paid Loans are  to open")
    public void it_is_confirmed_paid_loans_page_title_paid_loans_are_to_open() {
        adminPanel.paidLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPanel.paidLoansIn.isDisplayed());
    }

    @Given("it is confirmed Rejected Loans page title Rejected Loans are  to open")
    public void it_is_confirmed_rejected_loans_page_title_rejected_loans_are_to_open() {
        adminPanel.rejectedLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPanel.rejectedLoansIn.isDisplayed());
    }

    @Given("it is confirmed All Loans page title All Loans are  to open")
    public void it_is_confirmed_all_loans_page_title_all_loans_are_to_open() {
        adminPanel.allLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPanel.allLoansIn.isDisplayed());
    }

    @Given("click on Pending Loans from the menu that opens")
    public void click_on_pending_loans_from_the_menu_that_opens() {
        adminPanel.pendingLoans.click();
        ReusableMethods.wait(1);
    }

    @Given("Viewing the Pending Loans table")
    public void viewing_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansTable.isDisplayed());
    }

    @Given("SN information test in the Pending Loans table")
    public void sn_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansSN.isDisplayed());
    }

    @Given("Loan No.|Plan information test in the Pending Loans table")
    public void loan_no_plan_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansLoanNoPlan.isDisplayed());
    }

    @Given("User information test in the Pending Loans table")
    public void user_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansUser.isDisplayed());
    }

    @Given("Amount information test in the Pending Loans table")
    public void amount_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansAmount.isDisplayed());
    }

    @Given("Installment Amount information test in the Pending Loans table")
    public void ınstallment_amount_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansInstallmentAmount.isDisplayed());
    }

    @Given("Installment information test in the Pending Loans table")
    public void ınstallment_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansInstallment.isDisplayed());
    }

    @Given("Created | Next Installment information test in the Pending Loans table")
    public void created_next_ınstallment_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansCreatedNextInstallment.isDisplayed());
    }

    @Given("Status information test in the Pending Loans table")
    public void status_information_test_in_the_pending_loans_table() {
        Assert.assertTrue(adminPanel.pendingLoansStatus.isDisplayed());
    }

    @Given("Search with loan no.")
    public void search_with_loan_no() {
        adminPanel.dateSearch.clear();
        adminPanel.loanNoSearch.sendKeys(ConfigReader.getProperty("testLoansNo"), Keys.ENTER);
        Assert.assertEquals(ConfigReader.getProperty("testLoansNo"), adminPanel.actualloanNo.getText());

    }

    @Given("Search with Date.")
    public void search_with_date() {

        adminPanel.dateSearch.sendKeys(ConfigReader.getProperty("testLoansDate"), Keys.ENTER);
        Assert.assertEquals(ConfigReader.getProperty("testLoansDate"), adminPanel.actualDate.getText());
        ReusableMethods.wait(2);
    }

    @Given("Details information of the selected loan should be accessible under the Action heading in the Pending Loans table.")
    public void details_information_of_the_selected_loan_should_be_accessible_under_the_action_heading_in_the_pending_loans_table() {
        adminPanel.pendingLoansDetailsButton.isSelected();
    }

    @Given("Installments information of the selected loan should be accessible under the Action heading in the Pending Loans table.")
    public void installments_information_of_the_selected_loan_should_be_accessible_under_the_action_heading_in_the_pending_loans_table() {
        adminPanel.pendingLoansInstallmentsButton.isSelected();
    }

    @Given("Details content must be accessible")
    public void details_content_must_be_accessible() {
        adminPanel.pendingLoansDetailsButton.click();
        ReusableMethods.wait(1);
        adminPanel.detailsDate.isDisplayed();
        adminPanel.detailsPlan.isDisplayed();
        adminPanel.detailsloanNumber.isDisplayed();
        adminPanel.detailsAmount.isDisplayed();
        adminPanel.detailsPerInstallment.isDisplayed();
        adminPanel.detailsTotalInstallment.isDisplayed();
        adminPanel.detailsGivenInstallment.isDisplayed();
        adminPanel.detailsTotalPayable.isDisplayed();
        adminPanel.detailsProfit.isDisplayed();
        adminPanel.detailsStatus.isDisplayed();
    }



    @Given("User credit form can be  accepted")
    public void user_credit_form_can_be_accepted() {
        adminPanel.pendingLoansApprove.isSelected();
    }

    @Given("User credit form can be rejected")
    public void user_credit_form_can_be_rejected() {
        adminPanel.pendingLoansReject.isSelected();

    }

    @Given("Click the Installments button")
    public void click_the_installments_button() {

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPanel.pendingLoansInstallmentsButton.click();


    }

    @Given("Loan Summary must be accessible")
    public void loan_summary_must_be_accessible() {
        adminPanel.installementLoanNumber.isDisplayed();
        adminPanel.installementPlan.isDisplayed();
        adminPanel.installementLoanAmount.isDisplayed();
        adminPanel.installementPerInstallement.isDisplayed();
        adminPanel.installementTotalIntallement.isDisplayed();
        adminPanel.installementGivenInstallement.isDisplayed();
        adminPanel.installementReceivable.isDisplayed();
        adminPanel.installementDelayCharge.isDisplayed();
    }

    @Given("S.N., Installment Date, Given On, Delay, Charge headings can be seen")
    public void s_n_installment_date_given_on_delay_charge_headings_can_be_seen() {
        adminPanel.installementSN.isDisplayed();


    }

    @Given("S.N., Instalment Date, Date Issued, Delay, Fee information can be seen")
    public void s_n_instalment_date_date_issued_delay_fee_information_can_be_seen() {

    }

// bu doldurulacak

    @Given("Click the back button")
    public void click_the_back_button() {
        adminPanel.installementBackButton.click();
        ReusableMethods.wait(1);
    }

    @Given("Test to return to the Pending Loans page")
    public void test_to_return_to_the_pending_loans_page() {
        adminPanel.pendingLoans.click();
        Assert.assertTrue(adminPanel.pendingLoansIn.isDisplayed());
    }



}

