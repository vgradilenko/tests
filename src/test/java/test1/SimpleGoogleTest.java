package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleGoogleTest {

    @Test
    public void verySimpleTestGoogleSearchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
//        Thread.sleep(000);
        driver.quit();
    }
    
    @Test
    public void shouldFindCat() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("funny cats");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();
    }
    
}
