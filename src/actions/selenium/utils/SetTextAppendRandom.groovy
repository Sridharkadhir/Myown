package actions.selenium;

import org.openqa.selenium.WebDriver;
import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.Random;

class SetTextAppendRandom{ 
    
    private static final Random RANDOM = new SecureRandom();
  /** Length of password. @see #generateRandomPassword() */
  public static final int PASSWORD_LENGTH = 8;
    
    
    
    public run(def params)
    { 
          WebElement element = Elements.find(params,Browser.Driver) 
        
      String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789+@";
       String pw = "";
        
        for (int i=0; i<PASSWORD_LENGTH; i++)
      {
          int index = (int)(RANDOM.nextDouble()*letters.length());
          pw += letters.substring(index, index+1);
      }
     
  	  def randomUserValue=params."Text"+pw;
         element.clear() 
          element.sendKeys(randomUserValue)
	  return randomUserValue;
    
}
}