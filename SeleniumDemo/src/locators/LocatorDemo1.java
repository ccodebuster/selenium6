package locators;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumfirsttest.BaseTest;

public class LocatorDemo1 extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1(){
        System.out.println(driver);
        //className
        WebElement loginInLink=driver.findElement(By.className("ico-login"));
        loginInLink.click();

        //Id
        WebElement emailIdField=driver.findElement(By.id("Email"));
        emailIdField.sendKeys("ccodebuster@gmail.com");

        //Name
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //linkText
        WebElement loginButton=driver.findElement(By.linkText("Log in"));
        loginButton.click();

    }


    @After
    public void tearDown(){
        closeBrowser();
    }



}
