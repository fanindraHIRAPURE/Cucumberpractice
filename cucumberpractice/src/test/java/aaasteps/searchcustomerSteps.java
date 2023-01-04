package aaasteps;

import org.openqa.selenium.WebDriver;


import aaapagefactory.searchcustomerFactory;
import hooks.nopcommerceHOOKS;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchcustomerSteps
{
	public static WebDriver driver;
	searchcustomerFactory pf;
	@When("user clicks on custmers menu")
	public void user_clicks_on_custmers_menu() throws InterruptedException 
	{
		driver=nopcommerceHOOKS.driver;
		System.out.println("hello ji"+driver);
		pf=new searchcustomerFactory(driver);
	    pf.cust1();

	}

	@When("customers sub menu")
	public void customers_sub_menu() throws InterruptedException 
	{
	    pf.cust2();

	}

	@Then("validate search functionality and customers")
	public void validate_search_functionality_and_customers() 
	{
	    
pf.emailinputs();
	}
}
