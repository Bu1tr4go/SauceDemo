package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver browserDriver;

    @FindBy(id="user-name")
    WebElement usernameInput;

    @FindBy(id="password")
    WebElement passwordInput;

    @FindBy(id="login-button")
    WebElement loginBtn;

    @FindBy(css = "h3[data-test='error']")
    WebElement errorNotification;

    public LoginPage(WebDriver browserDriver){
        this.browserDriver = browserDriver;
        PageFactory.initElements(browserDriver, this);
    }

    public void enterUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void submitLogin(){
        loginBtn.click();
    }
}
