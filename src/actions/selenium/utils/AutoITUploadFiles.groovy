package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


class AutoITUploadFiles{
    public void run(def params){
        Runtime.getRuntime().exec(params."Path");
    }
}


