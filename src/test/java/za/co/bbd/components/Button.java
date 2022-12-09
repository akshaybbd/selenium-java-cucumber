package za.co.bbd.components;

import org.openqa.selenium.WebElement;

public class Button {

    public void buttonStatus(WebElement ButtonAddress){
        System.out.println(ButtonAddress.getAttribute("class"));
        boolean buttonbyDefault = ButtonAddress.isEnabled();
        if(buttonbyDefault){
            System.out.println(ButtonAddress+" button is enabled");
        }
        else
        {
            System.out.println(ButtonAddress+" button is disabled");
        }

    }

}
