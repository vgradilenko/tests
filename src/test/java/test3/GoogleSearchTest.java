package test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test3.GooglePage;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    private WebDriver driver;
    private GooglePage page;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        page = new GooglePage(driver);
    }

    @Test
    public void shouldFindFunnyCats() {
        page.openGooglePage();
        page.findFunnyCat("funny CATS");
    }
}
