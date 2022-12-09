package za.co.bbd.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertValue {

    public void assertText(String value, WebElement xpathKey) {
        try {
            Thread.sleep(1000);
            Assert.assertEquals(value, xpathKey.getText());
        } catch (Error | InterruptedException e) {
            System.out.println("Text is not verified"+e.getMessage());
        }
    }

    public void assertAttribute(String value, WebElement xpathKey, String AttributeValue) {
        try {
            Thread.sleep(1000);
            Assert.assertEquals(value, xpathKey.getAttribute(AttributeValue));
        } catch (Error | InterruptedException e) {
            System.out.println("Text is not verified"+e.getMessage());
        }
    }

}
