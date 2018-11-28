import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Link {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        WebDriver driver = new ChromeDriver(); // Create new driver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Waiting period in seconds

        driver.manage().window().setSize(new Dimension(900, 500)); //Set window size

        driver.manage().window().maximize(); //Set window size maximum

        driver.get("http://en.wikipedia.org"); //Open url

        WebElement link = driver.findElement(By.xpath("//li[@id='n-aboutsite']/a"));
        System.out.println(link.getText());
        link.click();

        driver.get("http://github.com");
        driver.findElement(By.xpath("//nav[@class='site-header-nav site-header-nav-main']/a[1]")).click();

        driver.get("http://en-gb.facebook.com");
        driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();

        driver.quit();
    }
}