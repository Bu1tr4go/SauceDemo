package StepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.Given;

public class CommonSteps {

    @Given("I am on the Sauce Demo web page")
    public void navigateToSauceDemoPage() {
        DriverManager.getDriver().driver.get("https://www.saucedemo.com/");
        DriverManager.getDriver().driver.manage().window().maximize();
    }
}
