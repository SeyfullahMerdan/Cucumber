package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;
import utilities.Driver;


public class EditorStepDefinitions {

    EditorPage editorPage=new EditorPage();

    @When("kullanici editor anasayfaya gider")
    public void kullanici_https_editor_datatables_net_adresine_gider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();
    }

    @Then("firstname olarak {string} yazar")
    public void firstname_olarak_yazar(String firstname) {
        editorPage.firstname.sendKeys(firstname);
    }

    @Then("lastname olarak {string} yazar")
    public void lastname_olarak_yazar(String lastname) {
        editorPage.lastname.sendKeys(lastname);
    }

    @Then("Position olarak {string} yazar")
    public void position_olarak_yazar(String position) {
        editorPage.position.sendKeys(position);
    }

    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String office) {
        editorPage.office.sendKeys(office);
    }

    @Then("Extension olarak {string} yazar")
    public void extension_olarak_yazar(String extension) {
        editorPage.extension.sendKeys(extension);
    }

    @Then("Start date olarak {string} yazar")
    public void start_date_olarak_yazar(String startDate) {
        editorPage.startDate.sendKeys(startDate);
    }

    @Then("Salary olarak {string} yazar")
    public void salary_olarak_yazar(String salary) {
        editorPage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButton.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String aranacakKelime) {
        editorPage.searchBox.sendKeys(aranacakKelime);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String arananKelime) {
        Assert.assertTrue(editorPage.isimBoxElementi.getText().contains(arananKelime));
    }


    @Then("{int} saniye bekler")
    public void saniyeBekler(int sure) {

        try {
            Thread.sleep(sure * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}