package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest {

    CheckoutPage checkout;
    LoginPage login;
    ProductPage product;

    @BeforeMethod
    public void initTest() {

        login = new LoginPage(driver);
        product = new ProductPage(driver);
        checkout = new CheckoutPage(driver);

        // Login
        login.login("standard_user", "secret_sauce");

        // Add product to cart
        product.addProductToCart();

        // Open cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Open checkout page
        driver.findElement(By.id("checkout")).click();
    }

    @Test
    public void validCheckoutTest() {

        checkout.checkout("Abhi", "Yewale", "431001");

        Assert.assertTrue(
                driver.getPageSource().contains("Checkout: Overview"),
                "Checkout overview page is not displayed"
        );
    }

    @Test
    public void emptyFirstNameTest() {

        checkout.checkout("", "Yewale", "431001");

        String error = checkout.getErrorMessage();

        Assert.assertTrue(
                error.contains("First Name is required"),
                "First Name validation message is not displayed"
        );
    }

    @Test
    public void emptyLastNameTest() {

        checkout.checkout("Abhi", "", "431001");

        String error = checkout.getErrorMessage();

        Assert.assertTrue(
                error.contains("Last Name is required"),
                "Last Name validation message is not displayed"
        );
    }

    @Test
    public void emptyPostalCodeTest() {

        checkout.checkout("Abhi", "Yewale", "");

        String error = checkout.getErrorMessage();

        Assert.assertTrue(
                error.contains("Postal Code is required"),
                "Postal Code validation message is not displayed"
        );
    }

    @Test
    public void allFieldsEmptyTest() {

        checkout.checkout("", "", "");

        String error = checkout.getErrorMessage();

        // SauceDemo shows the first missing field validation
        Assert.assertTrue(
                error.contains("First Name is required"),
                "Validation message is not displayed"
        );
    }
}