package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {


    private static WebDriver driver;
    private Driver(){
        /*
             Singleton pattern kullanılrak intenmeyen yöntemlerle
             driver onjesine erişilmesini engelledik

             Constructor'ı private yaparak bu class'ddan obje oluşturularak
             class üyelerinin kullanmasının önüne geçtik .
         */


    }

    public static WebDriver getDriver(){
        String istenenBrowser =ConfigReader.getProperty("browser");


        if(driver == null){

            switch (istenenBrowser){
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }


    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;

        }



    }



    public static void quitDriver(){

        if (driver != null){
            driver.quit();
            driver=null;

        }



    }

}





