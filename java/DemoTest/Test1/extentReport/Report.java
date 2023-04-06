package DemoTest.Test1.extentReport;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Report 
{
	WebDriver driver;

	static ExtentReports report;
	static ExtentTest test;
	
  @Test
  public void f() 
  {
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		report = new ExtentReports("C:\\Users\\NileK\\eclipse-workspace\\Test1\\report\\report.html",true);
		test = report.startTest("Report");
  
		//driver.manage().timeouts().implicitlywait(10,TimeUnit.SECONDS);
		System.setProperty("webdriver.crome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\cromedriver.exe");
		driver.get("https://www.ebay.com/");
		
		if(driver.getTitle().equals("Ebay"))
		{
			test.log(LogStatus.PASS, "Navigated to the Specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL,"Fail Test");
		}
  }

   public void Validatetitle()
	{
		test.log(LogStatus.INFO,"Test Cases Validate title is started");
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.PASS, title);
	}
	
	public void UrlNavigate()
	{
		test.log(LogStatus.INFO,"Test Cases EbayNavigate is started");
		driver.findElement(By.linkText("text")).click();
		
		driver.findElement(By.linkText("categoryDropdownElement")).click();
		test.log(LogStatus.INFO,"Test Cases EbayNavigate is started");
		
		driver.findElement(By.linkText("clickOnSearchBtn")).click();
		driver.findElement(By.linkText("getNthResult")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.PASS, title);
	}
	
	public void skiptest()
	{
		test.log(LogStatus.SKIP,"Skip Test");
		
	}
	
	public void failtest()
	{
		test.log(LogStatus.FAIL,"Fail Test");
		
	}
	//@AfterTest
	  //public void afterTest()
	  //{
		//  driver.close();
			//report.endTest(test);
			//report.flush();
			
	//  }
	

}



