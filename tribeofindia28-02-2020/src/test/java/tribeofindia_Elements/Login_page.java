package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {

	public static WebElement Email (WebDriver driver) 
	{
		WebElement email = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div/form/div[1]/input"));
		return email;
	}
	
	public static WebElement Password (WebDriver driver) 
	{
		WebElement password = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div/form/div[2]/input"));
		return password;
	}
	
	public static  WebElement Login_Submit (WebDriver driver) 
	{
		WebElement Submit_button = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div/form/div[3]/button"));
		 return Submit_button;
	}
	
	public static WebElement Forget_password (WebDriver driver) 
	{
		WebElement forget_pwd = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div/form/div[3]/div/a[1]"));
		return forget_pwd;
	}
	
	public static WebElement Register (WebDriver driver) 
	{
		WebElement New_register = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div/form/div[3]/div/a[2]"));
		return New_register;
	}
	
	
	
}
