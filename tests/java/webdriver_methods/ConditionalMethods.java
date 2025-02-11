package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        // check is wikipedia logo is displayed or not.
        // we can do it in two ways, first store element & then do manipulation on it

        WebElement wiki_logo = driver.findElement(By.cssSelector(".wikipedia-icon"));
        System.out.println("display status of the logo is:" + wiki_logo.isDisplayed());

        // OR we can chain conditional command and do it one statement

        boolean logo_status = driver.findElement(By.cssSelector(".wikipedia-icon")).isDisplayed();
        System.out.println("display status of the logo is:" + logo_status);


    }

}
