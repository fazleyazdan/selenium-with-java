package locators;

// in this case we will locate elements using different types of locators

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsTest {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void Setup() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.get("https://practice.expandtesting.com/inputs");
        driver.manage().window().maximize();      // maximize browser window
        Thread.sleep(2000);
    }

    @Test
    void usingLocators() throws InterruptedException
    {

        // get element by id
        driver.findElement(By.id("input-number")).sendKeys("1234567");

        // get element by name
        driver.findElement(By.name("input-text")).sendKeys("Testing..");

        // get element by class name (this only works with single class name)
        // for class names which are combinations of two or more use By.cssSelector
        driver.findElement(By.className("btn-outline-primary")).click();

        // get element by xpath
        driver.findElement(By.xpath("//button[@id='btn-clear-inputs']")).click();

        // get element by link text.
        // if a text is displayed on web & by clicking it. it redirects to another page then we can use it as a linkText
        driver.findElement(By.linkText("Test Cases")).click();

        Thread.sleep(1000);

        // get element by partial link text
        driver.findElement(By.partialLinkText("Register")).click();


    }




