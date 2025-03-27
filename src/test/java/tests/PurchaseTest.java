package tests;

import com.automation.selenium.pages.LoginPage;
import com.automation.selenium.pages.PurchasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.utils.Constant;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class PurchaseTest extends BaseTest {

    @Test
    public void purchaseRandomPhone() throws InterruptedException {
        PurchasePage purchasePage = new PurchasePage(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) webDriver;


        purchasePage.clickPhonesCategory();
        purchasePage.clickAddToCart();
        purchasePage.clickCartLink();
        purchasePage.clickPlaceOrderButton();
        purchasePage.enterName(Constant.name);
        purchasePage.enterCountry(Constant.country);
        purchasePage.enterCity(Constant.city);
        purchasePage.enterCard(Constant.card);
        purchasePage.enterMonth(Constant.month);
        purchasePage.enterYear(Constant.year);


//        // 2️⃣ Retrieve all available phone elements
//        List<WebElement> phoneElements = webDriver.findElements(By.cssSelector(".card-title a"));
//
//        // Ensure at least one product exists
//        Assert.assertFalse(phoneElements.isEmpty(), "No phones found!");
//
//        // 3️⃣ Randomly select a phone
//        Random rand = new Random();
//        int randomIndex = rand.nextInt(phoneElements.size());
//        WebElement selectedPhone = phoneElements.get(randomIndex);
//
//        // Get phone name for verification
//        String selectedPhoneName = selectedPhone.getText();
//        System.out.println("Selected Phone: " + selectedPhoneName);
//
//        // Click on the selected phone
//        selectedPhone.click();
//        Thread.sleep(3000); // Wait for product page to load
//
//        // 4️⃣ Add to Cart
//        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']")));
//        addToCartButton.click();
//        Thread.sleep(3000); // Wait for alert
//
//        // Handle alert confirmation
//        Alert alert = webDriver.switchTo().alert();
//        alert.accept();
//
//        // 5️⃣ Navigate to Cart Page
//        WebElement cartLink = webDriver.findElement(By.xpath("//a[text()='Cart']"));
//        cartLink.click();
//        Thread.sleep(3000); // Wait for cart page to load
//
//        // Verify the phone is in the cart
//        List<WebElement> cartItems = webDriver.findElements(By.xpath("//tbody/tr/td[2]")); // Get all product names in cart
//        boolean isProductInCart = cartItems.stream().anyMatch(item -> item.getText().equals(selectedPhoneName));
//        Assert.assertTrue(isProductInCart, "Selected phone is not in the cart!");
//
//        // 6️⃣ Place the Order
//        WebElement placeOrderButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']")));
//        placeOrderButton.click();
//        Thread.sleep(2000); // Wait for modal
//
//        // Fill order details
//        webDriver.findElement(By.id("name")).sendKeys("Test User");
//        webDriver.findElement(By.id("country")).sendKeys("USA");
//        webDriver.findElement(By.id("city")).sendKeys("New York");
//        webDriver.findElement(By.id("card")).sendKeys("1234567812345678");
//        webDriver.findElement(By.id("month")).sendKeys("12");
//        webDriver.findElement(By.id("year")).sendKeys("2025");
//
//        // 7️⃣ Confirm Purchase
//        WebElement purchaseButton = webDriver.findElement(By.xpath("//button[text()='Purchase']"));
//        purchaseButton.click();
//        Thread.sleep(3000); // Wait for confirmation
//
//        // Verify Success Message
//        WebElement successMessage = webDriver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
//        Assert.assertTrue(successMessage.isDisplayed(), "Purchase was not successful!");
//
//        System.out.println("Purchase completed successfully!");
//
//        // Close success popup
//        WebElement okButton = webDriver.findElement(By.xpath("//button[text()='OK']"));
//        okButton.click();
    }
}
