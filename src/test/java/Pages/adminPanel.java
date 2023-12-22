package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

import java.util.List;

public class adminPanel {

    public adminPanel() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Hayırlı haftasonları arkadaşlar

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[text()=\"LOGIN\"]")
    public WebElement loginButton;


    @FindBy(xpath = " //*[text()=\"Loans\"]")
    public WebElement sideBarLoans;

    @FindBy(xpath = " //*[text()=\"Pending Loans\"]")
    public WebElement pendingLoans;

    @FindBy(xpath = " //*[text()=\"Running Loans\"]")
    public WebElement runningLoans;

    @FindBy(xpath = " //*[text()=\"Due Loans\"]")
    public WebElement dueLoans;

    @FindBy(xpath = " //*[text()=\"Paid Loans\"]")
    public WebElement paidLoans;

    @FindBy(xpath = " //*[text()=\"Rejected Loans\"]")
    public WebElement rejectedLoans;

    @FindBy(xpath = " //*[text()=\"All Loans\"]")
    public WebElement allLoans;

    @FindBy(xpath = " (//*[text()=\"Pending Loans\"])[2]")
    public WebElement pendingLoansIn;

    @FindBy(xpath = " (//*[text()=\"Running Loans\"])[2]")
    public WebElement runningLoansIn;

    @FindBy(xpath = " (//*[text()=\"Due Loans\"])[2]")
    public WebElement dueLoansIn;

    @FindBy(xpath = " (//*[text()=\"Paid Loans\"])[2]")
    public WebElement paidLoansIn;

    @FindBy(xpath = " (//*[text()=\"Rejected Loans\"])[2]")
    public WebElement rejectedLoansIn;

    @FindBy(xpath = " (//*[text()=\"All Loans\"])[2]")
    public WebElement allLoansIn;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    public WebElement pendingLoansTable;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[1]")
    public WebElement pendingLoansSN;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[2]")
    public WebElement pendingLoansLoanNoPlan;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[3]")
    public WebElement pendingLoansUser;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[4]")
    public WebElement pendingLoansAmount;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[5]")
    public WebElement pendingLoansInstallmentAmount;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[6]")
    public WebElement pendingLoansInstallment;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[7]")
    public WebElement pendingLoansCreatedNextInstallment;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/thead/tr/th[8]")
    public WebElement pendingLoansStatus;

    @FindBy(xpath = "//*[@id=\"search\"]")
    public WebElement loanNoSearch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/tbody/tr/td[2]/span[1]")
    public WebElement actualloanNo;

    @FindBy(xpath = "//*[@id=\"date\"]")
    public WebElement dateSearch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[7]/span[1]")
    public WebElement actualDate;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[9]/div/a[1]")
    public WebElement pendingLoansDetailsButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[9]/div/a[2]")
    public WebElement pendingLoansInstallmentsButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[1]")
    public WebElement detailsPlan;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[2]")
    public WebElement detailsDate;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[3]")
    public WebElement detailsloanNumber;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[4]")
    public WebElement detailsAmount;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[5]")
    public WebElement detailsPerInstallment;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[6]")
    public WebElement detailsTotalInstallment;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[7]")
    public WebElement detailsGivenInstallment;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[8]")
    public WebElement detailsTotalPayable;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[9]")
    public WebElement detailsProfit;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div/ul/li[10]")
    public WebElement detailsStatus;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/div/button[1]")
    public WebElement pendingLoansApprove;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/div/button[1]")
    public WebElement pendingLoansReject;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[1]")
    public WebElement installementLoanNumber;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[2]")
    public WebElement installementPlan;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[3]")
    public WebElement installementLoanAmount;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[4]")
    public WebElement installementPerInstallement;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[5]")
    public WebElement installementTotalIntallement;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[6]")
    public WebElement installementGivenInstallement;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[7]")
    public WebElement installementReceivable;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[8]")
    public WebElement installementDelayCharge;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/table/thead/tr")
    public WebElement installementSN;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div/a")
    public WebElement installementBackButton;


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


    // OmerKAYA

    @FindBy(xpath = "(//*[@class='sidebar-menu-item sidebar-dropdown'])[2]")
    public WebElement LoanMenuItem;

    @FindBy(xpath = "//*[text()='Due Loans']")
    public WebElement DueLoanItem;

    @FindBy(xpath = "//*[@class='text-center']")
    public WebElement DueLoanBoardData;


    @FindBy(xpath = "//*[text()='Manage Users']")   //ert
    public WebElement manageUsersItem;

    @FindBy(xpath = "//*[text()='Notification to All']")
    public WebElement notificationAllItem;

    @FindBy(xpath = "//*[@name='being_sent_to']")
    public WebElement beingSentDropDown;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement emailSubject;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@name='batch']")
    public WebElement batchBox;

    @FindBy(xpath = "//*[@name='cooling_time']")
    public WebElement waitingTimeBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitbutton;

    @FindBy(xpath = "//*[text()='Stop']")
    public WebElement stopButton;

    @FindBy(xpath = "//*[@class='mail-icon text--success fw-bold text-center']")
    public WebElement successfullySentAlert;

    @FindBy(xpath = "//*[@aria-label='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement errorMessageAlert;

    // Ertugrul
    @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    public WebElement PendingDepositsDetailsButtonSamet;

    @FindBy(xpath = "//h5[@class='card-title mb-50 border-bottom pb-2']")
    public WebElement PendingDepositsSuccessfulDetailsPage;

    @FindBy(xpath = "//button[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement ApprouveButton;

    @FindBy(xpath = "//button[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement RejectButton;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement RejectSubmitbutton;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement PendingDepositsSearchTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement PendingDepositsSearchTextSubmitbutton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement PendingDepositsYesButton;

    @FindBy(xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement RequestApprouvedSuccessfully;

    @FindBy(xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement RequestRejectedSuccessfully;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement ReasonforRejectionBox;

    @FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Active Users']")
    public WebElement activeUsersAdminDashboard;

    @FindBy(xpath = "//th[normalize-space()='User']")   //tr[th]
    public WebElement listOfheaderActiveUsersPage;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBoxActiveUsersPage;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement detailsButtonActiveUsersPage;

    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/admin/deposit?search=ertugrulkececi']")
    public WebElement viewallButtonInDetailsPage;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement headOfDepositHistoryGetText;

    @FindBy(xpath = "//th[normalize-space()='Gateway | Transaction']")
    public WebElement gatewayListHeaderOfdepositHistoryPage;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]")
    public WebElement usersListHeaderOfdepositHistoryPage;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    public WebElement detailsButtonInDepositHistoryPage;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement xRequestedxUSDtextElement;

    @FindBy(xpath = "//h5[@class='mb-20 text-muted']")
    public WebElement cardOfDepositViaManuel;

    @FindBy(xpath = "//button[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement approveButtonOnDepositPage;

    @FindBy(xpath = "//button[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement rejectButtonOnDepositPage;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement yesButtonAfterApprove;

    @FindBy(xpath = "//*[text()='Deposit request approved successfully']")
    public WebElement approveSuccesText;
//
    @FindBy(xpath = "(//span[@class='menu-title'])[24]")
    public WebElement depositsButton;
    @FindBy(xpath = "(//span[@class='menu-title'])[27]")
    public WebElement successfulDepositsButton;
    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement successfuldepositTitle;
    // sayfaya ulasildigini dogrulamak icin
    @FindBy(xpath = "//div[@class='col-md-12']")
    public List<WebElement> successfulDepositsList;
    // bir sonraki adimi da bu locatle yapabilirsin foreach ile get text yapip getirebilirsin
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement succesfulDepositsDetailsButton;
    @FindBy(xpath = "//div[@class='card-body']")
    public List<WebElement> cartInformation;
    // Ertugrul


}
