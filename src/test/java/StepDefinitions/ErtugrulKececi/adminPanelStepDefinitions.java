package StepDefinitions.ErtugrulKececi;

import Pages.adminPanel;
import Pages.homePage;
import Pages.userPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class adminPanelStepDefinitions {
    homePage homePage = new homePage();
    adminPanel adminPanel = new adminPanel();
    userPanel userPanel = new userPanel();
    @When("Automatic deposit creation before main test")
    public void automaticDepositCreationBeforeMainTest() {
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.wait(1);

        userPanel.UserpageDepositButtonElement.click();
        userPanel.UserDepositSelectGatewayElement.click();
        Select dropdown = new Select(userPanel.UserDepositSelectGatewayElement);

        // Dropdown'ı açma ve bir seçenek seçme
        dropdown.selectByVisibleText("Manuel");

        userPanel.UserPageAmountElement.click();
        userPanel.UserPageAmountElement.sendKeys("1000");
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userPanel.UserDepositSubmitButtonElement.click();
        ReusableMethods.wait(2);
        userPanel.UserDepositPayNowButtonElement.click();

    }

        @When("Click the Deposits button")
        public void clickTheDepositsButton() {
            userPanel.DepositsButton.click();

        }
       @When("Click on the All Deposits button")
        public void clickOnTheAllDepositsButton () {

            userPanel.AllDepositsButton.click();
            ReusableMethods.wait(1);
        }
        @When("Click the Pending Deposits Heading")
        public void clickThePendingDepositsHeading () {
            userPanel.PendingDeposits.click();
        }
        @And("Verify that Details button is active")
        public void verifyThatDetailsButtonIsActive () {
            assertTrue(adminPanel.PendingDepositsSuccessfulDetailsPage.isDisplayed());
            ReusableMethods.wait(2);
        }

        @And("Verify that Approve and Reject buttons on the Transaction Detail page")
        public void verifyThatApproveAndRejectButtonsOnTheTransactionDetailPage () {
            assertTrue(adminPanel.ApprouveButton.isDisplayed());
            assertTrue(adminPanel.RejectButton.isDisplayed());

        }

        @When("Click on the Reject button")
        public void clickOnTheRejectButton () {
            adminPanel.RejectButton.click();

        }

        @When("Fill in the Reason for Rejection section and Click SUBMIT button")
        public void fillInTheReasonForRejectionSectionAndClickSUBMITButton () {

            ReusableMethods.wait(2);
            adminPanel.ReasonforRejectionBox.click();
            adminPanel.ReasonforRejectionBox.sendKeys("Your income is not sufficient");
            adminPanel.RejectSubmitbutton.click();


        }

        @And("Verify that Deposit request rejected successfully is visible")
        public void verifyThatDepositRequestRejectedSuccessfullyIsVisible () {
            assertTrue(adminPanel.RequestRejectedSuccessfully.isDisplayed());

        }

        @When("Click on the Approve button")
        public void clickOnTheApproveButton () {
            adminPanel.approveButtonOnDepositPage.click();
            adminPanel.yesButtonAfterApprove.click();
        }

        @When("On the page that appears click on the Yes button")
        public void onThePageThatAppearsClickOnTheYesButton () {
            adminPanel.PendingDepositsYesButton.click();

        }

        @And("Verify that Deposit request approved successfully is appeared")
        public void verifyThatDepositRequestApprovedSuccessfullyIsAppeared () {
            assertTrue(adminPanel.RequestApprouvedSuccessfully.isDisplayed());
        }

        @When("Type to samet in the searchtextbox and submit")
        public void typeToSametInTheSearchtextboxAndSubmit () {

            adminPanel.PendingDepositsSearchTextBox.click();
            adminPanel.PendingDepositsSearchTextBox.sendKeys("ertugrul");
            adminPanel.PendingDepositsSearchTextSubmitbutton.click();

        }

        @When("Click on the first Details button")
        public void clickOnTheFirstDetailsButton () {
            adminPanel.PendingDepositsDetailsButtonSamet.click();
        }


    @When("Enter {string} and {string}")
    public void enter_and(String userNameErtugrul, String adminPasswordErtugrul) {
       ReusableMethods.wait(1);

       // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // js.executeScript("arguments[0].scrollIntoView();", adminPanel.passwordBox);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(adminPanel.loginButton);

        adminPanel.usernameBox.sendKeys(ConfigReader.getProperty(userNameErtugrul));
        adminPanel.passwordBox.sendKeys(ConfigReader.getProperty(adminPasswordErtugrul));
        adminPanel.loginButton.sendKeys(Keys.ENTER);

    }
    @When("Click Manage User in Nawbar under Dashboard")
    public void click_manage_user_in_nawbar_under_dashboard() {
        adminPanel.manageUsersItem.click();
    }
    @When("Verify that the Active Users link is visible in the bar that appears after clicking Manage Users")
    public void verify_that_the_active_users_link_is_visible_in_the_bar_that_appears_after_clicking_manage_users() {
        Assert.assertTrue(adminPanel.manageUsersItem.isDisplayed());






    }
    @When("Confirm that the Active Users link is active in the bar that appears after clicking Manage Users")
    public void confirm_that_the_active_users_link_is_active_in_the_bar_that_appears_after_clicking_manage_users() {
        Assert.assertTrue(adminPanel.activeUsersAdminDashboard.isDisplayed());

        adminPanel.activeUsersAdminDashboard.click();
    }
    // bundan sonraki testler belirtilen yere kada Active User'in icinde
    @When("Verifies that the list headings on the Active User page can be viewed")
    public void verifies_that_the_list_headings_on_the_active_user_page_can_be_viewed() {
        Assert.assertTrue(adminPanel.listOfheaderActiveUsersPage.isDisplayed());
    }
    @When("Click on the Active Users link in the bar that appears and confirm that any user's Details button is visible and active.")
    public void click_on_the_active_users_link_in_the_bar_that_appears_and_confirm_that_any_user_s_details_button_is_visible_and_active() {
        adminPanel.searchBoxActiveUsersPage.sendKeys("ertugrul");
        adminPanel.searchBoxActiveUsersPage.sendKeys(Keys.ENTER);
        Assert.assertTrue(adminPanel.detailsButtonActiveUsersPage.isDisplayed());


    }
    @When("Clicking the Details button confirms that the User Detail-Username page has been navigated to")
    public void clicking_the_details_button_confirms_that_the_user_detail_username_page_has_been_navigated_to() {
            adminPanel.detailsButtonActiveUsersPage.click();
           // Assert.assertTrue(adminPanel.detailsButtonActiveUsersPage.isEnabled());
    }
    @When("On the User Detail page, under the Deposit heading, the view all icon appears and is confirmed to be active")
    public void on_the_user_detail_page_under_the_heading_the_icon_appears_and_is_confirmed_to_be_active() {
        Assert.assertTrue(adminPanel.viewallButtonInDetailsPage.isDisplayed());


    }
    @When("Clicking on the icon confirms the {string} page")
    public void clicking_on_the_icon_confirms_the_page(String string) {
        adminPanel.viewallButtonInDetailsPage.click();
    }
    @When("It is confirmed that the list and list headings on the {string} page can be viewed on the page that opens.")
    public void ıt_is_confirmed_that_the_list_and_list_headings_on_the_page_can_be_viewed_on_the_page_that_opens(String string) {
        Assert.assertTrue(adminPanel.headOfDepositHistoryGetText.isDisplayed());
        Assert.assertTrue(adminPanel.gatewayListHeaderOfdepositHistoryPage.isDisplayed());
        Assert.assertTrue(adminPanel.usersListHeaderOfdepositHistoryPage.isDisplayed());
    }
    @When("Verify that the {string} button is visible and active to access the information of any user selected from the list")
    public void verify_that_the_button_is_visible_and_active_to_access_the_information_of_any_user_selected_from_the_list(String string) {
        Assert.assertTrue(adminPanel.detailsButtonInDepositHistoryPage.isDisplayed());

        adminPanel.detailsButtonInDepositHistoryPage.click();
    }
    @When("Confirms that {string} can be displayed when clicked")
    public void confirms_that_can_be_displayed_when_clicked(String string) {
        Assert.assertTrue(adminPanel.xRequestedxUSDtextElement.isDisplayed());
    }
    @When("It is confirmed that the Deposit Card can be displayed on the page that opens")
    public void ıt_is_confirmed_that_the_deposit_card_can_be_displayed_on_the_page_that_opens() {
        Assert.assertTrue(adminPanel.cardOfDepositViaManuel.isDisplayed());
    }
    @When("It is confirmed that {string} headings and values can be displayed in the Deposit Card.")
    public void ıt_is_confirmed_that_headings_and_values_can_be_displayed_in_the_deposit_card(String string) {
        Assert.assertTrue(adminPanel.cardOfDepositViaManuel.isDisplayed());
    }
    @When("It is confirmed that the titles and values of {string}, {string}, {string}, {string} in Deposits can be viewed")
    public void ıt_is_confirmed_that_the_titles_and_values_of_in_deposits_can_be_viewed(String string, String string2, String string3, String string4) {
        Assert.assertTrue(adminPanel.cardOfDepositViaManuel.isDisplayed());
    }
    @When("It is confirmed that the {string} banner is active and clicking on it takes you to the Successful Deposits page")
    public void ıt_is_confirmed_that_the_banner_is_active_and_clicking_on_it_takes_you_to_the_successful_deposits_page(String string) {

    }
    @When("Verify that the filter and search buttons on the Successful Deposits page are functional and active")
    public void verify_that_the_filter_and_search_buttons_on_the_successful_deposits_page_are_functional_and_active() {

    }
    @When("It is confirmed that the page can be displayed with a list of successful deposits")
    public void ıt_is_confirmed_that_the_page_can_be_displayed_with_a_list_of_successful_deposits() {

    }
    @When("It is confirmed that the {string} banner is active and clicking on it takes you to the Pending Deposits page")
    public void ıt_is_confirmed_that_the_banner_is_active_and_clicking_on_it_takes_you_to_the_pending_deposits_page(String string) {

    }
    @When("Details Button appears in the List on the Pending Deposit page and confirms that it is active")
    public void details_button_appears_in_the_list_on_the_pending_deposit_page_and_confirms_that_it_is_active() {

    }
    @When("When entering the Pending Deposit page, click on the Details of any user and verify that the {string}, {string} Buttons can be displayed and are functional")
    public void when_entering_the_pending_deposit_page_click_on_the_details_of_any_user_and_verify_that_the_buttons_can_be_displayed_and_are_functional(String string, String string2) {

    }
    @When("When rejected, it is confirmed that the {string} page is displayed, the required fields are filled in and the message {string} is displayed.")
    public void when_rejected_it_is_confirmed_that_the_page_is_displayed_the_required_fields_are_filled_in_and_the_message_is_displayed(String string, String string2) {

    }
    @Given("When Approved, it is confirmed that the text {string} is seen")
    public void when_approved_it_is_confirmed_that_the_text_is_seen(String string) {

        Assert.assertTrue(adminPanel.approveSuccesText.isDisplayed());
    }

    //US-53
    @Given("Click on Nawbarda Deposits under Dashboard")
    public void click_on_nawbarda_deposits_under_dashboard() {
      adminPanel.depositsButton.click();
    }
    @Given("Successful Deposits\" page link")
    public void successful_deposits_page_link() {
        adminPanel.successfulDepositsButton.click();
    }
    @Given("Clicking on the {string} page link under the Deposits menu item confirms access to the {string} page")
    public void clicking_on_the_page_link_under_the_deposits_menu_item_confirms_access_to_the_page(String string, String string2) {
        Assert.assertTrue(adminPanel.successfuldepositTitle.isDisplayed());
    }
    @Given("Confirms that the Successful Deposits list is displayed on the page")
    public void confirms_that_the_successful_deposits_list_is_displayed_on_the_page() {
        Assert.assertTrue(adminPanel.successfuldepositTitle.isDisplayed());
    }
    @Given("List headings 'Gateway, Initiated,'User','Amount','Conversion','Status','Action' and the information under them are verified to be visible")
    public void list_headings_gateway_ınitiated_user_amount_conversion_status_action_and_the_information_under_them_are_verified_to_be_visible() {

        List<WebElement> webElementList= adminPanel.successfulDepositsList;

        for (WebElement element: webElementList) {
            Assert.assertTrue(element.isDisplayed());
        }

    }
    @Given("To access the details of the approved deposit, the {string} button appears and confirms that it is active")
    public void to_access_the_details_of_the_approved_deposit_the_button_appears_and_confirms_that_it_is_active(String string) {
        Assert.assertTrue(adminPanel.succesfulDepositsDetailsButton.isDisplayed());
    }
    @Given("Click on Details")
    public void click_on_details() {
        ReusableMethods.wait(3);
        adminPanel.succesfulDepositsDetailsButton.click();
    }
    @Given("It is confirmed that {string} information is displayed on the detail page of the withdrawal transaction selected from the list.")
    public void ıt_is_confirmed_that_information_is_displayed_on_the_detail_page_of_the_withdrawal_transaction_selected_from_the_list(String string) {
        List<WebElement> webElementList= adminPanel.cartInformation;

        for (WebElement element: webElementList) {
            Assert.assertTrue(element.isDisplayed());
        }

    }
}