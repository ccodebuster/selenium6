package action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import seleniumfirsttest.BaseTest;


public class DragAndDropDemo extends BaseTest {

    String baseurl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).build().perform();
    }

    @After
    public void tearDown(){
        //closeBrowser();
    }
}
