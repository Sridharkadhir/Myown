package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

class AutoITUploadFiles{
    public void run(def params)
    {
        Runtime.getRuntime().exec(params.Path);
        
        // Path should be of the .exe file that you want to upload ( through which the targetted file will get uploaded )
    }
}


