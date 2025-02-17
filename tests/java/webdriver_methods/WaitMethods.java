package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaitMethods {

    public static ChromeOptions options;
    public static WebDriver driver;



    @Test
    void waitCommandsTest()
    {
        driver.get("");
    }
}
