package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

/*

-   Suppose there are 7 lines of code, and in 3rd line you are accessing an element
    which is not loaded fully on the web page, in that case you will get an exception because of the
    Synchronization. it is because the speed of our script is faster than the application response.

-   Now the speed of the application is not in our hand but, we can slow down our script to match
    the application response.

-   Note : Thread.sleep() is not a webdriver method, it is default method in Java
-   implicit wait, explicit wait/fluent wait are the only 2 webdriver methods in selenium

 */
public class WaitMethods {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void Setup() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }


    @Test
    void waitCommandsTest() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");

        // Thread.sleep() : we won't be using this method frequently
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());

        // Implicit wait : This wait is applicable for all statements that comes after it
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        /* Here the default time is 0 sec and the maximum timeout is 5 sec
           if the element is available immediately then the implicit wait won't take any
           time. if the element is not available immediately then maximum timeout will be 5 Sec in this case
         */

        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']"));
        System.out.println("status"+ element.isDisplayed());
    }
}
