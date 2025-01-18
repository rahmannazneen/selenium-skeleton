package com.automation.selenium.pages;

import com.automation.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage  {

    private WebDriver driver;

    // Locators
    private By signInLink = By.linkText("Sign In");
    private By loginEmail = By.id("email");
    private By loginPassword = By.id("pass");
    private By loginSubmitButton = By.id("send2");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickSignInLink() {
        click(signInLink);
    }
    public void enterLoginEmail(String username) {
        type(loginEmail, username);
    }

    public void enterLoginPassword(String password) {
        type(loginPassword, password);
    }

    public void clickLogin() {
        click(loginSubmitButton);
    }
}
