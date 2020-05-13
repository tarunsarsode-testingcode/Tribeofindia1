package tribeofindia_methods;

import java.util.Scanner;
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
		driver.get("http://tribe.c247.website/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Scanner s = new Scanner(System.in);
		
		if(HomePage.isEnabled()) 
		{
			Cookies.Cookie_Element(driver).click();	
			System.out.println("cookie popup is Closed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Home_page.App_logo(driver).click();
			System.out.println("Page is get refreshed");
			/*
			 * x.App_logo(driver).click();
			 * System.out.println("Page is get refreshed");
			 * Above code is for refresh the home page currently here I will use direct page URL
			*/
			Home_page.corporate_corporate_request(driver).click();
			
			System.out.println("please Enter frist Name");
			String fname = s.nextLine();
			
			Corporate_Form.FristName(driver).sendKeys(fname);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
			System.out.println("please Enter Last Name");
			String lname = s.nextLine();
			
			Corporate_Form.LastName(driver).sendKeys(lname);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("please Enter Email");
			String email = s.nextLine();
			
			Corporate_Form.Email_contactform(driver).sendKeys(email);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("please Enter contactnumber");
			String cNo = s.nextLine();
			
			Corporate_Form.contact_Number(driver).sendKeys(cNo);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("please Enter GSTINnumber");
			String GST = s.nextLine();
			
			Corporate_Form.GST_Number(driver).sendKeys(GST);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("please Enter companyName");
			String companyname = s.nextLine();
			
			Corporate_Form.Company_Name(driver).sendKeys(companyname);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("please Enter Message");
			String message = s.nextLine();
			
			Corporate_Form.Message(driver).sendKeys(message);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			Corporate_Form.Submit(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		
			
			
		}	
			
	}
	
	
}
