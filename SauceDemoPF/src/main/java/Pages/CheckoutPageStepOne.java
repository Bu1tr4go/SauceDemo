package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageStepOne {
    WebDriver browserDriver;

    @FindBy(id = "first-name")
    WebElement firstNameField;
    @FindBy(id = "last-name")
    WebElement lastNameField;
    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    @FindBy(name = "continue")
    WebElement continueButton;

    @FindBy(css = ".error-message-container")
    WebElement errorMessageContainer;

    public CheckoutPageStepOne(WebDriver browserDriver){
        this.browserDriver = browserDriver;
        PageFactory.initElements(browserDriver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public void submitCheckoutDetails() {
        continueButton.click();
    }

    public String getErrorMessage() {
        return errorMessageContainer.getText();
    }
}
