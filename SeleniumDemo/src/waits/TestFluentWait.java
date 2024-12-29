package waits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import seleniumfirsttest.BaseTest;

import java.time.Duration;
import java.util.function.Function;

public class TestFluentWait extends BaseTest {
    String baseurl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {

      // WebElement loginLink =  driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]"));
       By loginLink =  By.xpath("//a[contains(text(), 'Sign In')]");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(50))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(ElementNotInteractableException.class);

        WebElement signIn = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(loginLink);
            }
        });

        signIn.click();
    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
