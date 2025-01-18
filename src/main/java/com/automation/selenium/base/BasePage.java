package com.automation.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {

    private final WebDriver webDriver;
    private final FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.fluentWait = new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class); // Ignore specific exceptions
    }

    protected WebElement waitUntilVisible(By locator) {
        return fluentWait.until(driver -> driver.findElement(locator));
    }

    protected String getText(By locator) {
        return waitUntilVisible(locator).getText();
    }

    protected void type(By locator, String text) {
        WebElement element = waitUntilVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void navigateTo(String url) {
        webDriver.get(url);
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }


    protected void click(By locator) {
        waitUntilVisible(locator).click();
    }
}
