package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetMethod {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void Setup() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    /*

    get Methods :
    1. driver.get(url)               // for visiting web , it won't return anything
    2. driver.getTitle()             // will return title of the web
    3. driver.getCurrentUrl()        // will return active url of the web
    4. driver.getPageSource()        // will return source code of the web page
    5. driver.getWindowHandle()      // will return ID for active browser window
    6. driver.getWindowHandles()     // will return ID of the multiple browser window

    */

    @Test
    void getMethod()
    {

    }

}
