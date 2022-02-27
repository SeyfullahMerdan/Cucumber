package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPrakticePage {


    public AutomationPrakticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn;


    @FindBy(css = "[id=\"email_create\"]")
    public WebElement emailKutusuText;


    @FindBy(xpath = "//li[text()='Invalid email address.']")
    public WebElement invalidEmailText;








}
