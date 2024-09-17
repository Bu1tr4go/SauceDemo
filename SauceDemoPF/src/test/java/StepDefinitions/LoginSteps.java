package StepDefinitions;

import Pages.LoginPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @Given("Enter the username as {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @And("Enter the password as {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("Click on the login button")
    public void submitLogin() {
        loginPage.submitLogin();
    }
}
