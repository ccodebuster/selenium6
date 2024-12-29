package waits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumfirsttest.BaseTest;

import java.time.Duration;

public class TestExplicitWait extends BaseTest {
    String baseurl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {

       WebElement loginLink =  driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]"));
      // By loginLink =  By.xpath("//a[contains(text(), 'Sign In')]");

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(50));

     // WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
      WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(loginLink));
      signIn.click();


    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
