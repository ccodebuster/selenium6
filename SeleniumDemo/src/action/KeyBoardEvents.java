package action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumfirsttest.BaseTest;


public class KeyBoardEvents extends BaseTest {

    //String baseurl = "https://www.letskodeit.com/practice";
    String baseurl = "https://www.selenium.dev/selenium/web/single_text_input.html";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.sendKeys(Keys.CONTROL+"a");
        actions.keyDown(Keys.CONTROL).sendKeys("c").perform();
        driver.findElement(By.id("name")).click();
        actions.keyDown(Keys.CONTROL).sendKeys("v").perform();

    }

    @Test
    public void copyAndPaste() throws InterruptedException {

        Thread.sleep(3000);
        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

        WebElement textField = driver.findElement(By.id("textInput"));
        new Actions(driver)
                .sendKeys(textField, "Selenium!")
                .sendKeys(Keys.ARROW_LEFT)
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_UP)
                .keyUp(Keys.SHIFT)
                .keyDown(cmdCtrl)
                .sendKeys("xvv")
                .keyUp(cmdCtrl)
                .perform();

    }

    @After
    public void tearDown(){
        //closeBrowser();
    }
}
