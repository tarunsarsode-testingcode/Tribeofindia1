package tribeofindia_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookies {

	public static WebElement Cookie_Element (WebDriver driver)
	{
		WebElement Cookie_popup_Homepae = driver.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]"));
		WebElement Accept_close = Cookie_popup_Homepae.findElement(By.xpath("//*[@id=\"pjAcceptCookieBar\"]/div/form/h3[2]/div/button"));
		return Accept_close;
	}
	
}
