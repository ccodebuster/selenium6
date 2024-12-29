package seleniumfirsttest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class NopCommerce extends BaseTest{

  String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() throws InterruptedException {
        openBrowser(baseUrl);

    }

    @Test
    public void loginTest() throws InterruptedException {

     /* //By linkText
     WebElement myAccountLink =  driver.findElement(By.linkText("My Account"));
     myAccountLink.click();*/

      //By linkText
      WebElement loginLink =  driver.findElement(By.linkText("Log in"));
      loginLink.click();
      
      Thread.sleep(2000);
      //By ID
      WebElement emailField= driver.findElement(By.id("input-email"));
      emailField.sendKeys("codebuster@gmail.com");

      //By ID
      WebElement passWordField= driver.findElement(By.id("input-password"));
      passWordField.sendKeys("codebuster@gmail.com");

      //By LinkText
      WebElement loginButton = driver.findElement(By.linkText("Log in"));
      loginButton.click();



     /* //By ID
      WebElement emailField= driver.findElement(By.id("Email"));
      emailField.sendKeys("codebuster@gmail.com");

      //By Name
      WebElement passwordField = driver.findElement(By.name("Password"));
      passwordField.sendKeys("123456");

      //By LinkText
     WebElement loginButton = driver.findElement(By.linkText("Log in"));
     loginButton.click();*/

    }


    @After
    public void tearDown(){

      //closeBrowser();
    }

}
