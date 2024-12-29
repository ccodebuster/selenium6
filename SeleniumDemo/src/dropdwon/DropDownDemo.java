package dropdwon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import seleniumfirsttest.BaseTest;

import java.util.List;

public class DropDownDemo extends BaseTest {

    String baseurl = "https://www.way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        WebElement allCountriesDropdown = driver.findElement(By.name("country"));
        Select select = new Select(allCountriesDropdown);
      //  select.selectByVisibleText("Barbados"); // by visible text
       // select.selectByIndex(5); // by index number
       // select.selectByValue("Cuba"); // by value

       List<WebElement> allOptions  = select.getOptions();
        System.out.println(allOptions.size());

        for(WebElement country:allOptions){

           if(country.getText().equalsIgnoreCase("Venezuela")){
               country.click();
           }
        }

    }


    @After
    public void tearDown() {
        // closeBrowser();
    }
}
