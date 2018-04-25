package test3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final String URL = "https://www.google.com/";

    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    private WebElement googleSearchInput;

    @FindBy(xpath = "(//a[contains(text(), 'Funny CAT')])[1]")
    private WebElement funnyCatUrl;

    public void openGooglePage() {
        driver.get(URL);

    }

    public void findFunnyCat(String message) {
        googleSearchInput.sendKeys(message);
        googleSearchInput.sendKeys(Keys.ENTER);

        Assert.assertEquals(funnyCatUrl.getText(), message);
        driver.quit();
    }
}
