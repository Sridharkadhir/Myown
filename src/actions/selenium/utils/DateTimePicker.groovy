package actions.selenium

import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import org.openqa.selenium.Keys
import actions.selenium.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver

class DateTimePicker{
  
  public static void run(def params){
    WebElement element = Elements.find(params,Browser.Driver)
    
      String IDValue = params.ID;
      
  JavascriptExecutor js = (JavascriptExecutor)Browser.Driver;
  js.executeScript("document.getElementById('"+params.ID+"').value='"+params.DateTime+"'");
    
  }
}