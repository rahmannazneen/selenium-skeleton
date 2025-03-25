package tests;

import com.automation.selenium.pages.SignUpPage;
import org.testng.annotations.Test;
import tests.utils.Constant;

public class SignUpTest extends BaseTest {
    @Test
    public void testValidSignUp() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.clickSignInLink();
        Thread.sleep(3000);
        signUpPage.insertUsername(Constant.signup_username);
        signUpPage.insertPassword(Constant.signup_password);
        signUpPage.clickSubmitButton();
        Thread.sleep(3000);


    }
}
