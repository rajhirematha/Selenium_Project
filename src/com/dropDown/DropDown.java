package com.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class DropDown {
public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Selenium\\chrome-win64\\chrome.exe");
        driver=new ChromeDriver(co);
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();

    driver.get("https://computer-database.gatling.io/computers/new");

//    WebElement com = driver.findElement(By.id("company"));
//    Select company = new Select(com);
//    company.selectByIndex(1);



    }
}
