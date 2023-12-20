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
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.testLoanCard.isDisplayed());
    }
    @Given("verifies that the Apply Now button is visible and active under Test Loan Card.")
    public void verifies_that_the_apply_now_button_is_visible_and_active_under_test_loan_card() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.applyNowButton.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.applyNowButton.isEnabled());
    }
    @Given("clicks on the Apply Now button.")
    public void clicks_on_the_apply_now_button() {
        ReusableMethods.wait(2);
        homePage.applyNowButton.click();
    }
    @Given("verifies that the message You are not logged in! is displayed in the pop-up window.")
    public void verifies_that_the_message_you_are_not_logged_in_is_displayed_in_the_pop_up_window() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.youAreNotLoggedInMessage.isDisplayed());
    }
    @Given("verifies that there is a link button to the login page in the pop-up window.")
    public void verifies_that_there_is_a_link_button_to_the_login_page_in_the_pop_up_window() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.youAreNotLoginMessageUnderLoginButton.isDisplayed());
    }
    @Given("clicks the close button in the window that opens.")
    public void clicks_the_close_button_in_the_window_that_opens() {
        ReusableMethods.wait(2);
        homePage.youAreNotLoginMessageUnderCloseButton.click();
    }
    @Given("verifies that the See All button is visible under Featured plans.")
    public void verifies_that_the_see_all_button_is_visible_under_featured_plans() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.seeAllButton.isDisplayed());
    }
    @Given("clicks on the See All button.")
    public void clicks_on_the_see_all_button() {
        ReusableMethods.wait(2);
        homePage.seeAllButton.click();
    }
    @Given("verifies that the text Loan Plans is visible in the body of the page.")
    public void verifies_that_the_text_loan_plans_is_visible_in_the_body_of_the_page() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.loanPlansText.isDisplayed());
    }

    // TC_05 > US_04 codes
    @Given("verifies that the information on customer satisfaction on the homepage is visible.")
    public void verifies_that_the_information_on_customer_satisfaction_on_the_homepage_is_visible() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.countryWide.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.happyClient.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.winningAwards.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.totalLoan.isDisplayed());
    }
    @Given("verifies that the Frequently Asked Questions section is visible in the home page.")
    public void verifies_that_the_frequently_asked_questions_section_is_visible_in_the_home_page() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.frequentlyAskedQuestionsSection.isDisplayed());
    }
    @Given("confirms that frequently asked questions are displayed under the Frequently Asked Questions heading.")
    public void confirms_that_frequently_asked_questions_are_displayed_under_the_frequently_asked_questions_heading() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.frequentlyAskedQuestions1.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.frequentlyAskedQuestions2.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.frequentlyAskedQuestions3.isDisplayed());
    }
    @Given("verifies that the accordion buttons at the end of the frequently asked questions are visible and active.")
    public void verifies_that_the_accordion_buttons_at_the_end_of_the_frequently_asked_questions_are_visible_and_active() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.accordionButtonPlus.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.accordionButtonMinus.isDisplayed());
    }
    @Given("verifies that a slider introducing company employees is visible in the home page.")
    public void verifies_that_a_slider_introducing_company_employees_is_visible_in_the_home_page() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.sliderText.isDisplayed());
    }
    @Given("verifies that the left-right buttons below the slider are visible and active.")
    public void verifies_that_the_left_right_buttons_below_the_slider_are_visible_and_active() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.rightButton.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.leftButton.isDisplayed());
    }

    // TC_06 > US_04 codes
    @Given("verifies that the Blog Post section is visible in the home page.")
    public void verifies_that_the_blog_post_section_is_visible_in_the_home_page() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.blogPostSection.isDisplayed());
    }
    @Given("verifies that the date and time of the blogs are visible.")
    public void verifies_that_the_date_and_time_of_the_blogs_are_visible() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.dateAndTime.isDisplayed());
    }
    @Given("verifies that the title Like To Become A Hero is visible in the home page.")
    public void verifies_that_the_title_like_to_become_a_hero_is_visible_in_the_home_page() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.likeToBecomeAHeroText.isDisplayed());
    }
    @Given("verifies that the Take Loan button to the right of the Like To Become A Hero heading in the home page is visible and active.")
    public void verifies_that_the_take_loan_button_to_the_right_of_the_like_to_become_a_hero_heading_in_the_home_page_is_visible_and_active() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.takeLoanButton.isDisplayed());
        Assert.assertTrue(homePage.takeLoanButton.isEnabled());
    }





}
