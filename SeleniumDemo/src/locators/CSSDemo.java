package locators;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumfirsttest.BaseTest;

public class CSSDemo extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {

        Thread.sleep(2000);

        //   tagname[attribute='value']
        driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("mobile");
        driver.findElement(By.cssSelector("input[id='small-searchterms']")).clear();

        // #id or tagname#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("laptop");
        driver.findElement(By.cssSelector("input#small-searchterms")).clear();

        // .classname or tagname.classname
        driver.findElement(By.cssSelector("input.search-box-text.ui-autocomplete-input")).sendKeys("books");

    }


    @After
    public void tearDown() {
       // closeBrowser();
    }
}
