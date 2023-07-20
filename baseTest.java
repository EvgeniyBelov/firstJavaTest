import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

abstract class baseTest { // базовый класс!

    /* настройка окружения */
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true; // обозначаем присутствие библиотеки
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.timeout = 3000;


    }
    /* Настраиваем действия до ТЕСТА */
    @Before
    public void init() {
        setUp();
    }

    /* Настраиваем действие после ТЕСТА*/
    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
