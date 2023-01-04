package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class nopcommerceHOOKS 
{

	public static WebDriver driver;
@Before  //before and after are used  from cucumber class not testng
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\seleniumsetup\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
}


@After
public void dryrun() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
}

