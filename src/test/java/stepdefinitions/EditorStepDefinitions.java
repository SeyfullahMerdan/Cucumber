package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;


public class EditorStepDefinitions {

    @When("kullanici editor anasayfaya gider")
    public void kullanici_https_editor_datatables_net_adresine_gider() {

        Driver.getDriver().get("https://editor.datatables.net/");

    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {

    }

    @Then("firstname olarak {string} yazar")
    public void firstname_olarak_yazar(String string) {

    }

    @Then("lastname olarak {string} yazar")
    public void lastname_olarak_yazar(String string) {

    }

    @Then("Position olarak {string} yazar")
    public void position_olarak_yazar(String string) {

    }

    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String string) {

    }

    @Then("Extension olarak {string} yazar")
    public void extension_olarak_yazar(String string) {

    }

    @Then("Start date olarak {string} yazar")
    public void start_date_olarak_yazar(String string) {

    }

    @Then("Salary olarak {string} yazar")
    public void salary_olarak_yazar(String string) {

    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {

    }

    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String string) {

    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String string) {

    }
}