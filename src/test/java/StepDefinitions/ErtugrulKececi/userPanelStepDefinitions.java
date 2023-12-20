package StepDefinitions.ErtugrulKececi;

import Pages.homePage;
import Pages.userPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class userPanelStepDefinitions {

    userPanel userPanel = new userPanel();

    Actions actions =new Actions(Driver.getDriver());

    homePage homePage=new homePage();
    @Given("Navigate to the URL by entering in the browser's address {string} bar and pressing the Enter key.")
    public void navigate_to_the_url_by_entering_in_the_browser_s_address_bar_and_pressing_the_enter_key(String homePageURL) {

        Driver.getDriver().get(ConfigReader.getProperty(homePageURL));
    }
    @Then("Click on the Login button.")
    public void click_on_the_login_button() {
        //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        //ReusableMethods.wait(2);
        //jse.executeScript("arguments[0].scrollIntoView(true);",homePage.AllowYaziElementi);
        //ReusableMethods.wait(2);
        //jse.executeScript("arguments[0].click();",homePage.AllowYaziElementi);
        ReusableMethods.wait(2);
        userPanel.AllowYaziElementi.click();
        ReusableMethods.wait(2);
        userPanel.firstLogin.click();
    }
    @Then("Fill in user information.")
    public void fill_in_user_information() {
        userPanel.userName.sendKeys(ConfigReader.getProperty("userNameErtugrul"));
        ReusableMethods.wait(2);
        userPanel.password.sendKeys(ConfigReader.getProperty("userPasswordErtugrul"));
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        userPanel.login2.sendKeys(Keys.ENTER);

        ReusableMethods.wait(5);
    }
    @Then("Test the functionality and visibility of the logout button.")
    public void test_the_functionality_and_visibility_of_the_logout_button() {
        ReusableMethods.wait(1);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", userPanel.logoutButton);

        ReusableMethods.wait(1);
        Assert.assertTrue(userPanel.logoutButton.isDisplayed());
    }
    @Then("Return to the home page.")
    public void return_to_the_home_page() {
        ReusableMethods.wait(2);
        userPanel.logoutButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPanel.logoutSlideElement.isDisplayed());

    }
    @Then("Close the web page.")
    public void close_the_web_page() {

        Driver.closeDriver();
    }

}
