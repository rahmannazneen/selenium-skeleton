package tests;

import com.automation.selenium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utils.Constant;

public class LoginTests extends BaseTest {

    @Test
    public void validLoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickSignInLink();
        Thread.sleep(3000);
        loginPage.enterLoginEmail(Constant.login_username);
        loginPage.enterLoginPassword(Constant.login_password);
        loginPage.clickLogin();
        Assert.assertEquals(webDriver.getTitle(), "STORE");
    }
}
