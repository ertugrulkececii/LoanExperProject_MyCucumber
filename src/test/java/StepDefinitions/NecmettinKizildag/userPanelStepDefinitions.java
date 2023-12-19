package StepDefinitions.NecmettinKizildag;

import Pages.userPanel;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class userPanelStepDefinitions {

    userPanel userPanel = new userPanel();


    @Then("test that the dashboard button is visible and active")
    public void testThatTheDashboardButtonIsVisibleAndActive() {
        Assert.assertTrue(userPanel.dashboardButton.isDisplayed());
        Assert.assertTrue(userPanel.dashboardButton.isEnabled());
    }

    @Then("test that the dashboard button is not visible and active")
    public void testThatTheDashboardButtonIsNotVisibleAndActive() {

    }
}
