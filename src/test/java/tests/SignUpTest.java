package tests;

import com.automation.selenium.pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
    @Test
    public void testValidSignUp(){
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.clickSignInLink();


    }
}
