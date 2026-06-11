package tests;

import base.BaseTest;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

//import java.time.Duration;

public class CheckoutTest extends BaseTest {

    @BeforeMethod
    public void initTest() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        System.out.println("URL after login: " + driver.getCurrentUrl());

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Test
    public void checkoutTest() {

        driver.findElement(By.name("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Abhi");
        driver.findElement(By.id("last-name")).sendKeys("Yewale");
        driver.findElement(By.id("postal-code")).sendKeys("431001");

        driver.findElement(By.id("continue")).click();

        Assert.assertTrue(driver.getPageSource().contains("Checkout: Overview"));
    }
}