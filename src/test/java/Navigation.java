import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        WebDriver driver = new ChromeDriver(); // Create new driver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Waiting period in seconds

        driver.manage().window().setSize(new Dimension(900, 500)); //Set window size

        driver.manage().window().maximize(); //Set window size maximum


        // Navigation part

        driver.get("http://google.com"); // Open page
        driver.navigate().to("http://en.wikipedia.org"); // Another way to open URL
        driver.navigate().back(); //back to previous page
        driver.navigate().forward(); //back to forward page after back navigation
        driver.navigate().refresh(); // refresh current page

        driver.quit();
    }
}
