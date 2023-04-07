package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSearchJava {
    AmazonPages amazonPages=new AmazonPages();
    @Given("kullanici amazon anasayfasında")
    public void kullanici_amazon_anasayfasında()
    {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanıcı Java için arama yapar")
    public void kullanıcı_java_için_arama_yapar() {

        amazonPages.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("sonucların Java içerdiğini test eder")
    public void sonucların_java_içerdiğini_test_eder() {
     String expectedSözcük="Java";
     String actualSözcük=amazonPages.sonucYazısı.getText();
        Assert.assertTrue(actualSözcük.contains(expectedSözcük));
    }
    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();

    }

}
