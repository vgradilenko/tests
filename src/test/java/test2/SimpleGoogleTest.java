package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleGoogleTest {
    private WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verySimpleTestGoogleSearchTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void shouldFindCat() throws InterruptedException {
        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("funny cats");
//        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
        driver.quit();
    }
}
