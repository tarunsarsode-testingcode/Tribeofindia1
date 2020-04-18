package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup_page {
	
	public  static WebElement Frist_Name (WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement FristName = Signup_form.findElement(By.xpath("//*[@id=\"first_name\"]"));
		return FristName;
	}
	
	public  WebElement Last_Name (WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement LastName = Signup_form.findElement(By.xpath("//*[@id=\"last_name\"]"));
		return LastName;
	}
	
	public static WebElement email (WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement email = Signup_form.findElement(By.xpath("//*[@id=\"email\"]"));
		return email;
	}
	
	public static WebElement password (WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[@id=\"password\"]"));
	}
	
	public static WebElement confirm_password (WebDriver driver) 
	{

		return driver.findElement(By.xpath("/html/body/main/div/div/div/form/div[5]/input"));
	}
	
	public static WebElement checkbox_Notification (WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement checkboxNotification = Signup_form.findElement(By.xpath("/html/body/main/div/div/div/form/div[6]/div/label/span"));
		return checkboxNotification;
	}
	
	public static WebElement checkbox_Accept_TandC (WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement checkboxAccept = Signup_form.findElement(By.xpath("/html/body/main/div/div/div/form/div[7]/div/label/span"));
		return checkboxAccept;
	}
	
	public static WebElement Back_To_Login(WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement back_To_login = Signup_form.findElement(By.xpath("//*[@id=\"form_valid\"]/div[8]/div[1]"));
		return back_To_login;
	}
	
	public static WebElement Register_button (WebDriver driver) 
	{
		WebElement Signup_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div"));
		WebElement Register = Signup_form.findElement(By.xpath("/html/body/main/div/div/div/form/div[8]/div[2]/button"));
		return Register;
	}
	
}
