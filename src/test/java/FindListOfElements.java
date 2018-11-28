import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class FindListOfElements {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://market.yandex.ru/");

        driver.findElement(By.xpath("//a[text()='Бытовая техника']")).click(); // go to link
        driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click(); // go to link


        List<WebElement> checkboxes = driver.findElements(By.xpath("//input [@type='checkbox' and @name[contains(.,'Производитель')]]"));


        if (checkboxes.size() == 12) {
            System.out.println(checkboxes.size() + "...Yes, there are 12 positions");
        } else {
            System.out.println("Wrong!!!!");
        }

        Actions actions = new Actions(driver);


        for (WebElement checkbox : checkboxes) {
            actions.moveToElement(checkbox).click().perform();
        }

    }
}
