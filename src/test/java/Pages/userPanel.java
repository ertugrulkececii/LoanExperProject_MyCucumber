package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userPanel {

    public userPanel(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboardButton;


    // Ertugrul
    @FindBy(xpath = "//*[@class='account d-none d-lg-block']") ////a[@class='btn btn--md btn--base fw-bold w-100'][normalize-space()='Login']
    public WebElement firstLogin;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement login2;

    @FindBy(xpath = "(//a[@href='https://qa.loantechexper.com/user/logout'])[1]")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement AllowYaziElementi;

    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement logoutSlideElement;

    @FindBy(xpath = "(//a[text()='Deposit'])[2]")    //a[@class='active']
    public WebElement UserpageDepositButtonElement;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement UserPageAmountElement;

    @FindBy(xpath = "//button[@type='submit']")  //button[@type='submit']
    public  WebElement UserDepositSubmitButtonElement;

    @FindBy (xpath = "//select[@name=\"gateway\"]")
    public  WebElement UserDepositSelectGatewayElement;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement UserDepositPayNowButtonElement;

     @FindBy(xpath = "//span[text()='Deposits']")
    public WebElement DepositsButton;
    @FindBy(xpath = "//span[text()='All Deposits']")
    public  WebElement AllDepositsButton;
    @FindBy(xpath = "(//a[@class='item-link'])[2]")
    public WebElement PendingDeposits;

    // Ertugrul

    //OmerKAYA

    @FindBy(xpath = "//*[text()='ACCOUNT BALANCE']")
    public WebElement accountBalanceOnDashboard;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profileButtonOnDashboard;

    @FindBy (xpath = "//*[@class='card-body p-3']")
    public WebElement profileBoard1;

    @FindBy(xpath = "//*[@class='card-body']")
    public WebElement profileBoard2;

    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstNameBoxOnUserProfile;

    @FindBy(xpath = "//*[@id='lastname']")
    public WebElement lastNameBoxOnUserProfile;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButtonOnUserProfile;

    @FindBy(xpath = "//*[text()='Profile updated successfully']")
    public WebElement successfullAlert;

    @FindBy (id = "imageUpload")
    public WebElement uploadPhotoButton;


    @FindBy (xpath = "//*[@id='zip']")
    public WebElement zipCodeBox ;

    @FindBy (xpath = "//*[@id='state']")
    public WebElement stateBox ;

    @FindBy (xpath = "//*[@id='city']")
    public WebElement cityBox ;




    //OmerKAYA

}
