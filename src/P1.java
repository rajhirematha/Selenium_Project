import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P1 {
    public static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo");
        driver.manage().window().maximize();


        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstName.sendKeys("Raj");
        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastName.sendKeys("Swamy");
        WebElement businessName = driver.findElement(By.cssSelector("input[placeholder='Business Name']"));
        businessName.sendKeys("QA");
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        email.sendKeys("rajswamy@gmail.com");

        WebElement submit = driver.findElement(By.xpath("//button[@id='demo']"));
       Thread.sleep(3000,6000);
       driver.getTitle();
        submit.click();
    }
}
