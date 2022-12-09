package za.co.bbd.steps.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import za.co.bbd.screens.login.LoginScreen;
import za.co.bbd.utils.GlueCommon;

public class LoginStepDefinitions{

    private final GlueCommon glueCommon;
    private final LoginScreen loginScreen;

    public LoginStepDefinitions(GlueCommon glueCommon) {
        this.glueCommon = glueCommon;
        this.loginScreen= new LoginScreen(glueCommon.getDriver());
    }

    @Given("I visit the BBD iCapture login page")
    public void iVisitTheBBDICaptureLoginPage() {
        glueCommon.getDriver().get(System.getProperty("host"));
    }

    @When("I enter my username {string}")
    public void enterUsername(String username) throws InterruptedException {
        loginScreen.enterUsername(username);
    }

    @When("I enter my password {string}")
    public void enterPassword(String password) throws InterruptedException {
        loginScreen.enterPassword(password);
    }

    @Then("I click on the login in button")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }


}
