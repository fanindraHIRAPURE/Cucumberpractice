package aaapagefactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchcustomerFactory 
{
WebDriver driver;
	public searchcustomerFactory(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (xpath = "//p[text()=' Customers']/ancestor::li")
	WebElement customer1;
	
	@FindBy (xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	WebElement customer2;
	
	@FindBy (id = "SearchEmail")
	WebElement email;
	
	@FindBy (id="search-customers")
	WebElement searchbtn;
	
	@FindBy (xpath = "//table[@id='customers-grid']/tbody/tr")
	List<WebElement> allrow;
	
	@FindBy (xpath = "//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th")
	List<WebElement> allcol;
	
	@FindBy (xpath="//table[@id='customers-grid']/tbody/tr/td[2]")
	WebElement aftersearchbtn;
	
	
	Actions act ;
	public void cust1() throws InterruptedException
	{
		Thread.sleep(3000);
//		act =new Actions(driver);
//	act.moveToElement(customer1).click().build().perform();
		customer1.click();
	
	}
	
	public void cust2() throws InterruptedException
	{
		
		customer2.click();


	
	}
	
	
	public void emailinputs() 
	{
		for(int i=1;i<=allrow.size();i++)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			String emailstore=driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
					email.sendKeys(emailstore);
			
					
					searchbtn.click();
					
					String result=driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr/td[2]")).getText();
					
					if(emailstore.equals(result))
					{
						
						System.out.println(emailstore);
						System.out.println(result);
						System.out.println("test passed");
					}
					else
					{
						System.out.println("test failed");
					}
					
					
					email.clear();
			
			
		}
	}
	
	
}
