package za.co.bbd.screens.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {

    public final WebDriver driver;

    @FindBy(name = "username")
    public WebElement usernameTextBox;
    @FindBy(name = "password")
    public WebElement passwordTextBox;
    @FindBy(id = "btnSignIn")
    public WebElement loginButton;

    public LoginScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) throws InterruptedException {
        usernameTextBox.sendKeys(username);
        Thread.sleep(1000);
    }

    public void enterPassword(String password) throws InterruptedException {
        passwordTextBox.sendKeys(password);
        Thread.sleep(1000);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}


