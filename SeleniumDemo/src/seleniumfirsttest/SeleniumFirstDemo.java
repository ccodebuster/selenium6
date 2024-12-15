package seleniumfirsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SeleniumFirstDemo {

    public static void main(String[] args) {

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.quit();

    }
}
