
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateBack {
   public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Selenium\\chrome-win64\\chrome.exe");
        driver=new ChromeDriver(co);

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement e = driver.findElement(By.partialLinkText("ail"));
       String e1 = driver.getTitle();
        System.out.println(e1);
        e.click();

//        System.out.println(driver.getCurrentUrl());

       Thread.sleep(2000);

        driver.navigate().back();

//        driver.switchTo().defaultContent();

        Thread.sleep(4000);

        driver.quit();



    }
}
