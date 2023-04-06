package extentreport;

//import java.lang.module.ModuleDescriptor.Exports;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.netty.util.Timeout;


public class Report
{
	WebDriver driver;

	static ExtentReports report;
	static ExtentTest test;
	
	//@BeforeTest
	public void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		report = new ExtentReports("C:\\Users\\NileK\\eclipse-workspace\\Test1\\src\\test\\java\\extentreport\\report\\report.html",true);
		test = report.startTest("Report");
		//driver.manage().timeouts().implicitlywait(10,TimeUnit.SECONDS);
		System.setProperty("webdriver.crome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\cromedriver.exe");
		driver.get("https://www.ebay.com/");
		
	}
	
	//@AfterTest
	public void teardown()
	{
		driver.close();
		report.endTest(test);
		report.flush();
		
	}
	
	public void Validatetitle()
	{
		test.log(LogStatus.INFO,"Test Cases Validate title is started");
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.PASS, title);
	}
	
	public void EbayNavigate()
	{
		test.log(LogStatus.INFO,"Test Cases EbayNavigate is started");
		driver.findElement(By.linkText("gh-ac")).click();
		driver.findElement(By.linkText("categoryDropdownElement")).click();
		test.log(LogStatus.INFO,"Test Cases EbayNavigate is started");
		driver.findElement(By.linkText("clickOnSearchBtn")).click();
		driver.findElement(By.linkText("getNthResult")).click();
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.PASS, title);
	}
	//C:\Users\NileK\eclipse-workspace\Test1\src\test\java\extentreport\report\report.html
	public void skiptest()
	{
		test.log(LogStatus.SKIP,"Skip Test");
		
	}
	
	public void failtest()
	{
		test.log(LogStatus.INFO,"Fail Test");
		
	}
	

}
