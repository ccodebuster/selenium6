package action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumfirsttest.BaseTest;


public class RightClickDemo extends BaseTest {

    String baseurl = "https://swisnl.github.io/jQuery-contextMenu/demo.html";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        WebElement clickable = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));
        Actions actions = new Actions(driver);

        actions.contextClick(clickable).perform();
        driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]")).click();
       String alertMsg = driver.switchTo().alert().getText();
        System.out.println(alertMsg);
        driver.switchTo().alert().accept();
    }

    @After
    public void tearDown(){
        //closeBrowser();
    }
}
