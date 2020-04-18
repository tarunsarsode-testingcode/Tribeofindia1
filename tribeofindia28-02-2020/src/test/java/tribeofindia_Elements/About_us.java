package tribeofindia_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class About_us {
	
	protected String phone_id = "//*[@id=\"contact_form\"]";
	protected WebDriver driver = new ChromeDriver();
	
	public About_us(WebDriver customdriver) {
		driver = customdriver;
	}
	
	public About_us setPhoneId(String id) {
		phone_id = id;
		return this;
	}
	
	public WebElement phone()
	{
		return driver.findElement(By.xpath(phone_id));
	}
	
	public static WebElement email(WebDriver driver) 
	{
		WebElement Aboutus_contact_details = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[1]/ul"));
		WebElement email = Aboutus_contact_details.findElement(By.xpath("//*[@id=\"contact_form\"]/div[1]/ul/li[2]/a"));
		return email;
	}
	
	// BELOW ELEMENT IS USING IN CONTACT FORM 
	
	/**
	 * This function perform the unit testing of the first name element in any form
	 * @param WebElement driver
	 * @return WebElement
	 * @author Tarun Sarsode
	 */
	public static WebElement FristName(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
		WebElement FName = Aboutus_contact_form.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[2]/div/input"));
		return FName;
	}
	
	public static WebElement LastName(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
		WebElement LName = Aboutus_contact_form.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[3]/div/input"));
		return LName;
	}
	
	public static WebElement Email_contactform(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
		WebElement EmailContactForm = Aboutus_contact_form.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[4]/div/input"));
		return EmailContactForm;
	}
	
	public static WebElement contact_Number(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
		WebElement ContactNumber = Aboutus_contact_form.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[5]/div/div/div/input"));
		return ContactNumber;
	}
	
	//THIS IS DROPDOWN FIELD
	
	public static Select Subject(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
	//	WebElement Subject = Aboutus_contact_form.findElement(By.xpath("//*[@id=\\\"contact_form\\\"]/div[2]/div/div[6]/div/select"));
		Select Subject = new Select (Aboutus_contact_form.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[6]/div/select")));
		return Subject;
	}
	
	public static WebElement Message(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
		WebElement Message  = Aboutus_contact_form.findElement(By.xpath("//*[@id=\"co_message\"]"));
		return Message;
	}
	
	public static WebElement Submit(WebDriver driver) 
	{
		WebElement Aboutus_contact_form = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]"));
		WebElement Submit = Aboutus_contact_form.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/button"));
		return Submit;
	}
	
	

}
