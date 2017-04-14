package actions.selenium.utils;

import org.openqa.selenium.WebDriver;
import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

class SendKeys{
    public void run(def params){
        
        
          WebElement element = Elements.find(params,Browser.Driver) 
        
		
  	  def randomUserValue=params."Text"
         element.clear() 
          element.sendKeys(randomUserValue)
	  
    } 
}
        
    
