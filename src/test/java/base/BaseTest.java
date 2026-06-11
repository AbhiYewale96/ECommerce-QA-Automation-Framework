package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;

import utils.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @BeforeMethod
    public void init() {
        setup();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {

        String testName = result.getName();

        try {
            if (result.getStatus() == ITestResult.SUCCESS) {
                ScreenshotUtil.capture(driver, testName, "PASS");
            }
            else if (result.getStatus() == ITestResult.FAILURE) {
                ScreenshotUtil.capture(driver, testName, "FAIL");
            }
            else if (result.getStatus() == ITestResult.SKIP) {
                ScreenshotUtil.capture(driver, testName, "SKIP");
            }
        } catch (Exception e) {
            System.out.println("Error taking screenshot: " + e.getMessage());
        }

        if (driver != null) {
            driver.quit();
        }
    }
}