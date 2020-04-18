package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {

	WebElement shop =null;
	
	public static WebElement App_logo (WebDriver driver) 
	{
		WebElement headerpopup = driver.findElement(By.xpath("/html/body/div[4]/header/div/div"));
		WebElement header_logo = headerpopup.findElement(By.xpath("/html/body/div[4]/header/div/div/div[1]/div"));
		return header_logo;
	}
	
	public static WebElement shop (WebDriver driver) 
	{
		WebElement header_popup = driver.findElement(By.xpath("/html/body/div[4]/header/div/div"));
		WebElement shop = header_popup.findElement(By.xpath("/html/body/div[4]/header/div/div/div[2]/div/ul/li[1]"));
		return shop;
	}
	
	public static WebElement about_us (WebDriver driver) 
	{
		WebElement header_popup = driver.findElement(By.xpath("/html/body/div[4]/header/div/div"));
		WebElement AboutUs = header_popup.findElement(By.xpath("/html/body/div[4]/header/div/div/div[2]/div/ul/li[2]"));
		return AboutUs;
	}
	
	public static WebElement login (WebDriver driver) 
	{
		WebElement header_popup = driver.findElement(By.xpath("/html/body/div[4]/header/div/div"));
		WebElement LogIn = header_popup.findElement(By.xpath("/html/body/div[4]/header/div/div/div[2]/div/ul/li[3]"));
		return LogIn;	
	}
	
	public static WebElement cart_icon (WebDriver driver) 
	{
		WebElement header_popup = driver.findElement(By.xpath("/html/body/div[4]/header/div/div"));
		WebElement Cart = header_popup.findElement(By.xpath("/html/body/div[6]/header/div/div/div[2]/div/ul/li[4]"));
		return Cart;
	}
	
	
	public static WebElement Explore (WebDriver driver)
	{
		WebElement Explore_popup = driver.findElement(By.xpath("/html/body/main/section[3]/div/div"));
		WebElement Explore_Gond_Art = Explore_popup.findElement(By.xpath("/html/body/main/section[3]/div/div/a"));
		return Explore_Gond_Art;
	}
	
	public static WebElement[] footer_Contact (WebDriver driver)
	{
		WebElement[] footer1 = new WebElement[2];
		WebElement footer = driver.findElement(By.xpath("/html/body/footer/div/div[1]"));
		WebElement contact = footer.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]"));
		WebElement customer_care = contact.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/ul/li[1]"));
		WebElement email1 = contact.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/ul/li[2]"));
		
		footer1[0] = customer_care;
		footer1[1] = email1; 
		
		return footer1; 
	
	}
	
	public static void footer_Information (WebDriver driver)
	{
		WebElement footer = driver.findElement(By.xpath("/html/body/footer/div/div[1]"));
		WebElement Information = footer.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]"));
		WebElement Shipping_Payment = Information.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/ul/li[1]"));
		WebElement termscondition = Information.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/ul/li[2]"));
		WebElement privecy_policy = Information.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/ul/li[3]"));
		WebElement about_us = Information.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/ul/li[4]"));
	}
	
	public static void footer_Corporate (WebDriver driver)
	{
		WebElement footer = driver.findElement(By.xpath("/html/body/footer/div/div[1]"));
		WebElement corporate = footer.findElement(By.xpath("/html/body/footer/div/div[1]/div[3]"));
		WebElement sign = corporate.findElement(By.xpath("/html/body/footer/div/div[1]/div[3]/ul/li[1]"));
		WebElement corporate_request = corporate.findElement(By.xpath("/html/body/footer/div/div[1]/div[3]/ul/li[2]"));
	}
	
	public static void footer_Social(WebDriver driver)
	{
		WebElement footer = driver.findElement(By.xpath("/html/body/footer/div/div[1]"));
		WebElement social = footer.findElement(By.xpath("html/body/footer/div/div[1]/div[4]"));
		WebElement instagram = social.findElement(By.xpath("/html/body/footer/div/div[1]/div[4]/ul/li[1]"));
		WebElement mail = social.findElement(By.xpath("/html/body/footer/div/div[1]/div[4]/ul/li[2]"));
	}
	
	public static void footer_Newslater_Subscription(WebDriver driver)
	{
		WebElement footer = driver.findElement(By.xpath("/html/body/footer/div/div[1]"));
		WebElement Newslater_Subscription = footer.findElement(By.xpath("/html/body/footer/div/div[1]/div[5]"));
		WebElement subscription_form = Newslater_Subscription.findElement(By.xpath("//*[@id=\"newsletter_form\"]/div[2]"));
		WebElement From_field = subscription_form.findElement(By.xpath("//*[@id=\"newsletter_form\"]/div[2]/div/input[2]"));
		WebElement submit = subscription_form.findElement(By.xpath("//*[@id=\"newsletter_form\"]/div[2]/button"));
	}
	
	public static void copywrite (WebDriver driver) 
	{
		WebElement copyright = driver.findElement(By.xpath("/html/body/footer/div/div[2]"));
		WebElement chapter_logo = copyright.findElement(By.xpath("/html/body/footer/div/div[2]/p/span/a")); 
	}
	
}
