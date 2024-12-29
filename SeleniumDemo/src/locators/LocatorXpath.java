package locators;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumfirsttest.BaseTest;

public class LocatorXpath extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        // xpath ----//tagname[@attribute='value']
       driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
       driver.findElement(By.xpath("//input[@id='small-searchterms']")).clear();


       // xpath with "or" ----> //tagName[@attribute='value' or @attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms'  or @placeholder='Search store']")).sendKeys("audio");
        driver.findElement(By.xpath("//input[@id='small-searchterms'  or @placeholder='Search store']")).clear();

        // xpath with "And" ----> //tagName[@attribute='value' and @attribute='value']
        driver.findElement(By.xpath("//input[@id='small-searchterms'  and @placeholder='Search store']")).sendKeys("clothing");
        driver.findElement(By.xpath("//input[@id='small-searchterms'  and @placeholder='Search store']")).clear();

        //xpath with contains---> //tagname[contains(@attribute,'value')]
        driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).clear();

        ////xpath start with ------> //tagName[starts-with(@attribute,'value')]
        driver.findElement(By.xpath("//input[starts-with(@id,'small-searchterms')]")).sendKeys("music");
        driver.findElement(By.xpath("//input[starts-with(@id,'small-searchterms')]")).clear();

        //xpath with text -----> //tagName[text()='text']
        //driver.findElement(By.xpath("//button[text()='Search']")).click();

        //xpath with contain text ---> ---> //tagName[contains(text(),'text')]
       // driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();

        //chained xpath
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
    }


    @After
    public void tearDown(){
       // closeBrowser();
    }



}
