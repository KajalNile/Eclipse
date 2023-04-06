package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SerachPage 
{  
		WebDriver driver;
		
		SerachPage(WebDriver d)
		{
			driver = d;
		}

		By text = By.id("text");
		By searchbutton  = By.id("Search");
		//By pass = By.id("pass");
		//By sgnBt = By.id("sgnBt");
		
		public void entertext(String txt)
		{
			driver.findElement(text).sendKeys(txt);
		}
		
		public void clickOnSearchBtn()
		{
			driver.findElement(searchbutton).click();
		}
			
		
		
}


