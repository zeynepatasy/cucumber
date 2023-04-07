package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPages {
    public AmazonPages(){
        //class isimli constructor olusturduk,
        PageFactory.initElements(Driver.getDriver(),this); //bu classtaki driver'ı eşitle bu classla
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazısı;
}
