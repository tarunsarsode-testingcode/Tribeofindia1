package tribeofindia_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tribeofindia_Elements.Cookies;
import tribeofindia_Elements.Corporate_Form;
import tribeofindia_Elements.Home_page;

public class Send_Corporate_request {

	public static void corporate_request () 
	{
	//	System.setProperty("webdriver.chrome.driver","/home/tarun/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.driver", "H:\\Browserdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tribe.c247.website/corporate");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Cookies cook = new Cookies();
		Corporate_Form x = new Corporate_Form();
		if(HomePage.isEnabled()) 
		{
			cook.Cookie_Element(driver).click();	
			System.out.println("cookie popup is Closed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			/*
			 * x.App_logo(driver).click();
			 * System.out.println("Page is get refreshed");
			 * Above code is for refresh the home page currently here I will use direct page URL
			*/
			
			x.FristName(driver).sendKeys("Test");
			
			
			
		}	
			
	}
	
	
}
