package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class QualitydemyPage {
    @FindBy(
            xpath = "//*[text()='Log in']"
    )
    public WebElement ilkLoginLinki;
    @FindBy(
            xpath = "//input[@name='email']"
    )
    public WebElement emailKutusu;
    @FindBy(
            xpath = "//input[@id='login-password']"
    )
    public WebElement passwordKutusu;
    @FindBy(
            xpath = "//button[text()='Login']"
    )
    public WebElement loginButonu;
    @FindBy(
            xpath = "//a[text()='Instructor']"
    )
    public WebElement basariliGirisKontrolElementi;

    public QualitydemyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
