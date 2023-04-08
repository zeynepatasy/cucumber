package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPages amazonPages=new AmazonPages();
    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get("https://www.amazon.com");
    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {

        amazonPages.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String expectedSözcük="Nutella";
        String actualSözcük=amazonPages.sonucYazısı.getText();
        Assert.assertTrue(actualSözcük.contains(expectedSözcük));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.quitDriver();
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
    @When("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        amazonPages.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }
    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
       String expectedSonuc="iphone";
       String actualSonuc=amazonPages.sonucYazısı.getText();
       Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }

}
