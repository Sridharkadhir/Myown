package actions.selenium;

import actions.selenium.Browser;
import org.openqa.selenium.JavascriptExecutor;


class PageScrollDown{
    public void run(def params){
        
        
        JavascriptExecutor js = (JavascriptExecutor)Browser.Driver;
		js.executeScript("window.scrollBy(0,"+params.Value+")", "");
        
    }
}