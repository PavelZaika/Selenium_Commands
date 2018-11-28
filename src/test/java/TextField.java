import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TextField {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        WebDriver driver = new ChromeDriver(); // Create new driver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Waiting period in seconds

        driver.manage().window().setSize(new Dimension(900, 500)); //Set window size

        driver.manage().window().maximize(); //Set window size maximum



        //Text field

        driver.get("http://en.wikipedia.org"); //open url
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver"); //Find field and send key
        driver.findElement(By.xpath("//input[@id='searchButton']")).click(); // push the button after fill the text field
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value")); //get value from text field
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear(); //clear text field. it's a good practice to clear the field before print anything to it

        driver.get("http://github.com"); //open url
        driver.findElement(By.xpath(".//*[@id='user[login]']")).sendKeys("testusername"); // Find field and send a key
        driver.findElement(By.xpath(".//*[@id='user[password]']")).sendKeys("testpass"); //Find field and send a key
        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button")); // new web element
        button.submit(); // submit


        driver.get("http://en-gb.facebook.com"); //open url
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("testmail"); //Find field and send a key
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("testpass");//Find field and send a key
        driver.findElement(By.xpath("//label[@id='loginbutton']/input")).submit(); //submit
        System.out.println("Mail is: " + driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("value"));//clear text field.

        driver.quit(); //close page


    }

}
