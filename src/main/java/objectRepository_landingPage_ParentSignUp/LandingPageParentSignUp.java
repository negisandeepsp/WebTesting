package objectRepository_landingPage_ParentSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Parent SignUp from Landing Page

public class LandingPageParentSignUp
{

	public WebDriver driver;
	By parentsGetStartedForFreeButton = By.linkText("Parents, Get Started for Free");
	By signUpForFreeButton = By.id("signup-button");
	By userEmailField = By.id("user_email");
	By userPassword = By.id("user_password");
	By userPhoneNumber = By.id("user_phone");
	
	public LandingPageParentSignUp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public WebElement parentsGetStartedForFreeButton()
	{
		return driver.findElement(parentsGetStartedForFreeButton);
	}
	
	public WebElement enterParentEmail()
	{
		return driver.findElement(userEmailField);
	}
	
	public WebElement enterParentPassword()
	{
		return driver.findElement(userPassword);
	}
	
	public WebElement parentPhoneNumber()
	{
		return driver.findElement(userPhoneNumber);
	}
	public WebElement signUpButton()
	{
		return driver.findElement(signUpForFreeButton);
	}
}
