package actions.selenium;


import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;


 
 class DateTime{
  
  public String run(HashMap<String, Object> params)
  {

    WebElement element = Elements.find(params,Browser.Driver);
    
    return element.getText();
  
}
}	
        
        
   

