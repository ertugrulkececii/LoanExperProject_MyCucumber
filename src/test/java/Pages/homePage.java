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


    @FindBy(xpath = "//*[@id=\"pills-basic-loan\"]/div/div[3]/div/div[1]")
    public WebElement testLoanCard;

    @FindBy(xpath = "//*[@id=\"pills-basic-loan\"]/div/div[3]/div/div[2]/button")
    public WebElement applyNowButton;

    @FindBy(xpath = "//*[@id=\"loanModal\"]/div/div/form/div[1]/h3")
    public WebElement youAreNotLoggedInMessage;

    @FindBy(xpath = "//*[@id=\"loanModal\"]/div/div/form/div[2]/a")
    public WebElement youAreNotLoginMessageUnderLoginButton;

    @FindBy(xpath = "//*[@id=\"loanModal\"]/div/div/form/div[2]/button")
    public WebElement youAreNotLoginMessageUnderCloseButton;

    @FindBy(xpath = "/html/body/div[3]/div/section[3]/div[3]/a")
    public WebElement seeAllButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/div/div/div/div/h2")
    public WebElement loanPlansText;

    // headlines about customer satisfaction on the homepage
    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div/div/div[1]/div")
    public WebElement countryWide;

    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div/div/div[2]/div")
    public WebElement happyClient;

    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div/div/div[3]/div")
    public WebElement winningAwards;

    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div/div/div[4]/div")
    public WebElement totalLoan;

    @FindBy(xpath = "/html/body/div[3]/div/section[4]/div[1]/div/div/div/div/h2")
    public WebElement frequentlyAskedQuestionsSection;

    @FindBy(xpath = "//*[@id=\"faqAccordion\"]/div[1]/h2")
    public WebElement frequentlyAskedQuestions1;

    @FindBy(xpath = "//*[@id=\"faqAccordion\"]/div[2]/h2")
    public WebElement frequentlyAskedQuestions2;

    @FindBy(xpath = "//*[@id=\"faqAccordion\"]/div[3]/h2")
    public WebElement frequentlyAskedQuestions3;

    @FindBy(xpath = "//*[@id=\"faqAccordion\"]/div[1]/h2/button")
    public WebElement accordionButtonPlus;

    @FindBy(xpath = "//*[@id=\"faqAccordion\"]/div[2]/h2")
    public WebElement accordionButtonMinus;

    @FindBy(xpath = "/html/body/div[3]/div/section[5]/div/div/div[2]/div/div/div/div[2]/div/div/div")
    public WebElement sliderText;

    @FindBy(xpath = "/html/body/div[3]/div/section[5]/div/div/div[2]/div/button[2]/i")
    public WebElement rightButton;

    @FindBy(xpath = "/html/body/div[3]/div/section[5]/div/div/div[2]/div/button[1]/i")
    public WebElement leftButton;

    @FindBy(xpath = "/html/body/div[3]/div/section[6]/div[1]/div/div/div/div/div/p")
    public WebElement blogPostSection;

    @FindBy(xpath = "/html/body/div[3]/div/section[6]/div[2]/div/div[1]/div/div/ul/li/div/div[2]/a")
    public WebElement dateAndTime;

    @FindBy(xpath = "/html/body/div[3]/div/div[4]/div/div/div/div/div[2]/ul/li[1]/h3")
    public WebElement likeToBecomeAHeroText;

    @FindBy(xpath = "/html/body/div[3]/div/div[4]/div/div/div/div/div[2]/ul/li[2]/a")
    public WebElement takeLoanButton;




    // OmerKAYA
    @FindBy(xpath = "(//*[@class='ms-3'])[1]")
    public WebElement HomePageEmailContact;

    @FindBy(xpath = "(//*[@class='ms-3'])[2]")
    public WebElement HomePageAddressContact;

    @FindBy(xpath = "(//*[@class='ms-3'])[3]")

    public WebElement HomePagePhoneContact;

    @FindBy(xpath = "//*[@href='javascript:void(0)']")
    public WebElement allowButton;

    @FindBy(xpath = "//*[@alt='viserhyip']")
    public WebElement loanTechLogo;
    @FindBy(xpath = "(//*[@class='nav-item'])[1]")
    public WebElement homeLogoOnMenuTitle;
    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement aboutLogoOnMenuTitle;
    @FindBy(xpath = "(//*[@class='nav-item'])[3]")
    public WebElement plansLogoOnMenuTitle;
    @FindBy(xpath = "(//*[@class='nav-item'])[4]")
    public WebElement blogsLogoOnMenuTitle;

    @FindBy(xpath = "(//*[@class='nav-item'])[5]")
    public WebElement contactLogoOnMenuTitle;

    @FindBy(xpath = "(//*[@href='https://qa.loantechexper.com/user/login'])[2]")
    public WebElement loginLogoOnMenuTitle;

    @FindBy(xpath = "//*[@href='user/register']")
    public WebElement getStartedLogoOnHomePage;

    // OmerKAYA


// Ertugrul
@FindBy(xpath = "//*[@id=\"header\"]/div/nav/a")
public WebElement LoanHomeLogoLink;

@FindBy(xpath = "(//div[@class='ms-3'])[1]")
public WebElement headerEmailText;

@FindBy(xpath = "(//div[@class='ms-3'])[1]")
public WebElement headerAdressText;

@FindBy(xpath = "(//div[@class='ms-3'])[1]")
public WebElement headerPhoneText;

@FindBy(xpath = "(//li[@class='nav-item'])[1]")
public WebElement headerHomeButton;

@FindBy(xpath = "(//li[@class='nav-item'])[2]")
public WebElement headerAboutButton;

@FindBy(xpath = "(//*[text()='About'])[2]")
public WebElement bodyAboutText;
@FindBy(xpath = "(//li[@class='nav-item'])[3]")
public WebElement headerPLansButton;
@FindBy(xpath = "//*[text()='Loan Plans']")
public WebElement bodyPlansText;
@FindBy(xpath = "(//li[@class='nav-item'])[4]")
public WebElement headerBlogsButton;
@FindBy(xpath = "(//*[text()='Blogs'])[2]")
public WebElement bodyBlogsText;
@FindBy(xpath = "(//li[@class='nav-item'])[5]")
public WebElement headerContactButton;
@FindBy(xpath = "//*[text()='Contact Us']")
public WebElement bodyContactText;
@FindBy(xpath = "//*[text()='Login']")
public WebElement bodyLoginText;
@FindBy(xpath = "//*[text()='Register']")
public WebElement bodyGetStartedText;
// Ertugrul

}
