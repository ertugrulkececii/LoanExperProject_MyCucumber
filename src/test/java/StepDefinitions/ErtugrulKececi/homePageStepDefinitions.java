package StepDefinitions.ErtugrulKececi;

import Pages.homePage;
import Pages.userPanel;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class homePageStepDefinitions {

    homePage homePage = new homePage();


    @Then("Test access to the website with the given URL")
    public void test_access_to_the_website_with_the_given_url() {

        Assert.assertTrue(homePage.LoanHomeLogoLink.isDisplayed());
    }
    @Then("Verify that the email information in the top bar of the homepage is visible.")
    public void verify_that_the_email_information_in_the_top_bar_of_the_homepage_is_visible() {
      Assert.assertTrue(homePage.headerEmailText.isDisplayed());
    }
    @Then("Verify that the adress information in the top bar of the home page is visible.")
    public void verify_that_the_adress_information_in_the_top_bar_of_the_home_page_is_visible() {
        Assert.assertTrue(homePage.headerAdressText.isDisplayed());
    }
    @Then("Verify that the phone information in the top bar of the home page is visible.")
    public void verify_that_the_phone_information_in_the_top_bar_of_the_home_page_is_visible() {
        Assert.assertTrue(homePage.headerPhoneText.isDisplayed());
    }
    @Then("Verify that the About banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_about_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {
        ReusableMethods.wait(2);
        userPanel userPanel= new userPanel();
        ReusableMethods.wait(1);
        userPanel.AllowYaziElementi.click();

        Assert.assertTrue(homePage.headerAboutButton.isDisplayed());
        ReusableMethods.wait(1);
       Assert.assertTrue(homePage.headerAboutButton.isEnabled());
       homePage.headerAboutButton.click();

    }
    @Then("Verify that the Plans banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_plans_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {
        Assert.assertTrue(homePage.headerPLansButton.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.headerPLansButton.isEnabled());
        homePage.headerPLansButton.click();

    }
    @Then("Verify that the Blogs banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_blogs_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {
        Assert.assertTrue(homePage.headerBlogsButton.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.headerBlogsButton.isEnabled());
        homePage.headerBlogsButton.click();
    }
    @Then("Verify that the Contact banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_contact_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {
        Assert.assertTrue(homePage.headerContactButton.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.headerContactButton.isEnabled());
        homePage.headerContactButton.click();
    }
    @Then("Verify that the Login icon banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_login_icon_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {

        Assert.assertTrue(homePage.loginButton.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.loginButton.isEnabled());
        homePage.loginButton.click();

    }
    @Then("Verify that the Home banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_home_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {
        Assert.assertTrue(homePage.headerHomeButton.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.headerHomeButton.isEnabled());
        homePage.headerHomeButton.click();
    }
    @Then("Verify that the Get Started Icon banner on the top bar of the home page is visible and clickable.")
    public void verify_that_the_get_started_ıcon_banner_on_the_top_bar_of_the_home_page_is_visible_and_clickable() {
        Assert.assertTrue(homePage.getStartedLogoOnHomePage.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.getStartedLogoOnHomePage.isEnabled());
        homePage.getStartedLogoOnHomePage.click();
    }

// [TC_004]

    @Then("Verify that clicking on the About banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_about_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        userPanel userPanel=new userPanel();
        ReusableMethods.wait(2);
        userPanel.AllowYaziElementi.click(); ReusableMethods.wait(2);
        homePage.headerAboutButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.bodyAboutText.isDisplayed());
    }
    @Then("Verify that clicking on the PLans banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_p_lans_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        ReusableMethods.wait(1);
        homePage.headerPLansButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.bodyPlansText.isDisplayed());
    }
    @Then("Verify that clicking on the Blogs banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_blogs_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        ReusableMethods.wait(1);
        homePage.headerBlogsButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.bodyBlogsText.isDisplayed());
    }
    @Then("Verify that clicking on the Contact banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_contact_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        ReusableMethods.wait(1);
        homePage.headerContactButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.bodyContactText.isDisplayed());
    }
    @Then("Verify that clicking on the Login banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_login_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        ReusableMethods.wait(1);
        homePage.loginButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.bodyLoginText.isDisplayed());
    }
    @Then("Verify that clicking on the Home banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_home_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        ReusableMethods.wait(1);
        homePage.headerHomeButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.getStartedButton.isDisplayed());
    }
    @Then("Verify that clicking on the Get Started banner in the top bar of the home page takes you to the desired page.")
    public void verify_that_clicking_on_the_get_started_banner_in_the_top_bar_of_the_home_page_takes_you_to_the_desired_page() {
        ReusableMethods.wait(1);
        homePage.getStartedButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.bodyGetStartedText.isDisplayed());
    }

}
