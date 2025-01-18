package tests;

import com.automation.selenium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utils.Constant;

public class LoginTests extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickSignInLink();
        loginPage.enterLoginEmail(Constant.login_email);
        loginPage.enterLoginPassword(Constant.login_password);
        loginPage.clickLogin();
        Assert.assertEquals(webDriver.getTitle(), "Customer Login");
    }
}
