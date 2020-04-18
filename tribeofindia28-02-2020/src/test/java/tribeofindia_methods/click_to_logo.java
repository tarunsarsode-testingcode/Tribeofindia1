package tribeofindia_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tribeofindia_Elements.Cookies;
import tribeofindia_Elements.Home_page;

public class click_to_logo {

public static void click_to_logo() throws InterruptedException {
	
//	System.setProperty("webdriver.chrome.driver","/home/tarun/Downloads/chromedriver");
	System.setProperty("webdriver.chrome.driver", "H:\\Browserdriver\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://tribeofindia.com/");
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
	}
	else
	{	
		x.App_logo(driver).click();
		System.out.println("cookie is Not founded");
	}
	
	
	
	// for my ref 
	//int footer = Home_page.footer_Contact(driver).length;
}
	
}

