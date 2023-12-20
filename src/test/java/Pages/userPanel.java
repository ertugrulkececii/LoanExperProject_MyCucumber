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
    @FindBy(xpath = "//*[@class='account d-none d-lg-block']")
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

    // Ertugrul
}
