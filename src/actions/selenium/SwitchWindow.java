package actions.selenium;


import actions.selenium.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class SwitchWindow {
    
    public void run(HashMap<String, Object> params) {
    
       for (String handle1 : Browser.Driver.getWindowHandles()) {
			System.out.println("WINDOW++++"+handle1);
     		Browser.Driver.switchTo().window(handle1);
           
      
        }
      
     }
}