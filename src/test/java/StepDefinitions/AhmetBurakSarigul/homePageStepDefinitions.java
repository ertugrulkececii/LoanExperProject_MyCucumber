package StepDefinitions.AhmetBurakSarigul;

import Pages.homePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;

public class homePageStepDefinitions {

    homePage homePage = new homePage();

    // TC_01 > US_01 codes
    @Given("goes to visitor {string}")
    public void go_to_visitor(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
    }
    @Given("verifies that the homepage is loaded.")
    public void verify_that_the_homepage_is_loaded() {

        Assert.assertTrue(homePage.getStartedButton.isDisplayed());
        ReusableMethods.wait(2);
    }
    @Given("close the page")
    public void close_the_page() {

        Driver.closeDriver();
    }

    // TC_01 > US_04 codes
    @Given("goes to {string}")
    public void goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
    }
    @Given("verifies that the home section under the menu heading is visible.")
    public void verifies_that_the_home_section_under_the_menu_heading_is_visible() {
        ReusableMethods.wait(20);
        //Driver.getDriver().findElement(By.xpath("//a[text()='Home']")).isDisplayed();
        Assert.assertTrue(homePage.homeSection.isDisplayed());
    }
    @Given("clicks on the home section")
    public void clicks_on_the_home_section() {
        homePage.homeSection.click();
    }
    @Given("verifies that the get started button is visible")
    public void verifies_that_the_get_started_button_is_visible() {
        Assert.assertTrue(homePage.getStartedButton.isDisplayed());
    }
    @Given("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

    // TC_02 > US_04 codes
    @Given("verifies that the about section under the menu heading is visible.")
    public void verifies_that_the_about_section_under_the_menu_heading_is_visible() {
        Assert.assertTrue(homePage.aboutSection.isDisplayed());
    }
    @Given("clicks on the about section.")
    public void clicks_on_the_about_section() {
        homePage.aboutSection.click();
    }
    @Given("verifies that the title contains about.")
    public void verifies_that_the_title_contains_about() {
        Driver.getDriver().getTitle().contains("About");
    }

    // TC_03 > US_04 codes
    @Given("feature section to be visible in the body of the home page.")
    public void feature_section_to_be_visible_in_the_body_of_the_home_page() {
        ReusableMethods.scrollDown(Driver.getDriver());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.featureSection.isDisplayed());
    }
    @Given("verifies that the headings are visible under the Feature section of the home page.")
    public void verifies_that_the_headings_are_visible_under_the_feature_section_of_the_home_page() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.quickApprovalProcesses.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.variousLoanTypes.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.flexibleRepaymentTerms.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.competitiveInterestRates.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.digitalApplicationandProcessing.isDisplayed());
    }

    @Given("verifies that Support, Low Cost are displayed under the Feature section.")
    public void verifies_that_support_low_cost_are_displayed_under_the_feature_section() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.support.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.lowCost.isDisplayed());
    }
    @Given("verifies that Support, Low Cost icons are displayed under the Feature section.")
    public void verifies_that_support_low_cost_icons_are_displayed_under_the_feature_section() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.supportIcon.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.lowCostIcon.isDisplayed());
    }

    // TC_04 > US_04 codes
    @Given("verifies that the Featured Plans section is displayed in the Home page.")
    public void verifies_that_the_featured_plans_section_is_displayed_in_the_home_page() {
        ReusableMethods.scrollDown(Driver.getDriver());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.featuredPlansSection.isDisplayed());
    }
    @Given("verifies that the Basic Loan button is visible and active under the Featured Plans section.")
    public void verifies_that_the_basic_loan_button_is_visible_and_active_under_the_featured_plans_section() {
        ReusableMethods.wait(2);
        homePage.basicLoanButton.isDisplayed();
        ReusableMethods.wait(2);
        homePage.basicLoanButton.isEnabled();
    }
    @Given("clicks on the Basic Loan button.")
    public void clicks_on_the_basic_loan_button() {
        ReusableMethods.wait(10);
        homePage.basicLoanButton.click();
    }

    @Given("verifies that Test Loan Card is displayed under Basic Loan button.")
    public void verifies_that_test_loan_card_is_displayed_under_basic_loan_button() {

    }
    @Given("verifies that the Apply Now button is visible and active under Test Loan Card.")
    public void verifies_that_the_apply_now_button_is_visible_and_active_under_test_loan_card() {

    }
    @Given("clicks on the Apply Now button.")
    public void clicks_on_the_apply_now_button() {

    }
    @Given("verifies that the message You are not logged in! is displayed in the pop-up window.")
    public void verifies_that_the_message_you_are_not_logged_in_is_displayed_in_the_pop_up_window() {

    }
    @Given("verifies that there is a link button to the login page in the pop-up window.")
    public void verifies_that_there_is_a_link_button_to_the_login_page_in_the_pop_up_window() {

    }
    @Given("clicks the close button in the window that opens.")
    public void clicks_the_close_button_in_the_window_that_opens() {

    }
    @Given("verifies that the {string} button is visible under Featured plans.")
    public void verifies_that_the_button_is_visible_under_featured_plans(String string) {

    }
    @Given("clicks on the See All button.")
    public void clicks_on_the_see_all_button() {

    }
    @Given("verifies that the text Loan Plans is visible in the body of the page.")
    public void verifies_that_the_text_loan_plans_is_visible_in_the_body_of_the_page() {

    }



}
