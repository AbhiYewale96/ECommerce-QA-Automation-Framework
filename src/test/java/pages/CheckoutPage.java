package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By errorMsg = By.cssSelector("h3[data-test='error']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout(String first, String last, String code) {

        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(first);

        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(last);

        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(code);

        driver.findElement(continueBtn).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }
}