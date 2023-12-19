package Pages;

import Utilities.Driver;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    public homePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='text-decoration-none']")
    public WebElement registerNowLink;

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//h3[@class=\"text-capitalize text-center mt-0 mb-4\"]")
    public WebElement headerOfLoginForm;

    @FindBy(xpath = "//div[@class=\"form-group form-check\"]")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[@class=\"forgot-pass text-decoration-none\"]")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//button[@class=\"btn btn--base btn--xxl w-100 text-capitalize xl-text\"]")
    public WebElement loginButtonOnLoginPage;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='These credentials do not match our records.']")
    public WebElement warningOfInvalidUserInfo;

    @FindBy(xpath = "//input[@name=\"value\"]")
    public WebElement usernameTextBoxOnForgotPasswordPage;

    @FindBy(xpath = "//*[text()='Password reset email sent successfully']")
    public WebElement warningOfResetPassword;

    @FindBy(xpath = "//*[text()='Try to send again']")
    public WebElement resendResetPasswordLink;

    @FindBy(xpath = "//h2[@class=\"hero__content-title text-capitalize t-text-white\"]")
    public WebElement headerOfAccountRecoveryPage;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div/a")
    public WebElement getStartedButton;

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement homeSection;

    @FindBy(xpath = "(//a[text()='About'])[1]")
    public WebElement aboutSection;

    @FindBy(xpath = "/html/body/div[3]/div/section[2]/div/div/div[2]/div[1]/div/p")
    public WebElement featureSection;

    // Feature'nin altindaki basliklar
    @FindBy(xpath = "//b[text()='Quick Approval Processes:']")
    public WebElement quickApprovalProcesses;

    @FindBy(xpath = "//b[text()='Various Loan Types:']")
    public WebElement variousLoanTypes;

    @FindBy(xpath = "//b[text()='Flexible Repayment Terms:']")
    public WebElement flexibleRepaymentTerms;

    @FindBy(xpath = "//b[text()='Competitive Interest Rates: ']")
    public WebElement competitiveInterestRates;

    @FindBy(xpath = "//b[text()='Digital Application and Processing:']")
    public WebElement digitalApplicationandProcessing;

    @FindBy(xpath = "/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/h5")
    public WebElement support;

    @FindBy(xpath = "/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/h5")
    public WebElement lowCost;

    @FindBy(xpath = "/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/i")
    public WebElement supportIcon;

    @FindBy(xpath = "/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/i")
    public WebElement lowCostIcon;

    // Featured Plans
    @FindBy(xpath = "/html/body/div[3]/div/section[3]/div[1]/div/div/div/div/div/p")
    public WebElement featuredPlansSection;

    @FindBy(xpath = "//button[@id='pills-basic-loan-tab']")
    public WebElement basicLoanButton;

}
