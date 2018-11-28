import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Buttons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        WebDriver driver = new ChromeDriver(); // Create new driver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Waiting period in seconds

        driver.manage().window().setSize(new Dimension(900, 500)); //Set window size

        driver.manage().window().maximize(); //Set window size maximum


        // Buttons part
        driver.get("http://en.wikipedia.org"); //Open url
        driver.findElement(By.xpath("//input[@id='searchButton']")).click(); // click

        driver.get("https://github.com"); // open url
        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button")); // create new webelement

        if (button.getText().equals("Sign up for GitHub")) {  // equivalence test

            System.out.println("Button text is: " + button.getText()); // method get text
            System.out.println("Success");
        } else System.out.println("Fail!");

        button.submit(); // another way to click. submit
        driver.navigate().back(); // Back to previous page
        driver.findElement(By.xpath("//a[text()='Sign in']")).click(); //click

        driver.get("https://en-gb.facebook.com"); //Open url
        driver.findElement(By.xpath("//label[@id='loginbutton']/input")).submit(); // another way to click. submit

        driver.quit();
    }
}
