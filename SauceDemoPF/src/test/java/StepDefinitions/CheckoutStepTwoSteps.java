package StepDefinitions;

import Pages.CheckoutPageStepTwo;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class CheckoutStepTwoSteps {

    CheckoutPageStepTwo checkoutStepTwoPage = new CheckoutPageStepTwo(DriverManager.getDriver().driver);

    @And("Check the total price calculated and the total products price")
    public void verifyTotalPrice() {
        checkoutStepTwoPage.verifyTotalPrice();
    }
}
