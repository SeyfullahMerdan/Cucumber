package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)    // JUniti kullanma sebebimiz bu koddur.
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/features",
        glue = "stepdefinitions",    // featuresleri baglıyacagı yer,class..
        tags="@WebU",           // adlı,etiketli methodları çalıştırır.
        dryRun = false
)
// Runner tag arar, tagı bulup çalıştırır.
   // Raporlama için Runnerdan çalıştırmamız lazım. Tek bir scenario için classtan çalıştırma yapılabilir...

public class Runner {
    // Runner class'inin body'sine hic bir kod yazmiyoruz
    // bu class icin onemli olan kullanacagimiz 2 adet notasyon

    // dryRun=false yazildiginda belirlenen tag'la etiketlenen tum scenario'lari sirasiyla calistirir
    // dryRun=true dedigimizde ise kodlari calistirmadan eksik stepler olup olmadigini kontrol eder
    // ve varsa bize eksik stepleri rapor eder

    // features ve glue olarak spesifik bir class veya feature dosyasını degil tüm klasör veya packagei seçtik.
    // Dolayısıyla stepdefinitions package'i içerisinde hangi classda olursa olsun işimize yarayan bir stepdefiniton
    // varsa kullanabiliriz.

}