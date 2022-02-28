package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {

    public WebUniversityPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h1[normalize-space()='LOGIN PORTAL']")
    public WebElement loginPortalElementi;

    @FindBy(id = "text")
    public WebElement usernameTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(id = "login-button")
    public WebElement loginButton;

}
