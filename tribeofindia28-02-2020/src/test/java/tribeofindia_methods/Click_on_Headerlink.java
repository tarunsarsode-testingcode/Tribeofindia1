package tribeofindia_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tribeofindia_Elements.Cookies;
import tribeofindia_Elements.Home_page;

public class Click_on_Headerlink {

	
	public static void clicklinks() throws NullPointerException
	{
		System.setProperty("webdriver.chrome.driver","/home/tarun/Downloads/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "H:\\Browserdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tribe.c247.website/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement HomePage = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Cookies cook = new Cookies();
		Home_page x = new Home_page();
		if(HomePage.isEnabled()) 
		{
			cook.Cookie_Element(driver).click();	
			System.out.println("cookie popup is Closed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			x.App_logo(driver).click();
			System.out.println("Page is get refreshed");
			
			x.about_us(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("This is About us page");
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			x.shop(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("This is Shop page");
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			x.login(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("This is Login page");
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			x.cart_icon(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("Cart icon has clicked");
			driver.navigate().back();
			
		}
		else
		{
		x.about_us(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("This is About us page");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		x.shop(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("This is Shop page");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		x.login(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("This is Login page");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		x.cart_icon(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Cart icon has clicked");
		driver.navigate().back();
		
		}
	}
	
}
