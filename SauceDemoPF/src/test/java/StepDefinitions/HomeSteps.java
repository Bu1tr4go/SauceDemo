package StepDefinitions;

import Pages.ProductHomePage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomeSteps {

    ProductHomePage homePage = new ProductHomePage(DriverManager.getDriver().driver);

    @And("Select the menu button")
    public void openMenu() {
        homePage.openMenu();
    }

    @And("Reset the app state")
    public void resetAppState() {
        homePage.resetAppState();
    }

    @Then("Add the product {string} to the cart")
    public void addProductToCart(String product) {
        homePage.addProductToCartByName(product);
    }

    @And("Check if the app state is reset {string}")
    public void verifyAppStateReset(String product) {
        homePage.verifyResetState(product);
    }

    @When("Click on the cart icon")
    public void goToCart() {
        homePage.goToCart();
    }

    @When("Click on the logout button")
    public void clickLogout() {
        homePage.clickLogout();
    }

    @Then("Redirection to login page")
    public void verifyLoginButtonIsDisplayed() {
        Assertions.assertTrue(homePage.isLoginButtonDisplayed());
    }

    @And("Click Twitter link")
    public void clickOnTwitterLink() {
        homePage.clickOnTwitterLink();
        homePage.switchToNewWindow();
    }

    @Then("Redirection to the Sauce Labs Twitter page")
    public void verifyTwitterRedirect() {
        String expectedUrl = "https://x.com/saucelabs";
        String currentUrl = DriverManager.getDriver().driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, currentUrl);
    }
}
