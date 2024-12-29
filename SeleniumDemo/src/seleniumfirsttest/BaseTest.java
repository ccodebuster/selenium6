package seleniumfirsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){

      //  driver = new EdgeDriver();
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println("Browser Open");
    }

    public void closeBrowser(){
        driver.quit();
        System.out.println("Browser Closed");
    }
}
