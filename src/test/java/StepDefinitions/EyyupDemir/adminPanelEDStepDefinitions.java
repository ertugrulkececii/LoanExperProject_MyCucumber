package StepDefinitions.EyyupDemir;

import Pages.adminPanel;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class adminPanelEDStepDefinitions {

    adminPanel adminPanel = new adminPanel();

    @Given("go to admin {string} page")
    public void go_to_admin_page(String string)
    {
        Driver.getDriver().get(ConfigReader.getProperty("adminLoginPage"));

    }

    @Given("in the window that opens, you enter admin username")
    public void in_the_window_that_opens_you_enter_admin_username() {
        adminPanel.usernameBox.sendKeys(ConfigReader.getProperty("adminEyyup"));

    }

    @Given("in the window that opens, you enter admin password")
    public void in_the_window_that_opens_you_enter_admin_password() {
        adminPanel.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Given("Click on the login button")
    public void click_on_the_login_button() {
    adminPanel.loginButton.click();
    ReusableMethods.wait(1);
    }

    @Given("verifies that it  log into the site")
    public void verifies_that_it_log_into_the_site() {
       Assert.assertTrue( adminPanel.sideBarLoans.isDisplayed());
    }

    @Given("Loans is clicked from the side bar menu")
    public void loans_is_clicked_from_the_side_bar_menu() {
        adminPanel.sideBarLoans.click();
        ReusableMethods.wait(2);
    }

    @Given("It is confirmed that there are {string} in the Side bar")
    public void it_is_confirmed_that_there_are_in_the_side_bar(String string) {
        Assert.assertTrue( adminPanel.sideBarLoans.isDisplayed());
    }


    @Given("Pending Loans is confirmed to be visible")
    public void pending_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue( adminPanel.pendingLoans.isDisplayed());
    }
    @Given("Running Loans is confirmed to be visible")
    public void running_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue( adminPanel.runningLoans.isDisplayed());
    }
    @Given("Due Loans is confirmed to be visible")
    public void due_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue( adminPanel.dueLoans.isDisplayed());
    }
    @Given("Paid Loans is confirmed to be visible")
    public void paid_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue( adminPanel.paidLoans.isDisplayed());
    }
    @Given("Rejected Loans is confirmed to be visible")
    public void rejected_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue( adminPanel.rejectedLoans.isDisplayed());
    }
    @Given("All Loans is confirmed to be visible")
    public void all_loans_is_confirmed_to_be_visible() {
        Assert.assertTrue( adminPanel.allLoans.isDisplayed());
    }

    @Given("it is confirmed Pending Loans page title Pending Loans are  to open")
    public void it_is_confirmed_pending_credits_page_title_pending_loans_are_to_open() {
        adminPanel.pendingLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue( adminPanel.pendingLoans.isDisplayed());
    }
    @Given("it is confirmed Running Loans page title Running Loans are  to open")
    public void it_is_confirmed_running_loans_page_title_running_loans_are_to_open() {
        adminPanel.runningLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue( adminPanel.runningLoans.isDisplayed());
    }
    @Given("it is confirmed Due Loans page title Due Loans are  to open")
    public void it_is_confirmed_due_loans_page_title_due_loans_are_to_open() {
        adminPanel.dueLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue( adminPanel.dueLoans.isDisplayed());
    }
    @Given("it is confirmed Paid Loans page title Paid Loans are  to open")
    public void it_is_confirmed_paid_loans_page_title_paid_loans_are_to_open() {
        adminPanel.paidLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue( adminPanel.paidLoans.isDisplayed());
    }
    @Given("it is confirmed Rejected Loans page title Rejected Loans are  to open")
    public void it_is_confirmed_rejected_loans_page_title_rejected_loans_are_to_open() {
        adminPanel.rejectedLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue( adminPanel.rejectedLoans.isDisplayed());
    }
    @Given("it is confirmed All Loans page title All Loans are  to open")
    public void it_is_confirmed_all_loans_page_title_all_loans_are_to_open() {
        adminPanel.allLoans.click();
        ReusableMethods.wait(1);
        Assert.assertTrue( adminPanel.allLoans.isDisplayed());
    }
}

