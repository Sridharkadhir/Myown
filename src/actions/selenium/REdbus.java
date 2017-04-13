package actions.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

import java.util.*;

class REdbus{
    public static WebDriver driver;
public static String url;
    public void run(HashMap<String, Object> params) throws Exception 
    
    {
        
        




	
	char[] ch = {'s','r','i','d','h','a','r'};
	
	System.out.println(ch.length);
	
	System.out.println(ch);
	
	System.out.println(ch[0]);
	
	
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		url = "http://www.redbus.in/";
		driver.get(url);
		Thread.sleep(10000);
		
		//To enter the Source place in the soucre field ------- Hardcoded
		WebElement Source = driver.findElement(By.xpath("//*[@id='src']"));
		Source.sendKeys("Salem");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		
		//To enter the Destination place in the Destination field ------- Hardcoded
		WebElement Destination = driver.findElement(By.xpath("//*[@id='dest']"));
		Destination.sendKeys("Chennai");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul/li")).click();
		Thread.sleep(3000);
		
	
		//To select the todays date ( This will work always -- not hardcoded )		
		String ClassValue = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody//tr[6]//td[3]")).getAttribute("class");
		System.out.println(ClassValue );		
		
		
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr"));
		List<WebElement> Columns = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr[2]/th"));
		
		int Row_count = Rows.size();	
		System.out.println(Row_count);
		System.out.println(Columns.size());
	
		for(int i=3;i<=Rows.size()-1;i++)
		{
		System.out.println("In row No : " +i);
		
			for(int j=1;j<=Columns.size();j++)
			{
				System.out.println("In Column No : " +j);
				
				WebElement CurrenDate = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr["+i+"]/td["+j+"]"));
				String ClassAttribute = CurrenDate.getAttribute("class");
				System.out.println(ClassAttribute );
					
				if(ClassAttribute.equalsIgnoreCase("current day"))
				{
					System.out.println("Inside IF Condition " );
					Thread.sleep(5000);
								
					WebElement currentDay = (new WebDriverWait(driver,10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']//td[@class='current day']"))) ;
					currentDay.click();	
					break;
			}
			else
			{
				System.out.println("For loop Continues");
			}		
			}
		}
		//Return calendar ---return ticket selecting
		List<WebElement>	RedBusInputTags = driver.findElements(By.tagName("input"));	
		System.out.println(RedBusInputTags.size());		
		Actions Onward_Calendar = new Actions(driver);
		System.out.println("AfterDriver" );
		Actions CalendarBox = Onward_Calendar.moveToElement(RedBusInputTags.get(3)).click();	
		CalendarBox.build().perform();
		System.out.println("Calendar is visible" );
		Thread.sleep(10000);
			
			List<WebElement> ReturnRows = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr"));
			List<WebElement> ReturnColumns = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody/tr[2]/th"));
			int ReturnRow_count = ReturnRows.size();	
			System.out.println(ReturnRow_count);
			System.out.println(ReturnColumns.size());
					
			for(int i=3;i<=Rows.size()-1;i++)
			{
				System.out.println("In row No : " +i);
				for(int j=1;j<=Columns.size();j++)
				{
				System.out.println("In Column No : " +j);
				
				WebElement CurrenDate = driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table[@class='rb-monthTable first last']/tbody/tr["+i+"]/td["+j+"]"));
				String ClassAttribute = CurrenDate.getAttribute("class");
				System.out.println(ClassAttribute );
					
				if(ClassAttribute.equalsIgnoreCase("current day"))
				{
					System.out.println("Inside IF Condition " );
					Thread.sleep(5000);	
					
					 WebElement currentDay = (new WebDriverWait(driver,10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rb-calendar_return_cal']/table[@class='rb-monthTable first last']//td[@class='current day']"))) ;
					 String TextDay = currentDay.getText();
					 
					 int Date = Integer.parseInt(TextDay);	 
					 int Return_date = Date+1;
					 System.out.println(Return_date );
					 
					 WebElement ReturnDate_text = driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table[@class='rb-monthTable first last']/tbody/tr["+i+"]/td["+(j+1)+"]"));
					 String ReturnDateNumber = ReturnDate_text.getText();
					 System.out.println(ReturnDateNumber );
						
					 int NewReturnDateNumber = Integer.parseInt(ReturnDateNumber);	
					 System.out.println(NewReturnDateNumber );
				
					 if(NewReturnDateNumber == Return_date)
					 {
					ReturnDate_text.click();
					break;
					}
				}	
					else
					{
						System.out.println("For loop Continues");
					}
	
					}
				}

			WebElement SearchButton = driver.findElement(By.xpath("//button[@id='search_btn']"));
			SearchButton.click();
			
			Thread.sleep(5000);
			driver.navigate().to("https://www.linkedin.com/");
			
			//WebElement EmailField = driver.findElement(By.id("login-email"));
			
			WebDriverWait WaitForLogin = new WebDriverWait(driver,10);
			WebElement EmailField = WaitForLogin.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-email")));
			WebElement PasswordField = driver.findElement(By.id("login-password"));
			WebElement SignIn = driver.findElement(By.id("login-submit"));
			
			String EmailID = "sridharkadhir@gmail.com";
			String Password = "Isha@b4u";
			
			EmailField.sendKeys(EmailID);
			PasswordField.sendKeys(Password);
			SignIn.click();
			
			String PageURL = driver.getCurrentUrl();
			
			Assert.assertEquals("https://www.linkedin.com/feed/",PageURL);
			
			
			
	
     }
}

