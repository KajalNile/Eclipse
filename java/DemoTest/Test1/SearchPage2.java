package DemoTest.Test1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class SearchPage2 
{
	
	WebDriver driver;
	SearchPage2(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver,this);
	}

	// identify web element 
	
	//@FindBy(id="userid")
	//WebElement userid;
	
	//@FindBy(id="signin-continue-btn")
	//WebElement signincontinuebtn;
		
	//@FindBy(id="pass")
	//WebElement Pass;
	
	//@FindBy(id="sgnBt")
	//WebElement sgnBt;
	
	@FindBy(id="gh-ac")
	WebElement text;
	
	@FindBy(id="gh-cat")
	WebElement categoryDropdownElement;
	
	@FindBy(id="gh-btn")
	WebElement clickOnSearchBtn;
	
	@FindBy(xpath="//div[@id='srp-river-results']/ul/li[%d]")
	WebElement getNthResult;
	
	@FindBy(xpath="//div[@id='srp-river-results']/ul/li")
	WebElement getAllProducts;
	
	@FindBy(xpath="window.scrollBy(%d,%d)")
	WebElement scrollBy;
	
	
	//public void enterUserid(String uid)
	//{
	//	userid.sendKeys(uid);
	//}
	
	//public void clickOnSignContinueBtn()
	//{
		//signincontinuebtn.click();
	//}
	
	//public void enterPass(String pass)
	//{
		//Pass.sendKeys(pass);
	//}
	
	//public void clickOnSigninBtn()
	//{
		//sgnBt.click();
	//}

	
	public void entertext(String txt)
	{
		text.sendKeys(txt);
	}
	
	public void categoryDropdownElement(String category)
	{
		categoryDropdownElement.click();
	}
	
	public void clickOnSearchBtn()
	{
		clickOnSearchBtn.click();
		String result = driver.findElement(By.xpath("//h1[contains(text(),'+ results for')]")).getText();
		System.out.println(result);
	}
	
	public void getNthResult(int productNumber)
	{
		getNthResult.click();
	}
	
	
	//public void SearchProduct(String product, String category)
	//{
		//text.sendKeys(product);
		
		//WebElement categoryDropdownElement = driver.findElement(By.id("gh-cat"));
		//Select categorySelect = new Select(categoryDropdownElement);
		//categorySelect.selectByVisibleText(category);
		//driver.findElement(By.id("gh-btn")).click();
		
		//String result = driver.findElement(By.xpath("//h1[contains(text(),'+ results for')]")).getText();
		//System.out.println(result);
	//}
	
	//public void getNthResult(int productNumber)
	//{
		//String xpathExpression = String.format("//div[@id='srp-river-results']/ul/li[%d]",productNumber);
		//String nthProduct = driver.findElement(By.xpath(xpathExpression)).getText();
		//System.out.println(nthProduct);
		
	//}
	
	public void getAllProducts()
	{
        List<WebElement> allProducts =driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
		Iterator<WebElement> iteratorAllProducts = allProducts.iterator();
		
		Actions action = new Actions(driver);
		
		int productLocationX,ProductLocationY;
		while(iteratorAllProducts.hasNext())
		{
			WebElement product = iteratorAllProducts.next();
		    action.moveToElement(product).build().perform();
			productLocationX= product.getLocation().x;
			ProductLocationY= product.getLocation().y;
			scrollBy(productLocationX,ProductLocationY);
			
		    System.out.println(product.getText());
		    System.out.println("------------------------------------------------------");  
		}
		
		
	}
		
	private void scrollBy(int x,int y)
	{
		JavascriptExecutor jsEngine = (JavascriptExecutor) driver;
		String jsCommand = String.format("window.scrollBy(%d,%d)",x,y);
		jsEngine.executeScript(jsCommand);
	}
	
	

}
