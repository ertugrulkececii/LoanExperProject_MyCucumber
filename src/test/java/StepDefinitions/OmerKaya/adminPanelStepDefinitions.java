package StepDefinitions.OmerKaya;

import Pages.adminPanel;
import Pages.homePage;
import Pages.userPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class adminPanelStepDefinitions {

    adminPanel adminPanel = new adminPanel();

    Pages.userPanel userPanel = new userPanel();
    Pages.homePage homePage = new homePage();

    Actions actions = new Actions(Driver.getDriver());


    // -------------------------------[TC_01>US_028]-----------------------------------

    @Given("admin clicks on the login button and enters the system with the registered {string} and {string}")
    public void admin_clicks_on_the_login_button_and_enters_the_system_with_the_registered_and(String adminValidUserName, String adminValidPassword) {
        adminPanel.usernameBox.sendKeys(ConfigReader.getProperty("adminValidUserName"));
        adminPanel.passwordBox.sendKeys(ConfigReader.getProperty("adminValidPassword"));
        adminPanel.loginButton.click();


    }

    @Given("click on the loan tab on the page that opens. then click on the due loan tab on menu that opens and it is displayed")
    public void click_on_the_loan_tab_on_the_page_that_opens_then_click_on_the_due_loan_tab_on_menu_that_opens_and_it_is_displayed() {


        adminPanel.LoanMenuItem.click();
        adminPanel.DueLoanItem.click();
        Assert.assertTrue(adminPanel.DueLoanBoardData.isDisplayed());


    }

    @Given("The administrator displays the Loans Table \\(with S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status).")
    public void the_administrator_displays_the_loans_table_with_s_n_loan_no_plan_user_amount_ınstallment_amount_ınstallment_created_next_ınstallment_status() {
        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 3: Data not found, test steps can not execute.");


    }

    @Given("The administrator searches the installation table with Loan No and Start Date - End Date.")
    public void the_administrator_searches_the_installation_table_with() {
        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 4: Data not found, test steps can not execute.");

    }

    @Given("The administrator accesses the Details and Installment information of the selected loan under the Action heading in the Due Installment Loans table.")
    public void the_administrator_accesses_the_details_and_ınstallment_information_of_the_selected_loan_under_the_action_heading_in_the_due_ınstallment_loans_table() {

        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 5: Data not found, test steps can not execute.");
    }

    @Given("The administrator views the user credit form status in the User Credit Form window on the Details page.")
    public void the_administrator_views_the_user_credit_form_status_in_the_user_credit_form_window_on_the_details_page() {

        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 6: Data not found, test steps can not execute.");
    }

    @Given("The admin displays Loan summary information \\(Loan Number, Plan, Loan Amount, Per Installment, Total Installment, Given Installment, Receivable, Delay Charge) on the Installments page.")
    public void the_admin_displays_loan_summary_information_loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_on_the_ınstallments_page() {

        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 7: Data not found, test steps can not execute.");
    }

    @Given("The admin displays the installments on the user Installments page, with S.N., Installment Date, Given On, Delay, Charge information.")
    public void the_admin_displays_the_installments_on_the_user_ınstallments_page_with_s_n_ınstallment_date_given_on_delay_charge_information() {

        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 8: Data not found, test steps can not execute.");
    }

    @Given("The administrator returns to the Due Loans page from the Installments page")
    public void the_administrator_returns_to_the_due_loans_page_from_the_ınstallments_page() {

        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 9 : Data not found, test steps can not execute.");
    }

    @Given("On the Installments page, the admin displays that if the installments are more than {int}, they continue to be listed on the next page.")
    public void on_the_ınstallments_page_the_admin_displays_that_if_the_installments_are_more_than_they_continue_to_be_listed_on_the_next_page(Integer int1) {

        Assert.assertTrue(adminPanel.DueLoanBoardData.getText().equals("Data not found"));
        System.out.println("Test Step 10 : Data not found, test steps can not execute.");

    }


    // ----------------------------------[TC_01>US_050]------------------------------------------------

    @Given("On the dashbord page, the administrator views and clicks on the notification to all tab under manage user.")
    public void on_the_dashbord_page_the_administrator_views_and_clicks_on_the_tab_under() {

        adminPanel.manageUsersItem.click();
        adminPanel.notificationAllItem.click();





    }

    @Given("In the being sent section on the page that opens, the admin can filter all users or the selected user.")
    public void ın_the_section_on_the_page_that_opens_the_admin_can_filter_all_users_or_the_selected_user() {
        Select dropDownMenu = new Select(adminPanel.beingSentDropDown);
        ReusableMethods.wait(2);
        dropDownMenu.selectByVisibleText(ConfigReader.getProperty("dropDownOptions"));



    }

    @Given("The admin sends a message to the user has identified on the page that opens, including the topic, message, specific start date and period.")
    public void the_admin_sends_a_message_to_the_user_has_identified_on_the_page_that_opens_including_the_topic_message_specific_start_date_and_period() {

        adminPanel.emailSubject.sendKeys("deneme5");
        adminPanel.messageBox.sendKeys("Bu bir deneme mesajıdır");

        adminPanel.batchBox.sendKeys("2");
        adminPanel.waitingTimeBox.sendKeys("2"+Keys.ENTER);
        ReusableMethods.wait(3);



        adminPanel.stopButton.click();

    }

    @Given("The admin sees the warning message indicating a successful send.")
    public void the_admin_sees_the_warning_message_indicating_a_successful_send() {

        ReusableMethods.wait(3);
       Assert.assertTrue(adminPanel.successfullySentAlert.getText().contains("Done"));
       ReusableMethods.wait(2);
       adminPanel.closeButton.click();





    }

    @Given("The admin will see the error message warning when an error is encountered")
    public void the_admin_will_see_the_error_message_warning_when_an_error_is_encountered() throws IOException {

        adminPanel.emailSubject.clear();
        adminPanel.emailSubject.sendKeys("deneme6");

        adminPanel.messageBox.clear();
        adminPanel.messageBox.sendKeys("");
        adminPanel.batchBox.clear();
        adminPanel.batchBox.sendKeys("2");

        adminPanel.waitingTimeBox.clear();
        adminPanel.waitingTimeBox.sendKeys("2"+Keys.ENTER);
        ReusableMethods.wait(1);
        ReusableMethods.getScreenshot("hata mesajı");

        System.out.println(adminPanel.errorMessageAlert.getText());
        Assert.assertTrue(adminPanel.errorMessageAlert.getText().contains("The message field is required."));

        Driver.closeDriver();


    }


}