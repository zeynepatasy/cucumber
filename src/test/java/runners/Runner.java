package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@ikisi or @iphone", //@java, nutella gibi @ikisi
        dryRun = false

)
public class Runner {
    /*
    Bir framework'te bir runner class'ı yeterli olur.
    Runner class'ında class body'sindehiçbir sey olmaz.
    Runner class'ımızı önemli yapan 2 adet annotation vardır
    Runwith notasyonu Runner class'ına calısma özelliği katar
    Bu notasyon oldugu için Cucumber framework'ümüzde JUnit kullanmayı tercih ettik.

   features:  Runner dosyasının feature dosyalarını nereden bulacağını tarif eder
   glue: stepDefinitions dosyalarını nerede bulacagımızı gösterir
   tags: o anda hangi tag'i çalıstırmak istiyorsak onu belli eder.
    dryRun : iki secenek vardır
    dryRun=true;  yazdıgımızda testimizi çalıştırmadan sadece eksik adımları bize verir
    dryRun=false yazdıgımızda testlerimizi çalıstırır
     */
}
