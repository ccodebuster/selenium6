package alert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import seleniumfirsttest.BaseTest;

public class AlertDemo extends BaseTest {

    String baseurl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
       // alert.dismiss();
       driver.findElement(By.id("login1")).sendKeys("codebuster");

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
