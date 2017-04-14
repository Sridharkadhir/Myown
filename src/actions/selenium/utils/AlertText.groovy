package actions.selenium;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;


class AlertText{
    public  run(def params){
        
        Alert alert = Browser.Driver.switchTo().alert();
        
        
        assert alert.getText().contains(params.Text), "Error expected text: ${params.Text} does not match text on the UI: ${alert.getText()}"
        
        
   		return alert.getText();
        
    
        
    }
}