import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckboxAndRadioButton {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Android\\All_Selenium_Commands\\src\\test\\res\\chromedriver.exe"); //Path to driver

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://market.yandex.ru/");

        driver.findElement(By.xpath("//a[text()='Бытовая техника']")).click(); // go to link
        driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click(); // go to link




        selectCheckBox("Ardo"); // add checkbox name to the method
        selectCheckBox("Bosch"); // add checkbox name to the method
        selectCheckBox("Candy"); // add checkbox name to the method

        Thread.sleep(15000);// i should use sleep because not enough time for the next step.
        deselectCheckBox("Ardo"); // add checkbox name to the method
        driver.findElement(By.xpath("//*[@class='NVoaOvqe58' and text()[contains(.,'Bosch')]]")).click(); // cancel select


        System.out.println();

        System.out.println(driver.findElement(By.xpath("//*[@id='offer-shipping_pickup']")).isSelected()); //way to know selected radiobutton or not. will false
        driver.findElement(By.xpath("//span[text()[contains(.,'Самовывоз')]]")).click(); //select radiobutton with click

        System.out.println(driver.findElement(By.xpath("//*[@id='offer-shipping_pickup']")).isSelected()); //way to know selected radiobutton or not. will true
        driver.findElement(By.xpath("//span[text()[contains(.,'С доставкой')]]")).click(); //select radiobutton with click



    }

    public static void selectCheckBox(String name){
        String rbXpath = "//*[@class='NVoaOvqe58' and text()[contains(.,'%s')]]";
        if (!driver.findElement(By.xpath(String.format(rbXpath, name))).isSelected()) // test that not selected
            driver.findElement(By.xpath(String.format(rbXpath, name))).click(); // select if not selected
    }

    public static void deselectCheckBox(String name){  // it does not work
        String rbXpath = "//*[@class='NVoaOvqe58' and text()[contains(.,'%s')]]";
        if (driver.findElement(By.xpath(String.format(rbXpath, name))).isSelected()) { // test that selected
            System.out.println(driver.findElement(By.xpath(String.format(rbXpath, name))).isSelected());
            driver.findElement(By.xpath(String.format(rbXpath, name))).click(); // cancel select if selected


        }
        else {
            System.out.println("WROOONG!!!");
        }
    }
}
