package gettingstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// Convention for writing ClassName: Use PascalCase (capitalize the first letter of each word).

public class FirstTest {

    public static ChromeOptions options; // ChromeOptions instance for configuring Chrome-specific settings.
    public static WebDriver driver; // WebDriver instance to interact with the browser.

    @BeforeTest
        // Marks this method to run before the test steps.
    void Setup() throws InterruptedException {
        // Declares that this method may throw an InterruptedException.
        // InterruptedException is thrown if the thread sleep is interrupted during execution.

        options = new ChromeOptions(); // Instantiating ChromeOptions to configure browser settings.
        options.addArguments("--remote-allow-origin=*"); // Configures Chrome to bypass cross-origin issues.

        // Setting the path to the ChromeDriver executable file dynamically using the current project directory.
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/resources/chromedriver.exe");

        driver = new ChromeDriver(options);
        // Instantiates the WebDriver for Chrome using the specified options.

        driver.get("https://www.saucedemo.com/"); // Launches the specified URL in the Chrome browser.

        Thread.sleep(2000); // Introduces a 2-second pause to allow the page to load.
    }

// Convention For writing Function names: Use camelCase
// (start with a lowercase letter; capitalize the first letter of subsequent words).

    @Test
    void teststeps() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
