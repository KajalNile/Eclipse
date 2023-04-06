package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
// create object of SearchPage	
		
		SearchPage2 Searchpg = new SearchPage2(driver);
	
		System.setProperty("webdriver.crome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\cromedriver.exe");
        driver.navigate().to("https://www.ebay.com/");
        
        //Searchpg.enterUserid("kajalnile00@gmail.com");
        //Searchpg.clickOnSignContinueBtn();
        //Searchpg.enterPass("Kajal@123");
        //Searchpg.clickOnSigninBtn();
        
        Searchpg.entertext("iphone");
        Searchpg.categoryDropdownElement("cell phones and Accessories");
        Searchpg.clickOnSearchBtn();
        Searchpg.getNthResult(5);
        Searchpg.getAllProducts();
		
        String title = driver.getTitle() ;
        System.out.println("Page Title: " + title);
        System.out.println("URL : " + driver.getCurrentUrl());
 
	}

	

	

}
