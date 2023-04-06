package DemoTest.Test1;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 
{   
	WebDriver driver;
	LoginPage2(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver,this);
	}

	// identify web element 
	
	
	@FindBy(id="userid")
	WebElement userid;
	
	@FindBy(id="signin-continue-btn")
	WebElement signincontinuebtn;
		
	@FindBy(id="pass")
	WebElement Pass;
	
	@FindBy(id="sgnBt")
	WebElement sgnBt;

	
	public void enterUserid(String uid)
	{
		userid.sendKeys(uid);
	}
	
	public void clickOnSignContinueBtn()
	{
		signincontinuebtn.click();
	}
	
	public void enterPass(String pass)
	{
		Pass.sendKeys(pass);
	}
	
	public void clickOnSigninBtn()
	{
		sgnBt.click();
	}
	
	
}


