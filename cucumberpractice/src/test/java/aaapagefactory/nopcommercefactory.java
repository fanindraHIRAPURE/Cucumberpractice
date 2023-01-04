package aaapagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nopcommercefactory
{
	WebDriver driver;
	
	
	
public nopcommercefactory(WebDriver d)
{
	driver=d;
	PageFactory.initElements(driver, this);
}


@FindBy (id = "Email")
WebElement email;

@FindBy (id="Password")
WebElement pass;

@FindBy (xpath = "//button[@type='submit']")
WebElement login;

@FindBy (linkText = "Logout")
WebElement logout;




public void email(String email1)
{
	email.clear();
	email.sendKeys(email1);
}

public void pass(String pass1)
{
	pass.clear();
	pass.sendKeys(pass1);
}


public void loginb()
{
	login.click();;
}

public void logoutt()
{
	logout.clear();
}

}
