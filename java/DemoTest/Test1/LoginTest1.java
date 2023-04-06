package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

// create object of LoginPage	
		
		LoginPage2 LoginPg = new LoginPage2(driver);
	
		System.setProperty("webdriver.crome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\cromedriver.exe");
        driver.navigate().to("https://signin.ebay.com/");
        
        LoginPg.enterUserid("kajalnile00@gmail.com");
        LoginPg.clickOnSignContinueBtn();
        LoginPg.enterPass("Kajal@123");
        LoginPg.clickOnSigninBtn();
        
        String title = driver.getTitle() ;
        System.out.println("Page Title: " + title);
        System.out.println("URL : " + driver.getCurrentUrl());
 
	}

}
