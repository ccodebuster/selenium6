package action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumfirsttest.BaseTest;


public class SliderDemo extends BaseTest {

    String baseurl = "https://www.geeksforgeeks.org";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {

        //scroll by x and y axis
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        jse.executeScript("window.scrollBy(0,3000)");

        //key events
        Actions actions = new Actions(driver);
        for(int i=0; i <=3; i++){ // page up
            actions.keyDown(Keys.PAGE_UP).build().perform();
        }

        for(int i=0; i <=3; i++){ // page down
            actions.keyDown(Keys.PAGE_DOWN).build().perform();
        }

        //scroll to element
        WebElement scrollToElement = driver.findElement(By.xpath("//div[@class='index_homePageContainer__H8GJD']/div[12]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToElement);

        // scroll to bottom of page
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");


    }

    @After
    public void tearDown(){
        //closeBrowser();
    }
}
