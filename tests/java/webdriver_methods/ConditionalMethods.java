package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConditionalMethods {

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

    // conditional methods are used with web elements
    // isDisplayed()
    // isEnabled()
    // isSelected()
    @Test
    void condtionsTest()
    {
        driver.get("https://testautomationpractice.blogspot.com/");

    }
}
