package actions.selenium;


import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

class DropDownSelectedText{
  
  public run(def params){
    WebElement element = Elements.find(params,Browser.Driver)
    
      
      String selectedValue = new Select(element).getFirstSelectedOption().getText();
      
      assert selectedValue.equals(params.Text), "Error expected text: ${params.Text} does not match text on the UI: ${selectedValue}"
     
      return selectedValue;
    
    	//new Select(element).selectByVisibleText(params."Visible Text")  
    
	
    
  }
}