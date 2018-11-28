import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.DoubleTapAction;

import java.util.concurrent.TimeUnit;

public class DropDownList {


    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");


        selectOption("День", "27");
        selectOption("Месяц", "янв");
        selectOption("Год", "1986");



    }

    public static void selectOption(String listName, String option){

        // Actions builder = new Actions(driver);
        String listXpath = String.format("//select[@aria-label = '%s']", listName);
        String optionXpath = String.format("//option[text() = '%s']", option);
       WebElement listClick = driver.findElement(By.xpath(listXpath));
        WebElement optionClick = driver.findElement(By.xpath(optionXpath));
        listClick.click();
        optionClick.click();
    }
}