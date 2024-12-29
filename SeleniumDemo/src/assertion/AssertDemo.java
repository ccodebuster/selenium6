package assertion;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumfirsttest.BaseTest;

public class AssertDemo extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
    String actualMsg = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
    String expectedMsg = "Welcome to our store";

    Assert.assertEquals(expectedMsg, actualMsg);

    }

    @After
    public void tearDown(){
         closeBrowser();
    }
}
