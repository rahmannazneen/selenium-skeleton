package com.automation.selenium.pages;

import com.automation.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
    private WebDriver driver;

    private final By signInLink = By.id("signin2");
    private final By signupUsername = By.id("sign-username");
    private final By signupPassword = By.id("sign-password");
    private final By signupSubmitButton = By.xpath("//button[text()='Sign up']");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink() {
        click(signInLink);
    }

    public void insertUsername(String username) {
        type(signupUsername, username);
    }

    public void insertPassword(String password) {
        type(signupPassword, password);
    }
    public void clickSubmitButton(){
        click(signupSubmitButton);
    }

}

