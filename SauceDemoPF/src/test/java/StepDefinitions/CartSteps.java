package StepDefinitions;

import Pages.ShoppingCartPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartSteps {

    ShoppingCartPage cartPage = new ShoppingCartPage(DriverManager.getDriver().driver);

    @Then("Button continuar should be disabled")
    public void verifyCartIsNotEmpty() {
        cartPage.validateEmptyCart();
    }

    @And("Click on checkout button")
    public void clickCheckoutButton() {
        cartPage.proceedToCheckout();
    }
}
