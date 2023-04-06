package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{ 
	WebDriver driver;
	
	LoginPage(WebDriver d)
	{
		driver = d;
	}

	By userid = By.id("userid");
	By signincontinuebtn  = By.id("signin-continue-btn");
	By pass = By.id("pass");
	By sgnBt = By.id("sgnBt");
	
	public void enterUserid(String uid)
	{
		driver.findElement(userid).sendKeys(uid);
	}
	
	public void clickOnSignContinueBtn()
	{
		driver.findElement(signincontinuebtn).click();
	}
		
	public void enterPass(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	
	public void clickOnSigninBtn()
	{
		driver.findElement(sgnBt).click();
	}
	
}
