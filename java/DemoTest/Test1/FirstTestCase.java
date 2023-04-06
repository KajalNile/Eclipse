package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
  //TestCase-1 (URL Launch)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.crome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\cromedriver.exe");
        driver.navigate().to("https://signin.ebay.com/");
        
        String title = driver.getTitle() ;
        System.out.println("Page Title: " + title);
        
        Thread.sleep(3000);
        System.out.println("URL : " + driver.getCurrentUrl());
        
        
  //TestCase-2(Login)
        
                
       // driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"personalaccount-radio\"]")).click();
      //*[@id="userid"]
      //*[@id="signin-form"]/div[1]/div/div/label
        
        driver.findElement(By.id("userid")).sendKeys("kajalnile00@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        driver.findElement(By.id("pass")).sendKeys("Kajal@123");
        driver.findElement(By.xpath("sgnBt")).click();
        
       // driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();
        
        //Thread.sleep(3000);
        
       //driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]")).click();
 
       // driver.findElement(By.linkText("Leave")).click();
      
  //TestCase-3(Search product)
        
        driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")).sendKeys("cell phones and Accessories");
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
        
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
           
  //TestCase-4(Search 1st Product Info)
        
        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[2]/div/div[2]/a")).click();
        driver.findElement(By.xpath("\"//*[@id=\\\"gh-btn\\\"]\")).click();")).click();
        
        driver.findElement(By.xpath("//*[@id=\"x-msku__select-box-1000\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"x-msku__select-box-1001\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).click();
         
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a/svg/use")).click();
        
        driver.findElement(By.xpath("//*[@id=\"x-msku__option-box-6\"]")).click();
      
       
        

        
	}
	
}