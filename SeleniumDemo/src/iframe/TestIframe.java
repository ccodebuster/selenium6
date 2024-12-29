package iframe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumfirsttest.BaseTest;

public class TestIframe extends BaseTest {

    String baseurl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        driver.switchTo().frame("courses-iframe"); // by name or id
    //driver.switchTo().frame(1); //by index
     driver.findElement(By.xpath("//input[@id='search']")).sendKeys("codebuster");
     driver.switchTo().defaultContent();
     driver.findElement(By.id("name")).sendKeys("bhav");


    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
