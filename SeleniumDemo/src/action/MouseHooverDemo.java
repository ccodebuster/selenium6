package action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumfirsttest.BaseTest;


public class MouseHooverDemo extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
        WebElement software = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a"));
        actions.moveToElement(computers).moveToElement(software).click().build().perform();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
