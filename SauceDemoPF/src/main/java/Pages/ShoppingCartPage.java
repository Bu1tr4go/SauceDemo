package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage {
    WebDriver browserDriver;

    public ShoppingCartPage(WebDriver browserDriver){
        this.browserDriver = browserDriver;
        PageFactory.initElements(browserDriver, this);
    }

    public void validateEmptyCart(){
        WebElement checkoutBtn = browserDriver.findElement(By.name("checkout"));
        Assertions.assertFalse(checkoutBtn.isEnabled());
    }

    public void proceedToCheckout(){
        WebElement checkoutBtn = browserDriver.findElement(By.name("checkout"));
        checkoutBtn.click();
    }
}
