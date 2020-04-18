package tribeofindia_methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import tribeofindia_Elements.About_us;
import tribeofindia_Elements.Cookies;
import tribeofindia_Elements.Home_page;

public class Contact_Us {

	public static void contact_us ()
	{
	//	System.setProperty("webdriver.chrome.driver","/home/divyanshi/Documents/Browser driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "H:\\Browserdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tribe.c247.website/corporate//");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Cookies cook = new Cookies();
		Home_page x = new Home_page();
		About_us y = new About_us(driver);
		
		y.setPhoneId("//*[@id=\"contact_form\"]/div[1]/ul/li[1]/a").phone().click();
		
		if(HomePage.isEnabled()) 
		{
			cook.Cookie_Element(driver).click();	
			System.out.println("cookie popup is Closed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			x.App_logo(driver).click();
			System.out.println("Page is get refreshed");
			
			x.about_us(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			y.FristName(driver).sendKeys("testone");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.LastName(driver).sendKeys("testtwo");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.Email_contactform(driver).sendKeys("test21@mailinator.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.contact_Number(driver).sendKeys("1236547890");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//List<WebElement> Subject_dropdown = y.Subject(driver).selectByIndex(2);
			List<WebElement> Subject_dropdown = y.Subject(driver).getOptions();
			int iSize = Subject_dropdown.size();
			System.out.println(iSize);
			
			// Currently Using only passing no. of value but need to implement for pass multiple value 
			// like from console we can pass value by scan class
			
			/*
			*
			*
			*/
			for(int i =0; i<=iSize ; i++)
			{	
				Subject_dropdown.get(2).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			y.Message(driver).sendKeys("Lorem ipsum");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			y.Submit(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			System.out.println("Contact From Submitted");
			
			//driver.close();
		}
		else
		{
			x.about_us(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			y.FristName(driver).sendKeys("test1");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.LastName(driver).sendKeys("test2");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.Email_contactform(driver).sendKeys("test21@mailinator.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.contact_Number(driver).sendKeys("1236547890");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			List<WebElement> Subject_dropdown = y.Subject(driver).getOptions();
			int iSize = Subject_dropdown.size();
			System.out.println(iSize);
			for(int i =0; i<=iSize ; i++)
			{	
				Subject_dropdown.get(2).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
			
		/*	List<WebElement> Subject_dropdown = y.Subject(driver).getAllSelectedOptions();
			int iSize = Subject_dropdown.size();
			System.out.println(iSize);
			for(int i =0; i>iSize ; i++)
			{	
				Subject_dropdown.get(i).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}
			*/
			y.Message(driver).sendKeys("Lorem ipsum");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			y.Submit(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("Contact Form Submitted");
			
	//		driver.close();
			
		}
	}
}
