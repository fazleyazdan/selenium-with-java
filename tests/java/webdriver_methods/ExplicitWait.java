package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {

    public static ChromeOptions options;
    public static WebDriver driver;


    @Test
    void explicitTest() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        /*
            - we have two things in explicit wait
            - declaration & usage
            - after the declaration we have to give a condition as well, for example the element should be visible, enabled etc.
            - first we will make object of WebdriverWait class
              inside the class we have constructor which expect 2 Arguments (driver & duration)
            -
        */

        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement elementAndStatus = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));

        // now here if you wants to do further manipulation , you don't need to locate that element. because it is already stored in "elementAndStatus"
        elementAndStatus.click();
        System.out.println("status "+ elementAndStatus.isEnabled());


        // once explicit wait is declared you can use it with multiple statements
        WebElement element2 = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Wikipedia1_wikipedia-search-input")));
        element2.sendKeys("Explicit Wait");



    }
}
