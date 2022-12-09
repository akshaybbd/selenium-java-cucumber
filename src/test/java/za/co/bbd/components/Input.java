package za.co.bbd.components;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Input{


    public void inputText(WebElement inputPath, String value) throws InterruptedException {
        inputPath.click();
        inputPath.clear();
        Thread.sleep(2000);
        inputPath.sendKeys(value);
    }

    public void fieldClassValue(WebElement locatorPath, String ActualClass){

        String attributeValue = locatorPath.getAttribute("class");
        Assert.assertEquals(attributeValue,ActualClass);
        String cssValue = locatorPath.getCssValue("border-left-color");
        System.out.println("Border color = "+cssValue);
    }



}
