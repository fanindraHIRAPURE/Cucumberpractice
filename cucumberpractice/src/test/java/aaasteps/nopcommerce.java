package aaasteps;

import java.time.Duration;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import aaapagefactory.nopcommercefactory;
import hooks.nopcommerceHOOKS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class nopcommerce
{
	 WebDriver driver;
	 nopcommercefactory pf;
	
	@Given("user launches browser")
	public void user_launches_browser() 
	{
	    System.out.println("user launces browser ji ha");
	   driver = nopcommerceHOOKS.driver;
	   System.out.println(nopcommerceHOOKS.driver);
	   pf=new nopcommercefactory(driver);

	}

	@When("user enters url {string}")
	public void user_enters_url(String string) {
	    
		System.out.println("user enters url");
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String string, String string2) {
	    
pf.email(string);
pf.pass(string2);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException 
	{
	    pf.loginb();
	    Thread.sleep(3000);
	    

	}

	@Then("verify title of page as {string}")
	public void verify_title_of_page_as(String string) throws InterruptedException {
		   Thread.sleep(3000);
		String title="Dashboard / nopCommerce administration";
	    Assert.assertEquals(string, title);

	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() throws InterruptedException {
		   Thread.sleep(3000);
	    
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   pf.logoutt();
	}

	@Then("verify title of page as follows {string}")
	public void verify_title_of_page_as_follows(String string) {
	    
String title="Your store. Login";
Assert.assertEquals(string, title);
	}
}
