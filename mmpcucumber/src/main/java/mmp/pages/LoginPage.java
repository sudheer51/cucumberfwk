package mmp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;             //null
	
	public LoginPage(WebDriver driver1)
	{
		driver=driver1;
	}
	
	public void login(String uname,String pword)
	{
		
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.name("submit")).click();
		 
		
	}
	public String fetchloginSuccessfulText()
	{
		String actual = driver.findElement(By.xpath("//h3[normalize-space()='Patient Portal']")).getText();
		return actual;
	}
	public String handleAlert()
	{
		Alert alrt = driver.switchTo().alert();
		String alertmessage = alrt.getText();
		alrt.dismiss();
		return alertmessage;
	}
	 
	
}
