package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPassword_page {

	public static void email(WebDriver driver) 
	{
		WebElement ForgetPass_form = driver.findElement(By.xpath("//*[@id=\"form_valid\"]"));
		WebElement email = ForgetPass_form.findElement(By.xpath("//*[@id=\"fp_email\"]"));
		
	}
	
	public static void Back_To_Login(WebDriver driver) 
	{
		WebElement ForgetPass_form = driver.findElement(By.xpath("//*[@id=\"form_valid\"]"));
		WebElement back_To_login = ForgetPass_form.findElement(By.xpath("//*[@id=\"form_valid\"]/div[2]/a"));
		
	}
	
	
	public static void Submit(WebDriver driver) 
	{
		WebElement ForgetPass_form = driver.findElement(By.xpath("//*[@id=\"form_valid\"]"));
		WebElement Submit = ForgetPass_form.findElement(By.xpath("//*[@id=\"form_valid\"]/div[2]/button"));
		
	}
	
}
