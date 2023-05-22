package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    @FindBy(
            id = "twotabsearchtextbox"
    )
    public WebElement aramaKutusu;
    @FindBy(
            xpath = "(//div[@class='sg-col-inner'])[1]"
    )
    public WebElement aramaSonucuElementi;

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
