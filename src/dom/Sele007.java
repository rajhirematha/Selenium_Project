package dom;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele007 {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver","C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.navigate().to("https://echoecho.com/htmlforms10.htm");

        driver.findElement(By.xpath("//span[contains(text(),'radio')]")).click();


//        driver.quit();

    }
}
