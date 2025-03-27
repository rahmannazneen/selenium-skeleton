package com.automation.selenium.pages;

import com.automation.selenium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PurchasePage extends BasePage {
    private WebDriver driver;

    private final By phonesCategory = By.partialLinkText("Phone");
    private final By addToCartButton = By.xpath("//a[text()='Add to cart']");
    private final By cartLink = By.xpath("//a[text()='Cart']");
    private final By cartItems = By.xpath("//tbody/tr/td[2]");
    private final By placeOrderButton = By.xpath("//button[text()='Place Order']");
    private final By customerName = By.id("name");
    private final By customerCountry = By.id("country");
    private final By customerCity = By.id("city");
    private final By customerCard = By.id("card");
    private final By customerMonth = By.id("month");
    private final By customerYear = By.id("year");


    public PurchasePage(WebDriver driver) {
        super(driver);
    }


    public void clickPhonesCategory() {
        click(phonesCategory);
    }

    public void clickAddToCart() {
        click(addToCartButton);
    }

    public void clickCartLink() {
        click((cartLink));
    }

    public void clickPlaceOrderButton() {
        click((placeOrderButton));
    }

    public void enterName(String name) {
        type(customerName, name);
    }

    public void enterCountry(String country) {
        type(customerCountry, country);
    }

    public void enterCity(String city) {
        type(customerCity, city);
    }

    public void enterCard(String card) {
        type(customerCard, card);
    }

    public void enterMonth(String month) {
        type(customerMonth, month);
    }

    public void enterYear(String year) {
        type(customerYear, year);
    }
}
