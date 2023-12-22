package StepDefinitions.NecmettinKizildag;

import Pages.adminPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class adminPanelStepDefinitions {

    adminPanel adminPanel = new adminPanel();


    Faker faker = new Faker();
    String newName = "Super Admins " + faker.name().firstName();

    String newEmail = faker.internet().emailAddress();


    @Then("test that the header of admin page is visible")
    public void testThatTheHeaderOfAdminPageIsVisible() {
        Assert.assertTrue(adminPanel.headerOfAdminLoginPage.isDisplayed());
    }

    @Then("test that the username textBox on admin login page is visible and active")
    public void testThatTheUsernameTextBoxonadminloginpageIsVisibleAndActive() {
        Assert.assertTrue(adminPanel.usernameBox.isEnabled());
        Assert.assertTrue(adminPanel.usernameBox.isDisplayed());
    }

    @Then("test that the password textBox on admin login page is visible and active")
    public void testThatThePasswordTextBoxOnAdminLoginPageIsVisibleAndActive() {
        Assert.assertTrue(adminPanel.passwordBox.isEnabled());
        Assert.assertTrue(adminPanel.passwordBox.isDisplayed());
    }

    @Then("test that the login button on admin login page is visible and active")
    public void testThatTheLoginButtonOnAdminLoginPageIsVisibleAndActive() {
        Assert.assertTrue(adminPanel.loginButton.isEnabled());
        Assert.assertTrue(adminPanel.loginButton.isDisplayed());
    }

    @And("enter the valid admin username in the usernameBox")
    public void enterTheValidAdminUsernameInTheUsernameBox() {
        adminPanel.usernameBox.sendKeys(ConfigReader.getProperty("validUserNameNecmettin"));
    }

    @And("enter the valid admin password in the passwordBox")
    public void enterTheValidAdminPasswordInThePasswordBox() {
        adminPanel.passwordBox.sendKeys(ConfigReader.getProperty("newAdminPassword"));
    }

    @And("click login on admin login page button")
    public void clickLoginOnAdminLoginPageButton() {
        adminPanel.loginButton.click();
    }

    @Then("test that the admin icon is visible")
    public void testThatTheAdminIconIsVisible() {
        Assert.assertTrue(adminPanel.adminIcon.isDisplayed());
    }


    @And("click admin icon")
    public void clickAdminIcon() {
        adminPanel.adminIcon.click();
    }


    @Then("test that the profile button is visible and active")
    public void testThatTheProfileButtonIsVisibleAndActive() {
        Assert.assertTrue(adminPanel.profileButton.isDisplayed());
        Assert.assertTrue(adminPanel.profileButton.isEnabled());
    }

    @Then("test that the password button is visible and active")
    public void testThatThePasswordButtonIsVisibleAndActive() {
        Assert.assertTrue(adminPanel.passwordButton.isDisplayed());
        Assert.assertTrue(adminPanel.passwordButton.isEnabled());
    }

    @Then("test that the logout button is visible and active")
    public void testThatTheLogoutButtonIsVisibleAndActive() {
        Assert.assertTrue(adminPanel.logoutButton.isDisplayed());
        Assert.assertTrue(adminPanel.logoutButton.isEnabled());
    }

    @Then("click profile button")
    public void clickProfileButton() {
        adminPanel.profileButton.click();
    }

    @Then("verify that the title of the page is {string}")
    public void verifyThatTheTitleOfThePageIs(String pageTitle) {
        String actualPageTitle = adminPanel.headerOfPage.getText();
        String expectedPageTitle = pageTitle;

        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }

    @And("enter a new name in the nameBox")
    public void enterANewNameInTheNameBox() {

        adminPanel.nameBoxOnProfilePage.clear();
        adminPanel.nameBoxOnProfilePage.sendKeys(newName);
    }


    @And("enter a new email in the emailBox")
    public void enterANewEmailInTheEmailBox() {
        adminPanel.emailBoxOnProfilePage.clear();
        adminPanel.emailBoxOnProfilePage.sendKeys(newEmail);
    }


    @And("click submit button on admin profile page")
    public void clickSubmitButtonOnAdminProfilePage() {
        adminPanel.submitButtonOnProfilePage.click();
    }


    @Then("verify that the name has changed")
    public void verifyThatTheNameHasChanged() {
        String expectedName = newName;
        String actualName = adminPanel.nameOnAdminCard.getText();

        Assert.assertEquals(expectedName,actualName);
    }

    @Then("verify that the email has changed")
    public void verifyThatTheEmailHasChanged() {
        String expectedEmail = newEmail;
        String actualEmail = adminPanel.emailOnAdminCard.getText();

        Assert.assertEquals(expectedEmail,actualEmail);
    }

    @And("click password button")
    public void clickPasswordButton() {
        adminPanel.passwordButton.click();
    }

    @And("enter {string} in the passwordBox")
    public void enterInThePasswordBox(String password) {
        adminPanel.passwordBoxOnPasswordSettingsPage.sendKeys(ConfigReader.getProperty(password));
    }

    @And("enter {string} in the newPasswordBox")
    public void enterInTheNewPasswordBox(String newPassword) {
        adminPanel.newPasswordBox.sendKeys(ConfigReader.getProperty(newPassword));
    }

    @And("enter {string} in the conformPasswordBox")
    public void enterInTheConformPasswordBox(String newPassword) {
        adminPanel.confirmPasswordBox.sendKeys(ConfigReader.getProperty(newPassword));
    }


    @And("click submit button on admin password page")
    public void clickSubmitButtonOnAdminPasswordPage() {
        adminPanel.submitButtonOnProfilePage.click();
    }

    @And("click logout button")
    public void clickLogoutButton() {
        adminPanel.logoutButton.click();
    }
}
