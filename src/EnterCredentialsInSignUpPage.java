import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnterCredentialsInSignUpPage {
    public static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Selenium\\chrome-win64\\chrome.exe");
        driver=new ChromeDriver(co);
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
