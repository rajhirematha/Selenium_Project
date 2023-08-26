package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class GoogleSearch {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Selenium\\chrome-win64\\chrome.exe");
        driver=new ChromeDriver(co);

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.id("APjFqb")).sendKeys("India");


        List<WebElement> ele = driver.findElements(By.name("btnK"));
         ele.get(1).click();





    }
}
