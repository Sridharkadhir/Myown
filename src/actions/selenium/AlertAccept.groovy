package actions.selenium;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
class AlertAccept{
    public void run(def params){
        
        Alert alert = Browser.Driver.switchTo().alert();	
        
        alert.accept();
        
    }
}