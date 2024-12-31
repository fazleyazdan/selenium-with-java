package gettingstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// here we will do validation on web Title. we will use Edge browser for that
public class GetTitle {

    public static EdgeOptions options; // ChromeOptions instance for configuring Chrome-specific settings.
    public static WebDriver driver; // WebDriver instance to interact with the browser.

    @BeforeTest
    void Setup() throws InterruptedException {
        options = new EdgeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new EdgeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void teststeps() {


    }
}
