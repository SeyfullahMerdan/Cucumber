package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {

    public DemoGuruPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy (xpath = "(//span[.='Tümünü Kabul Et'])[2]")
    public WebElement cookie;

    @FindBy (xpath = "//thead//tr//th")
    public List<WebElement> baslikWebelementListesi;

    @FindBy (className="faktor-iframe-wrapper")
    public WebElement iframe;



    public List<WebElement> sutunListesiGetir(int index){

        String dinamikXpath="//tbody//tr//td[" + (index+1) + "]";

        List <WebElement> istenenSutunWebelementleri=Driver.getDriver().findElements(By.xpath(dinamikXpath));

        return istenenSutunWebelementleri;
    }










}
