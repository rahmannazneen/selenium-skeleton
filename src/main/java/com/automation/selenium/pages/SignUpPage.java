package com.automation.selenium.pages;

import com.automation.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
    private WebDriver driver;

    private final By signInLink = By.id("signin2");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink() {
        click(signInLink);
    }

}

