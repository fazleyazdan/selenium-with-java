package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {

    public static ChromeOptions options;
    public static WebDriver driver;


    @Test
    void explicitTest() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        /*
            - we have two things in explicit wait
            - declaration & usage
            - first we will make object of WebdriverWait class
              inside the class we have constructor which expect 2 Arguments (driver & duration)
            -
        */

        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']"));
        System.out.println("status "+ element.isDisplayed());

    }
}
