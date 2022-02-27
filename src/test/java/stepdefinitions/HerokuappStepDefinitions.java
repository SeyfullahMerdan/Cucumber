package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();


    @When("Add Element butonuna basar")
    public void addElementButonunaBasar() {
        herokuappPage.addButonElement.click();
    }

    @Then("Delete butonu gorununceye kadar bekler")
    public void deleteButonuGorununceyeKadarBekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButonElement, 15);
    }

    @And("Delete butonunun gorundgunu test eder")
    public void deleteButonununGorundgunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteButonElement.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void deleteButonunaBasarakButonuSiler() {
        herokuappPage.deleteButonElement.click();
    }



}
