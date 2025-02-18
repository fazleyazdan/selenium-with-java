package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        Thread.sleep(1000);
    }


    @Test
    void waitCommandsTest()
    {
        driver.get("");
    }
}
