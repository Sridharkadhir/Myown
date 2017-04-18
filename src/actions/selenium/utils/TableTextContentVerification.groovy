package actions.selenium;

import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import java.io.IOException; 
import java.util.List;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.ie.InternetExplorerDriverService
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities


class TableContentTextVerification
{
    public String Auditname;
    
    public  run(def params){
        
        WebElement Table = Elements.find(params,Browser.Driver)
            
        List<WebElement> allRows = Browser.Driver.findElements(By.xpath(params.RowsXpath))
        List<WebElement> allpages = Browser.Driver.findElements(By.xpath(params.PaginationXpath))
        List<WebElement> allColumn = Browser.Driver.findElements(By.xpath(params.ColumnXpath))
        
        for(int i=0; i<=(allpages.size()); i++)
        {
            for(int row=1; row<=allRows.size(); row++)
                {
                   Auditname = Browser.Driver.findElement(By.xpath(params.AuditNameColumnXpath)).getText()
                    //System.out.println(name);
                    
                    if(Auditname.equals(params.AuditNameText))
                        {
                        
                      assert Auditname.equals(params.AuditNameText), "Error expected text: ${params.AuditNameText} does not match text on the UI: ${Auditname}"
                           	
                        }
                    else
                    {
                        System.out.println(" Text doesn't exist");
                    }
                    
                }

           // allpages = driver.findElements(By.xpath("//div[@id='page-navigation']//a"));
           // allpages = driver.findElements(By.xpath("//div[@id='page-navigation']//a"));
           // driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
           // allpages.get(i).click();
        }
            
         return Auditname;
    }
    //String Auditname = Browser.Driver.findElement(By.xpath(params.AuditNameColumnXpath)).getText();
   
}