package tests.day16__POM_Assertions;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SingletonPattern {

    @Test
    public void test01(){

        /*
             biz otomasyon için elimiz ve kolumuz olarak
             Driver clas'ındaki  WebDriver objesini kullanıyoruz
             ANCAK driver'ın bizim istediğimiz işlemleri yaoabilmesi için
             öncelile getDriver merhodu içinde yaptığımız atama işlemlerine ihtiyacı var


             Bir framework'de çalışan kişilerin
             getDriver methodunu kullanmadan direk driver objesine erişimini engellemek için
             Singleton Pwettern kullanımı TERCİH EDİLMİŞTİR

             Singleton Pattern bir class'dan
             obje olulturulmaasını ve o obje ile class'daki class üyelerine erişimi engellemek için kullanılır

             OOP konsept çerçevesinde
             Driver class'ını farklı farklı yöntemlerle kullanabilirsiniz
             Ekip çalışmasını  tek düzen üzerinden gitmesi önemli olduğundan




         */


       //  Driver.driver.get(ConfigReader.getProperty("amazonUrl"));
       // getDriver() çalışmadığından driver null olarak işaretlendiğinden
       // NullPointerException verir

       // Driver driver = new Driver();
       //  driver.get("https://www.amazon.com");

       // driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

       // Driver class'ındaki constructor ı private yapınca
       // kimse driver class'ından obje oluşturmaz

       // System.out.println(Driver.driver);



    }

}
