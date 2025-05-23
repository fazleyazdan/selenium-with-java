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

    // conditional methods are used with web elements:

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

        // isEnabled()
        // we may perform these actions on input boxes, search box etc
        WebElement box_status = driver.findElement(By.id("name"));
        System.out.println("Enable status of input box:" + box_status.isEnabled());

        // isSelected()
        WebElement radiob_male = driver.findElement(By.id("male"));
        WebElement radiob_female = driver.findElement(By.id("female"));

        System.out.println("male radio button is selected:" + radiob_male.isSelected());       // false
        System.out.println("female radio button is selected:" + radiob_female.isSelected());   // false

        driver.findElement(By.id("male")).click();

        // after selecting male radio button
        System.out.println("male radio button is selected:" + radiob_male.isSelected());        // True
        System.out.println("female radio button is selected:" + radiob_female.isSelected());    // false


    }

}
