package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Account_Dashboard {
	
	public static void editprofile(WebDriver driver) 
	{
		WebElement Contact_info = driver.findElement(By.xpath("//*[@id=\"account_dashboard\"]/div/div/section/div[1]"));
		WebElement Edit_Profile = Contact_info.findElement(By.xpath("//*[@id=\"account_details\"]"));	
	}
		
	public static void change_password(WebDriver driver) 
	{
		WebElement Contact_info = driver.findElement(By.xpath("//*[@id=\"account_dashboard\"]/div/div/section/div[1]"));
		WebElement ChangePassword = Contact_info.findElement(By.xpath("//*[@id=\"account_dashboard\"]/div/div/section/div[1]/div[2]/a"));
	}

	public static void Newslater(WebDriver driver) 
	{
		WebElement Newslatersection = driver.findElement(By.xpath("//*[@id=\"account_dashboard\"]/div/div/section/div[2]"));
		WebElement Subscription = Newslatersection.findElement(By.xpath("//*[@id=\"account_dashboard\"]/div/div/section/div[2]/div[1]/p/a"));
	}
		
	public static void ledt_menu(WebDriver driver) 
	{
		WebElement LeftMenu = driver.findElement(By.xpath("//*[@id=\"dashboard\"]"));
		WebElement AccountDashboard = LeftMenu.findElement(By.xpath("//*[@id=\"dashboard\"]/li[1]/a"));
		WebElement Profile_Info = LeftMenu.findElement(By.xpath("//*[@id=\"dashboard\"]/li[2]/a"));
		WebElement My_order = LeftMenu.findElement(By.xpath("///*[@id=\"dashboard\"]/li[3]/a"));
		WebElement Change_Password = LeftMenu.findElement(By.xpath("//*[@id=\"dashboard\"]/li[4]/a"));
		WebElement Newslater = LeftMenu.findElement(By.xpath("//*[@id=\"dashboard\"]/li[5]/a"));
		WebElement Support = LeftMenu.findElement(By.xpath("//*[@id=\"dashboard\"]/li[6]/a"));
		WebElement Logout = LeftMenu.findElement(By.xpath("//*[@id=\"dashboard\"]/li[7]/a"));	
	}
	
	public static void Update_profile(WebDriver driver) {
		
		WebElement profile_Form = driver.findElement(By.xpath("//*[@id=\"address_form\"]/div[1]"));
		WebElement Frist_name  = profile_Form.findElement(By.xpath("//*[@id=\"first_name\"]"));
		WebElement Last_name  = profile_Form.findElement(By.xpath("//*[@id=\"last_name\"]"));
		WebElement User_email  = profile_Form.findElement(By.xpath("//*[@id=\"email\"]"));
		//below id is for phone number  //*[@id="address_form"]/div[1]/div[2]/div[2]/div/div/input
		WebElement Phone_no  = profile_Form.findElement(By.xpath("//*[@id=\"address_form\"]/div[1]/div[2]/div[2]/div/div/input"));
		WebElement country   = profile_Form.findElement(By.xpath("//*[@id=\"country1\"]"));
		WebElement state   = profile_Form.findElement(By.xpath("//*[@id=\"state1\"]"));
		WebElement city   = profile_Form.findElement(By.xpath("//*[@id=\"cityId\"]"));
		WebElement Postal_code   = profile_Form.findElement(By.xpath("//*[@id=\"zip\"]"));
		WebElement GST  = profile_Form.findElement(By.xpath("//*[@id=\"address_form\"]/div[1]/div[5]/div[2]/input"));
		WebElement Update_button  = profile_Form.findElement(By.xpath("//*[@id=\"address_form\"]/div[1]/div[7]/div/input"));
	}
	
	public static void My_Order(WebDriver driver)
	{
		//Currently I don;t have any order 
	}
	
	public static void Update_Password (WebDriver driver)
	{
		WebElement Password_form = driver.findElement(By.xpath("//*[@id=\"account_form\"]/div/div/div"));
		WebElement currentPassword  = Password_form.findElement(By.xpath("//*[@id=\"account_form\"]/div/div/div/div[1]/div/input"));
		WebElement NewPassword  = Password_form.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement ConfirmPassword  = Password_form.findElement(By.xpath("//*[@id=\"account_form\"]/div/div/div/div[3]/div/input"));
		WebElement Update_button  = Password_form.findElement(By.xpath("//*[@id=\"account_form\"]/div/div/div/div[4]/div/input"));
	
	}
	
	public static void Update_Newslater(WebDriver driver)
	{
		WebElement Update_Newslater = driver.findElement(By.xpath("//*[@id=\"newsletter_subscriptions\"]/div/section/div"));
		WebElement Subscribe_button  = Update_Newslater.findElement(By.xpath("//*[@id=\"newsletter_subscriptions\"]/div/section/div/p/a"));
		WebElement Unsubscribe_button  = Update_Newslater.findElement(By.xpath("//*[@id=\"newsletter_subscriptions\"]/div/section/div/p/a"));
	}
	
	
	
	public static void Support(WebDriver driver)
	{
		WebElement Support_Section = driver.findElement(By.xpath("//*[@id=\"support\"]"));
		WebElement Genrate_ticket  = Support_Section.findElement(By.xpath("//*[@id=\"support\"]/div/div/a"));
		
		///Ticket section
		
		WebElement ticket_Action = Support_Section.findElement(By.xpath("//*[@id=\"headingOne\"]/div/span[5]/a"));
		WebElement ticket_Number = Support_Section.findElement(By.xpath("//*[@id=\"btn1\"]"));
		
	}
	
	//*[@id="headingOne"]/div/span[5]/a
	
	
}
