package com.automation.selenium.pages;

import com.automation.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private WebDriver driver;

    // Locators
    private By loginLink = By.id("login2");
    private By loginUsername = By.id("loginusername");
    private By loginPassword = By.id("loginpassword");
    private By loginSubmitButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void clickSignInLink() {
        click(loginLink);
    }

    public void enterLoginEmail(String username) {
        type(loginUsername, username);
    }

    public void enterLoginPassword(String password) {
        type(loginPassword, password);
    }

    public void clickLogin() {
        click(loginSubmitButton);
    }
}
