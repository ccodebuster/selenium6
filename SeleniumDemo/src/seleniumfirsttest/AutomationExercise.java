package seleniumfirsttest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationExercise extends BaseTest{

    String baseUrl = "http://automationexercise.com";
    @Before
    public void setUp() throws InterruptedException {
        openBrowser(baseUrl);
    }
    @Test
    public void loginTest() throws InterruptedException {

        driver.findElement(By.xpath("//p[contains(text(),'Consent')]")).click(); //click on consent

        String actualMsg = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).getText(); //Verify that home page is visible successfully
        String expectedMsg = "Signup / Login";
        Assert.assertEquals("Asserting Homepage", expectedMsg, actualMsg);

        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).click(); //Click on 'Signup / Login' button

        String actualLoginToAccText = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText(); //Verify 'Login to your account' is visible
        String expectedLoginToAccText = "Login to your account";
        Assert.assertEquals("Asserting Login page", expectedLoginToAccText, actualLoginToAccText);

        //Enter incorrect email address and password
       WebElement userNameFiled = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
       userNameFiled.sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");

        //Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();


        // Verify error 'Your email or password is incorrect!' is visible
        By errorMsg = By.xpath("//div[@class='login-form']/form/p");
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));


        String actualErrorMsg =driver.findElement(By.xpath("//div[@class='login-form']/form/p")).getText();
        String expectedErrorMsg ="Your email or password is incorrect!";
        Assert.assertEquals(expectedErrorMsg,actualErrorMsg);


    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
