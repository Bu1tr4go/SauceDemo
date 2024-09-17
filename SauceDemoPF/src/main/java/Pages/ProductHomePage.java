package Pages;

import com.google.common.collect.Ordering;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductHomePage {
    WebDriver browserDriver;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton1;

    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    WebElement addToCartButton2;

    @FindBy(id="Reset App State")
    WebElement resetOptionInMenu;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(className = "product_sort_container")
    WebElement sortDropdown;

    public ProductHomePage(WebDriver browserDriver){
        this.browserDriver = browserDriver;
        PageFactory.initElements(browserDriver, this);
    }

    public void addProductToCartByName(String productName){
        String productId = "add-to-cart-" + productName.replace(" ", "-").toLowerCase();
        WebElement productAddButton = browserDriver.findElement(By.id(productId));
        productAddButton.click();
    }

    public void openMenu(){
        menuButton.click();
    }

    public void resetAppState(){
        WebElement resetAppStateOption = new WebDriverWait(browserDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Reset App State")));
        resetAppStateOption.click();
    }

    public void verifyResetState(String productName){
        String productId = "add-to-cart-" + productName.replace(" ", "-").toLowerCase();
        try{
            WebElement productAddButton = new WebDriverWait(browserDriver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className(productId)));
            Assertions.assertEquals("Add to cart", productAddButton.getText());
        }
        catch (Exception ex){
            Assertions.assertEquals(true, false);
        }
    }

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButtonMenu;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void goToCart(){
        cartIcon.click();
    }

    public void clickLogout() {
        new WebDriverWait(browserDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(logoutButtonMenu))
                .click();
    }

    public boolean isLoginButtonDisplayed() {
        return new WebDriverWait(browserDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(loginButton))
                .isDisplayed();
    }

    @FindBy(linkText = "Twitter")
    WebElement twitterLink;

    public void clickOnTwitterLink() {
        twitterLink.click();
    }

    public void switchToNewWindow() {
        for (String handle : browserDriver.getWindowHandles()) {
            browserDriver.switchTo().window(handle);
        }
    }
}
