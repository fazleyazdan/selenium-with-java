package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class GetMethod {

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

    Note : get methods are used with webdriver interface
    get Methods :
    1. driver.get(url)               // for visiting web , it won't return anything
    2. driver.getTitle()             // will return title of the web
    3. driver.getCurrentUrl()        // will return active url of the web
    4. driver.getPageSource()        // will return source code of the web page
    5. driver.getWindowHandle()      // will return ID for active browser window
    6. driver.getWindowHandles()     // will return ID of the multiple browser window opened

    */

    @Test
    void getMethod()
    {
        // navigate to website
        driver.get("https://demo.automationtesting.in/Register.html");

        // get title of the web
        System.out.println(driver.getTitle());

        // get URL of the webpage
        System.out.println(driver.getCurrentUrl());

        // get Source code of the web page
        System.out.println(driver.getPageSource());

        // get ID of the browser window - Note that window ID is dynamic, and it changes everytime you visit it
        System.out.println(driver.getWindowHandle());

        // get ID of the multiple browser window
        // first we will open new window
        driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']")).click();
        driver.findElement(By.cssSelector("a[href='Windows.html']")).click();
        driver.findElement(By.cssSelector("button.btn.btn-info:first-child")).click();

        // we will use Set to store multiple IDs, since IDs are unique and in set we store unique elements
        Set <String> windowIds = driver.getWindowHandles();

        System.out.println(windowIds);

    }

}
