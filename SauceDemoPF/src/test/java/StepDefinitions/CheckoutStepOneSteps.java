package StepDefinitions;

import Pages.CheckoutPageStepOne;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutStepOneSteps {

    CheckoutPageStepOne checkoutStepOnePage = new CheckoutPageStepOne(DriverManager.getDriver().driver);

    @And("Set the first name with {string}")
    public void fillInFirstName(String firstName) {
        checkoutStepOnePage.enterFirstName(firstName);
    }

    @And("Set the last name with {string}")
    public void fillInLastName(String lastName) {
        checkoutStepOnePage.enterLastName(lastName);
    }

    @And("Set the postal code with {string}")
    public void fillInPostalCode(String postalCode) {
        checkoutStepOnePage.enterPostalCode(postalCode);
    }

    @And("Click on Continue Button")
    public void clickContinueButton() {
        checkoutStepOnePage.submitCheckoutDetails();
    }

    @Then("The error message {string} should be displayed")
    public void theErrorMessageShouldBeDisplayed(String expectedMessage) {
        String actualMessage = checkoutStepOnePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
