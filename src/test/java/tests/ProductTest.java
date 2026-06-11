package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {

    LoginPage login;
    ProductPage product;

    @BeforeMethod
    public void initTest() {
        // ❌ NO setup() here

        login = new LoginPage(driver);
        product = new ProductPage(driver);

        login.login("standard_user", "secret_sauce");
    }

    // ❌ REMOVE @AfterMethod completely (BaseTest handles it)

    @Test
    public void addToCartTest() {
        product.addProductToCart();
        product.goToCart();

        boolean itemPresent = driver.getPageSource().contains("Sauce Labs Backpack");
        Assert.assertTrue(itemPresent);
    }

    @Test
    public void addMultipleProducts() {

        // ❌ REMOVE extra login (already done in BeforeMethod)

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        int count = driver.findElements(By.className("cart_item")).size();
        Assert.assertEquals(count, 2);
    }

    @Test
    public void cartQuantityUpdate() {

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        String number = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(number, "1");
    }

    @Test
    public void removeProduct() {

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        boolean isEmpty = driver.findElements(By.className("cart_item")).isEmpty();
        Assert.assertTrue(isEmpty);
    }

    @Test
    public void checkPrice() {

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Abhi");
        driver.findElement(By.id("last-name")).sendKeys("Yewale");
        driver.findElement(By.id("postal-code")).sendKeys("431001");

        driver.findElement(By.id("continue")).click();

        String total = driver.findElement(By.className("summary_total_label")).getText();
        Assert.assertTrue(total.contains("Total"));
    }

    @Test
    public void cartPersistence() {

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.navigate().refresh();

        driver.findElement(By.className("shopping_cart_link")).click();

        boolean isPresent = driver.getPageSource().contains("Sauce Labs Backpack");
        Assert.assertTrue(isPresent);
    }
}