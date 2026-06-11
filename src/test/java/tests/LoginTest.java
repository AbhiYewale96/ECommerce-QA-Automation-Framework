package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    LoginPage login;

    @BeforeMethod
    public void initTest() {
        login = new LoginPage(driver);
    }

    // ✅ 1. Valid Login
    @Test
    public void validLoginTest() {
        login.login("standard_user", "secret_sauce");

        boolean isLoggedIn = driver.getCurrentUrl().contains("inventory");
        Assert.assertTrue(isLoggedIn, "Login failed!");
    }

    // ❌ 2. Invalid Username
    @Test
    public void invalidUsernameTest() {
        login.login("wrong_user", "secret_sauce");

        String error = login.getErrorMessage();
        Assert.assertTrue(error.contains("Username and password do not match"));
    }

    // ❌ 3. Invalid Password
    @Test
    public void invalidPasswordTest() {
        login.login("standard_user", "wrong_pass");

        String error = login.getErrorMessage();
        Assert.assertTrue(error.contains("Username and password do not match"));
    }

    // ❌ 4. Invalid Both
    @Test
    public void invalidBothTest() {
        login.login("wrong_user", "wrong_pass");

        String error = login.getErrorMessage();
        Assert.assertTrue(error.contains("Username and password do not match"));
    }

    // ⚠️ 5. Empty Login
    @Test
    public void emptyLoginTest() {
        login.login("", "");

        String error = login.getErrorMessage();
        Assert.assertTrue(error.contains("Username is required"));
    }
}