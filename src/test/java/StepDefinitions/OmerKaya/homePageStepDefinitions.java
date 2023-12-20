package StepDefinitions.OmerKaya;

import Pages.homePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class homePageStepDefinitions {

    homePage homePage = new homePage();


    @Given("go to {string} in the browser")
    public void go_to_in_the_browser(String homePageURL) {
        Driver.getDriver().get(ConfigReader.getProperty("homePageURL"));
    }

    @Given("top bar of the home page and should be able to visible contact information in the top bar")
    public void top_bar_of_the_home_page_and_should_be_able_to_contact_information_in_the_top_bar() {
        ReusableMethods.wait(2);
        homePage.allowButton.click();
        Assert.assertTrue(homePage.HomePageEmailContact.isDisplayed());
        Assert.assertTrue(homePage.HomePageAddressContact.isDisplayed());
        Assert.assertTrue(homePage.HomePagePhoneContact.isDisplayed());


    }

    @Given("site logo and menu titles should be able to visible and active at top bar of the Home page")
    public void site_logo_and_menu_titles_should_be_able_to_visible_and_active_at_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.loanTechLogo.isDisplayed());
        Assert.assertTrue(homePage.homeLogoOnMenuTitle.isDisplayed());
        Assert.assertTrue(homePage.aboutLogoOnMenuTitle.isDisplayed());
        Assert.assertTrue(homePage.plansLogoOnMenuTitle.isDisplayed());
        Assert.assertTrue(homePage.blogsLogoOnMenuTitle.isDisplayed());
        Assert.assertTrue(homePage.contactLogoOnMenuTitle.isDisplayed());
        homePage.loanTechLogo.click();
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        ReusableMethods.wait(2);

        homePage.homeLogoOnMenuTitle.click();
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        ReusableMethods.wait(2);

        homePage.aboutLogoOnMenuTitle.click();
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        ReusableMethods.wait(2);

        homePage.plansLogoOnMenuTitle.click();
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        ReusableMethods.wait(2);

        homePage.blogsLogoOnMenuTitle.click();
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        ReusableMethods.wait(2);

        homePage.contactLogoOnMenuTitle.click();
        ReusableMethods.wait(2);


    }

   /* @Given("user clicks on the logo on the top bar of the homepage, it switches to the homepage")
    public void user_clicks_on_the_logo_on_the_top_bar_of_the_homepage_it_switches_to_the_homepage() {
        homePage.loanTechLogo.click();
        Assert.assertTrue(homePage.homePageContentText.isDisplayed());
        String homePageContentText = homePage.homePageContentText.getText();
        System.out.println(homePageContentText);
        Assert.assertTrue(homePageContentText.contains("One Loan at a Time"));


    }*/

}
