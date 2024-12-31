package locators;

// in this case we will locate elements using different types of locators

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

public class locators {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void Setup() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();      // maximize browser window
        Thread.sleep(2000);
    }

    void usingLocators
}
