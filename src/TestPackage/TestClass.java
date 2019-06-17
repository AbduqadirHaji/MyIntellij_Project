package TestPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "/Users/abdulkadirhaci/Documents/My_IT_Resources/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

    }
}
