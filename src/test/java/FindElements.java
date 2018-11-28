import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        WebDriver driver = new ChromeDriver(); // Create new driver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Waiting period in seconds

        driver.manage().window().setSize(new Dimension(900, 500)); //Set window size

        driver.manage().window().maximize(); //Set window size maximum


        //Find elements. Different ways

        WebElement link = driver.findElement(By.linkText("Log in")); //find element by linked text and add it in to the var
        WebElement link2 = driver.findElement(By.partialLinkText("Donate")); //find element by part of linked text and add it in to the var
        WebElement searchField = driver.findElement(By.name("search")); //find element by name and add it in to the var
        WebElement searchButton = driver.findElement(By.className("searchButton")); //find element by class name and add it in to the var
        WebElement byID = driver.findElement(By.id("ca-viewsource")); //find element by ID and add it in to the var
        WebElement input = driver.findElement(By.tagName("input")); //find element by tagName and add it in to the var. It's bad way!!!
        WebElement css = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton")); //find element by css selector and add it in to the var
        WebElement xPath = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a")); //find element by xPATH and add it in to the var
        System.out.println("END");

        driver.quit();
    }
}
