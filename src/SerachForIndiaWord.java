import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SerachForIndiaWord {
    public static WebDriver driver;





    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        ele.sendKeys("India");

    }
}