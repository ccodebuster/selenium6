package locators;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumfirsttest.BaseTest;

import java.util.List;

public class LocatorXpath2 extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);

      List<WebElement> links = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
      System.out.println(links); //7

      for(WebElement link:links){
          if(link.getText().equalsIgnoreCase("Gift Cards")){
              link.click();
          }
      }



    }


    @After
    public void tearDown(){
       // closeBrowser();
    }



}
