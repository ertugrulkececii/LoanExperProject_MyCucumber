package StepDefinitions.NecmettinKizildag;

import Pages.homePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class homePageStepDefinitions {

    homePage homePage = new homePage();



    @Given("go to {string}")
    public void go_to(String string) {
       Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @And("click login button")
    public void clickLoginButton() {
        ReusableMethods.wait(1);
        homePage.loginButton.click();
    }

    @Then("test that the {string} element is visible")
    public void test_that_the_element_is_visible(String string) {

    }
    @Then("test that the {string} element is active")
    public void test_that_the_element_is_active(String string) {

    }

    @Then("Test that the login button is visible and active")
    public void testThatTheLoginButtonIsVisibleAndActive() {
        Assert.assertTrue(homePage.loginButton.isDisplayed());
        Assert.assertTrue(homePage.loginButton.isEnabled());
    }

    @And("close page")
    public void closePage() {
        Driver.closeDriver();
        ReusableMethods.wait(2);
    }

    @And("scroll down the page until the login form appears")
    public void scrollDownThePageUntilTheLoginFormAppears() {
        ReusableMethods.wait(3);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", homePage.headerOfLoginForm);

        ReusableMethods.wait(3);
    }

    @Then("test that the username textBox is visible and active")
    public void testThatTheUsernameTextBoxIsVisibleAndActive() {
        Assert.assertTrue(homePage.usernameTextBox.isEnabled());
        Assert.assertTrue(homePage.usernameTextBox.isDisplayed());
    }


    @Then("test that the password textBox is visible and active")
    public void testThatThePasswordTextBoxIsVisibleAndActive() {
        Assert.assertTrue(homePage.passwordTextBox.isDisplayed());
        Assert.assertTrue(homePage.passwordTextBox.isEnabled());
    }

    @Then("test that the remember me checkBox is visible and active")
    public void testThatTheRememberMeCheckBoxIsVisibleAndActive() {
        Assert.assertTrue(homePage.rememberMeCheckBox.isEnabled());
        Assert.assertTrue(homePage.rememberMeCheckBox.isDisplayed());
    }


    @Then("test that the forgot password link is visible and active")
    public void testThatTheForgotPasswordLinkIsVisibleAndActive() {
        Assert.assertTrue(homePage.forgotPasswordLink.isDisplayed());
        Assert.assertTrue(homePage.forgotPasswordLink.isEnabled());
    }


    @Then("test that the login button on login page is visible and active")
    public void testThatTheLoginButtonOnLoginPageIsVisibleAndActive() {
        Assert.assertTrue(homePage.loginButtonOnLoginPage.isEnabled());
        Assert.assertTrue(homePage.loginButtonOnLoginPage.isDisplayed());
    }

    @Then("test that the register now link is visible and active")
    public void testThatTheRegisterNowLinkIsVisibleAndActive() {
        Assert.assertTrue(homePage.registerNowLink.isDisplayed());
        Assert.assertTrue(homePage.registerNowLink.isEnabled());
    }

    @And("enter the valid username in the usernameBox")
    public void enterTheValidUsernameInTheUsernameBox() {
        ReusableMethods.wait(1);
        homePage.usernameTextBox.sendKeys(ConfigReader.getProperty("validUserNameNecmettin"));
    }

    @And("enter the valid password in the passwordBox")
    public void enterTheValidPasswordInThePasswordBox() {
        ReusableMethods.wait(1);
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("validUserPasswordNecmettin"));
    }

    @And("click login button on user login page")
    public void clickLoginButtonOnUserLoginPage() {
        ReusableMethods.wait(1);
        homePage.loginButtonOnLoginPage.click();
    }


    @And("enter the invalid password in the passwordBox")
    public void enterTheInvalidPasswordInThePasswordBox() {
        ReusableMethods.wait(1);
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("invalidPasswordNecmettin"));
    }

    @And("enter the invalid username in the usernameBox")
    public void enterTheInvalidUsernameInTheUsernameBox() {
        ReusableMethods.wait(1);
        homePage.usernameTextBox.sendKeys(ConfigReader.getProperty("invalidUserNameNecmettin"));
    }

    @And("click forgot password link")
    public void clickForgotPasswordLink() {
        ReusableMethods.wait(3);
        homePage.forgotPasswordLink.click();
    }

    @When("test that the submit button is visible and active")
    public void testThatTheSubmitButtonIsVisibleAndActive() {
        Assert.assertTrue(homePage.submitButton.isDisplayed());
        Assert.assertTrue(homePage.submitButton.isEnabled());
    }



    @Then("test that the These credentials do not match our records. warning is visible")
    public void testThatTheTheseCredentialsDoNotMatchOurRecordsWarningIsVisible() {
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.warningOfInvalidUserInfo.isDisplayed());
    }

    @And("enter the valid username in the usernameBox on forgot password page")
    public void enterTheValidUsernameInTheUsernameBoxOnForgotPasswordPage() {
        homePage.usernameTextBoxOnForgotPasswordPage.sendKeys(ConfigReader.getProperty("testUserNameNecmettin"));
    }

    @And("click submit button")
    public void clickSubmitButton() {
        homePage.submitButton.click();
    }

    @Then("test that the Password reset email sent successfully warning is visible")
    public void testThatThePasswordResetEmailSentSuccessfullyWarningIsVisible() {
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.warningOfResetPassword.isDisplayed());
    }

    @And("click Try to send again link")
    public void clickTryToSendAgainLink() {
        ReusableMethods.wait(1);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", homePage.submitButton);

        ReusableMethods.wait(1);
        homePage.resendResetPasswordLink.click();
    }

    @Then("test that the header of Account Recovery is visible")
    public void testThatTheHeaderOfAccountRecoveryIsVisible() {
        Assert.assertTrue(homePage.headerOfAccountRecoveryPage.isDisplayed());
    }

    @And("click Register Now link")
    public void clickRegisterNowLink() {
        homePage.registerNowLink.click();
    }


}
