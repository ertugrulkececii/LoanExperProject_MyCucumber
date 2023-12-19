package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class adminPanel {

    public adminPanel(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    //Hayırlı haftasonları arkadaşlar

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = " //*[text()=\"LOGIN\"]")
    public WebElement loginButton ;


    @FindBy(xpath = " //*[text()=\"Loans\"]")
    public WebElement sideBarLoans ;

    @FindBy(xpath = " //*[text()=\"Pending Loans\"]")
    public WebElement pendingLoans ;

    @FindBy(xpath = " //*[text()=\"Running Loans\"]")
    public WebElement runningLoans ;

    @FindBy(xpath = " //*[text()=\"Due Loans\"]")
    public WebElement dueLoans ;

    @FindBy(xpath = " //*[text()=\"Paid Loans\"]")
    public WebElement paidLoans ;

    @FindBy(xpath = " //*[text()=\"Rejected Loans\"]")
    public WebElement rejectedLoans ;

    @FindBy(xpath = " //*[text()=\"All Loans\"]")
    public WebElement allLoans ;


    @FindBy(xpath = "//p[@class=\"text-white\"]")
    public WebElement headerOfAdminLoginPage;


    @FindBy(xpath = "//span[@class=\"navbar-user__thumb\"]")
    public WebElement adminIcon;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profileButton;

    @FindBy(xpath = "//*[text()='Password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//h6[@class=\"page-title\"]")
    public WebElement headerOfPage;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement nameBoxOnProfilePage;


    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailBoxOnProfilePage;


    @FindBy(xpath = "//*[text()=\"Upload Image\"]")
    public WebElement uploadImageButtonOnProfilePage;


    @FindBy(xpath = "//*[text()=\"Submit\"]")
    public WebElement submitButtonOnProfilePage;


    @FindBy(xpath = "(//span[@class=\"fw-bold\"])[1]")
    public WebElement nameOnAdminCard;


    @FindBy(xpath = "(//span[@class=\"fw-bold\"])[3]")
    public WebElement emailOnAdminCard;


    @FindBy(xpath = "//input[@name=\"old_password\"]")
    public WebElement passwordBoxOnPasswordSettingsPage;


    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@name=\"password_confirmation\"]")
    public WebElement confirmPasswordBox;
}
