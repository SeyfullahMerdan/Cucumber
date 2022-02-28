package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepDefinitions {

    WebUniversityPage webUniversityPage=new WebUniversityPage();

    @And("Login Portal'a  kadar asagi iner")
    public void loginPortalAKadarAsagiIner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Login Portal'a  tiklar")
    public void loginPortalATiklar() {
        webUniversityPage.loginPortalElementi.click();
    }

    @Then("acilan Diger window'a gecer")
    public void acilanDigerWindowAGecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }

    @And("{string} ve  {string} kutularina deger yazdirin")
    public void veKutularinaDegerYazdirin(String username, String password) {
        webUniversityPage.usernameTextBox.sendKeys(username);
        webUniversityPage.passwordTextBox.sendKeys(password);
    }

    @And("WebUniversity Login butonuna basar")
    public void webuniversityLoginButonunaBasar() {
        webUniversityPage.loginButton.click();
    }

    @And("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popupTaCikanYazininOldugunuTestEder(String expectedText) {
        String actualText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals("Yazilar uyusmuyor",expectedText,actualText);
    }

    @Then("Ok diyerek Popup'i kapatir")
    public void okDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Ilk sayfaya geri doner")
    public void ilkSayfayaGeriDoner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }

    @And("Ilk sayfaya donuldugunu test eder")
    public void ilkSayfayaDonuldugunuTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("WebDriverUniversity.com"));
    }



}
