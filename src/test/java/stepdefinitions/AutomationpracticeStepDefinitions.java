package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AutomationPrakticePage;
import utilities.ConfigReader;

public class AutomationpracticeStepDefinitions {

    AutomationPrakticePage automationPrakticePage=new AutomationPrakticePage();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPrakticePage.signIn.click();
    }
    @Given("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() {
        automationPrakticePage.emailKutusuText.sendKeys(ConfigReader.getProperty("AutomationYanlisEmail") + Keys.ENTER);
    }
    @Then("error mesajinin “Invalid email address”  oldugunu dogrulayin")
    public void error_mesajinin_invalid_email_address_oldugunu_dogrulayin() {
      String actualHataYazisi= automationPrakticePage.invalidEmailText.getText();
      String expectedHataYazisi=ConfigReader.getProperty("AutomationHataYazisi");
        Assert.assertEquals(actualHataYazisi,expectedHataYazisi);
    }






}
