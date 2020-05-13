package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPassword_page {

	public static WebElement email(WebDriver driver) 
	{
		WebElement ForgetPass_form = driver.findElement(By.xpath("//*[@id=\"form_valid\"]"));
		WebElement email = ForgetPass_form.findElement(By.xpath("/html/body/main/div/div/div/div/form/div[1]/input"));
		return email;
	}
	
	public static WebElement Back_To_Login(WebDriver driver) 
	{
		WebElement ForgetPass_form = driver.findElement(By.xpath("//*[@id=\"form_valid\"]"));
		WebElement back_To_login = ForgetPass_form.findElement(By.xpath("/html/body/main/div/div/div/div/form/div[2]/a"));
		return back_To_login;
	}
	
	
	public static WebElement Submit(WebDriver driver) 
	{
		WebElement ForgetPass_form = driver.findElement(By.xpath("//*[@id=\"form_valid\"]"));
		WebElement Submit = ForgetPass_form.findElement(By.xpath("/html/body/main/div/div/div/div/form/div[2]/button"));
		return Submit;
	}
	
}
