package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_page {

	
	public static void product(WebDriver driver) 
	{
		WebElement product_box = driver.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div[2]/div[1]"));
		WebElement productimage = product_box.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div[2]/div[1]/div/a/div"));
		WebElement productName = product_box.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div[2]/div[1]/div/div/div/h4[1]/a"));
		WebElement productPrice = product_box.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div[2]/div[1]/div/div/div/h4[2]/div"));
		WebElement productcartIcon = product_box.findElement(By.xpath("//*[@id=\"content_page\"]/div/div/div/div[2]/div[1]/div/div/div/form/button"));
		
		
	} 
	
	public static void viewmore (WebDriver driver)
	{
		
		WebElement View_more = driver.findElement(By.xpath("//*[@id=\"view-more\"]"));

	}
	
	
}
