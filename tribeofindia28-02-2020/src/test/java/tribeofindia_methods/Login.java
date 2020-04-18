package tribeofindia_methods;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tribeofindia_Elements.About_us;
import tribeofindia_Elements.Cookies;
import tribeofindia_Elements.Home_page;
import tribeofindia_Elements.Login_page;

public class Login {
	
	public void login() {	

	//	System.setProperty("webdriver.chrome.driver","/home/divyanshi/Documents/Browser driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "H:\\Browserdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tribe.c247.website/corporate//");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		Cookies cook = new Cookies();
		Home_page x = new Home_page();
		Login_page y = new Login_page();
		
		Scanner s = new Scanner(System.in);

		if(HomePage.isEnabled()) 
		{
			cook.Cookie_Element(driver).click();	
			System.out.println("cookie popup is Closed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			x.App_logo(driver).click();
			System.out.println("Page is get refreshed");
			
			
			
			x.login(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("Please Enter your Email");
			String email = s.nextLine();
			
			System.out.println("Please Enter your Password");
			String password = s.nextLine();
			
			y.Email(driver).sendKeys(email);
			y.Password(driver).sendKeys(password);
			y.Login_Submit(driver).click();
		}
		else 
		{
			x.login(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			System.out.println("Please Enter your Email");
			String email = s.nextLine();
			
			System.out.println("Please Enter your Password");
			String password = s.nextLine();
			
			y.Email(driver).sendKeys(email);
			y.Password(driver).sendKeys(password);
			y.Login_Submit(driver).click();
		}
		
}
}