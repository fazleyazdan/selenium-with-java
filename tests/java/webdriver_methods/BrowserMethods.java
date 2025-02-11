package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserMethods {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void Setup() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    /*

    Browser methods :
    1. driver.close() - close single browser window
    2. driver.quite() - close all browser windows

     */

    @Test
    void browserTest() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.cssSelector(".wikipedia-icon")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}
