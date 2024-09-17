package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckoutPageStepTwo {
    WebDriver browserDriver;

    @FindBy(className = "inventory_item_price")
    List<WebElement> productPrices;

    @FindBy(className = "summary_subtotal_label")
    WebElement totalPriceLabel;

    public CheckoutPageStepTwo(WebDriver browserDriver){
        this.browserDriver = browserDriver;
        PageFactory.initElements(browserDriver, this);
    }

    public void verifyTotalPrice(){
        double totalPrice = 0.0;
        for (WebElement priceElement : productPrices) {
            String priceString = priceElement.getText().replace("$", "");
            totalPrice += Double.parseDouble(priceString);
        }

        String displayedTotalPrice = totalPriceLabel.getText().replace("Item total: $", "");
        double totalSummaryPrice = Double.parseDouble(displayedTotalPrice);
        Assertions.assertEquals(totalPrice, totalSummaryPrice);
    }
}
