package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Corporate_Form {

	public static WebElement FristName(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div/div"));
		WebElement FName = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[1]/div[1]/div/input"));
		return FName;
		
	}
	
	public static WebElement LastName(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement LName = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[1]/div[2]/div/input"));
		return LName;
	}
	
	public static WebElement Email_contactform(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement EmailCorporateForm = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[1]/div[3]/div/input"));
		return EmailCorporateForm;
	}
	
	public static WebElement contact_Number(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement ContactNumber = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[2]/div[1]/div/div/div/input"));
		return ContactNumber;
	}
	
	public static WebElement GST_Number(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement GST_Number = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[2]/div[2]/div/input"));
		return GST_Number;
	}
	
	public static WebElement Company_Name(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement Company_Name = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[2]/div[3]/div/input"));
		return Company_Name;
	}
	
	public static WebElement Message(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement Message  = Corporate_Request_form.findElement(By.xpath("//*[@id=\"co_message\"]"));
		return Message;
	}
	
	/*
	 * Term's & Condition check box 
	 * 
	 */
	public static WebElement check_box(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement Checkbox_row  = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[4]/label/span"));
		WebElement checkbox_checked = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[4]/label/input"));
		return checkbox_checked;
		
	}
	
	public static WebElement Submit(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement Submit = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[5]/div[2]/input"));
		return Submit;
	}
	
	public static WebElement login_link(WebDriver driver) 
	{
		WebElement Corporate_Request_form = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div[1]/div/div/div[2]/div"));
		WebElement login_link = Corporate_Request_form.findElement(By.xpath("//*[@id=\"signup_form\"]/div[5]/div[1]"));
		return login_link;
	}
	
	
	
}
