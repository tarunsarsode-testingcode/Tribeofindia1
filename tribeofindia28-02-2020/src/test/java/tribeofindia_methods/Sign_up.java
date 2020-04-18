package tribeofindia_methods;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tribeofindia_Elements.Cookies;
import tribeofindia_Elements.Home_page;
import tribeofindia_Elements.Login_page;
import tribeofindia_Elements.Signup_page;

public class Sign_up {

	public void Signup () 
	{
		//System.setProperty("webdriver.chrome.driver","/home/divyanshi/Documents/Browser driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "H:\\Browserdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tribe.c247.website/corporate//");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		Cookies cook = new Cookies();
		Home_page x = new Home_page();
		Signup_page y = new Signup_page();
		Login_page z = new Login_page();
		
		Scanner s = new Scanner(System.in);

		if(HomePage.isEnabled()) 
		{
			cook.Cookie_Element(driver).click();	
			System.out.println("cookie popup is Closed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			x.App_logo(driver).click();
			System.out.println("Page is get refreshed");
			
			
			// Go To login page 
			x.login(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			z.Register(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			// take values from user
		
			System.out.println("please Enter Frist name ");
			String fristname = s.nextLine();
			
			System.out.println("please Enter Last name ");
			String lastname = s.nextLine();
			
			System.out.println("please Enter Email ");
			String email = s.nextLine();
			
			System.out.println("please Enter Password ");
			String password = s.nextLine();
			
			System.out.println("please Enter Confirm Password  ");
			String confirm_password = s.nextLine();
			
			// Send value to Sign up form 
			
			y.Frist_Name(driver).sendKeys(fristname);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			y.Last_Name(driver).sendKeys(lastname);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			y.email(driver).sendKeys(email);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			y.password(driver).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
		//	y.password(driver).sendKeys(Keys.TAB);
		//	y.confirm_password(driver).click();
		//	y.confirm_password(driver).clear();
			
		//	JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript(confirm_password, y.confirm_password(driver));
			
			
			y.confirm_password(driver).sendKeys(confirm_password);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			//click on Checkbox
			
			//Do you want to Accept subscription check box 
			System.out.println("Do you want to check checkbox for Subscription, Enter 'Yes' or 'No' ");
			String confirmation = s.nextLine();
			
			
			///Currently check box is checked hardcoded but will implement 
			//using switch & give two option Yes or no itf press yes than only checkbox check ed  
			
			//if (confirmation.contentEquals("Yes") {}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			if(confirmation.equals("Yes"))
			{
				y.checkbox_Notification(driver).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				y.Register_button(driver).click();
			}
			else
			{
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				y.Register_button(driver).click();
			}
			
		}
		else 
		{
			
			// Go To login page 
				x.login(driver).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				z.Register(driver).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
				// take values from user
					
				String fristname = s.nextLine();
				String lastname = s.nextLine();
				String email = s.nextLine();
				String password = s.nextLine();
				String confirm_password = s.nextLine();
						
				// Send value to Sign up form 
						
				y.Frist_Name(driver).sendKeys(fristname);
				y.Last_Name(driver).sendKeys(lastname);
				y.email(driver).sendKeys(email);
				y.password(driver).sendKeys(password);
				y.confirm_password(driver).sendKeys(confirm_password);
						
						
				//click on Checkbox
						
				//Do you want to Accept subscription check box 
				System.out.println("Do you want to check checkbox for Subscription, Enter 'Yes' or 'No' ");
				String confirmation = s.nextLine();
						
						
				///Currently check box is checked hardcoded but will implement 
				//using switch & give two option Yes or no itf press yes than only checkbox check ed  
						
				//if (confirmation.contentEquals("Yes") {}
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
				
				if(confirmation.equals("Yes"))
				{
					y.checkbox_Notification(driver).click();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					y.Register_button(driver).click();
				}
				else
				{
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					y.Register_button(driver).click();
				}
		}
		
	}
	
	
}
