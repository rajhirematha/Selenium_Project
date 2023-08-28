import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Asam {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Selenium\\chrome-win64\\chrome.exe");
        driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.flipkart.com/");
        WebElement e = driver.findElement(By.xpath("//a"));
        System.out.println("Number of links " + e.getSize());
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

        driver.findElement(By.linkText("Cart")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
