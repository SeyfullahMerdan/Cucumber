package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DemoqaPage;
import utilities.ReusableMethods;

public class DemoqaStepDefinitions {

    DemoqaPage demoqaPage=new DemoqaPage();

    @Then("Will enable {int} seconds butonunun enable olmasini bekler")
    public void willEnableSecondsButonununEnableOlmasiniBekleyin(int arg0) {
        ReusableMethods.waitForClickablility(demoqaPage.willEnable5SecondElement, 15);
    }

    @And("Will enable {int} seconds butonunun enable oldugunu test eder")
    public void willEnableSecondsButonununEnableOldugunuTestEdin(int arg0) {
        Assert.assertTrue(demoqaPage.willEnable5SecondElement.isEnabled());
    }








}
