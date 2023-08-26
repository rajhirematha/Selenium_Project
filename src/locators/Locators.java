package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators  {
        public static WebDriver driver;
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();

            driver.get("https://www.google.com/");

            WebElement element = driver.findElement(By.id("APjFqb"));




    }
}
