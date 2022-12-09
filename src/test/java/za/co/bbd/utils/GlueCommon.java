package za.co.bbd.utils;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;

public class GlueCommon {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void init() {
        driver = WebDriverFactory.createWebDriver();
    }

    @After(order=2)
    public void tearDown() {
        driver.quit();
    }

    @After
    public void takeSnapshotIfScenarioFailed(Scenario scenario) throws IllegalMonitorStateException
    {
        if(scenario.isFailed())
        {
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
        }
    }

}
