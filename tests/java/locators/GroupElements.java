package locators;

// usually we use class & tags to capture group of elements
// as there can be multiple elements that can have same class & tags
// here in this task I will count elements having same class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;        // To use list we will import from java utility class List

public class GroupElements {

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
    void countElements() {

    // Note : we will use List to capture more than one web elements
    // we can also use "Set", but we can have duplicated Web elements & set can't store duplicated elements
    // List is a collection & here we will give WebElements its type. since we are storing web elements
    // here I will count elements having "a" tag.
    // also I will count elements having class "input-box"

        List <WebElement> captureInputBox = driver.findElements(By.className("input-box"));
        System.out.println("number of elements having input-box as class name:" + captureInputBox.size());

        List <WebElement> captureLinks = driver.findElements(By.xpath("//a"));
        System.out.println("number of elements having anchor tag:" + captureLinks.size());

    }
}











