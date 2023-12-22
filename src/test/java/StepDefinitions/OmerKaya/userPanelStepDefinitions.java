package StepDefinitions.OmerKaya;

import Pages.homePage;
import Pages.userPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class userPanelStepDefinitions {

    userPanel userPanel = new userPanel();
    homePage homePage = new homePage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("user clicks on the login button and enters the system with the registered {string} and {string}")
    public void user_clicks_on_the_login_button_and_enters_the_system_with_the_registered_and(String validUserName, String validPassword) {
        ReusableMethods.wait(2);
        homePage.allowButton.click();
        homePage.loginButton.click();
        ReusableMethods.wait(3);
        homePage.allowButton.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        homePage.usernameTextBox.sendKeys(ConfigReader.getProperty("validUserName"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("validPassword"));
        homePage.loginButtonOnLoginPage.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPanel.accountBalanceOnDashboard.isDisplayed());




    }
    @Given("displays user profile information and updates first and last name")
    public void displays_user_profile_information_and_updates_first_and_last_name() {

        userPanel.profileButtonOnDashboard.click();
        Assert.assertTrue(userPanel.profileBoard1.isDisplayed());
        Assert.assertTrue(userPanel.profileBoard2.isDisplayed());

        userPanel.firstNameBoxOnUserProfile.clear();
        ReusableMethods.wait(1);
        userPanel.firstNameBoxOnUserProfile.sendKeys(ConfigReader.getProperty("denemeIsim"));
        ReusableMethods.wait(1);
        userPanel.lastNameBoxOnUserProfile.clear();
        ReusableMethods.wait(1);
        userPanel.lastNameBoxOnUserProfile.sendKeys(ConfigReader.getProperty("denemeSoyisim"));
        ReusableMethods.wait(1);
        userPanel.submitButtonOnUserProfile.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPanel.successfullAlert.isDisplayed());
        ReusableMethods.wait(9);







    }
    @Given("user uploads profile picture")
    public void user_uploads_profile_picture() throws IOException {


        userPanel.uploadPhotoButton.sendKeys(ConfigReader.getProperty("denemeProfilPhoto"));
        ReusableMethods.getScreenshot("profilePhoto");
        ReusableMethods.wait(3);
        Assert.assertTrue(userPanel.profileBoard1.isDisplayed());
        userPanel.submitButtonOnUserProfile.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPanel.successfullAlert.isDisplayed());
        ReusableMethods.wait(9);





    }
    @Given("user registers a {string} and receives an error message")
    public void user_registers_a_non_numeric_zip_code_and_receives_an_error_message(String non_numeric_zip_code) {
        // Bug Report!!!
        userPanel.zipCodeBox.clear();
        userPanel.zipCodeBox.sendKeys(ConfigReader.getProperty("non_numeric_zip_code"));
        userPanel.submitButtonOnUserProfile.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPanel.successfullAlert.isDisplayed()); // nonnumeric karakter girmeme rağmen başarı ile kayıt yapıyor.
        ReusableMethods.wait(9);


    }
    @Given("displays successful registration when the user enters the required informations")
    public void displays_successful_registration_when_the_user_enters_the_required_informations() {

        userPanel.stateBox.clear();
        userPanel.stateBox.sendKeys(ConfigReader.getProperty("state"));
        userPanel.cityBox.clear();
        userPanel.cityBox.sendKeys(ConfigReader.getProperty("city"));
        userPanel.submitButtonOnUserProfile.click();
        ReusableMethods.wait(1);
        System.out.println(userPanel.successfullAlert.getText());
        Assert.assertTrue(userPanel.successfullAlert.isDisplayed());

        Driver.closeDriver();



    }

}
