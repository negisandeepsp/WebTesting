package landingPage_ParentSignUpTestCases;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepository_landingPage_ParentSignUp.LandingPageParentSignUp;
import takingScreenshots.TakingScreenshot;
import webCommonFile.Basic;

public class TestCasesParentSignUp extends Basic
{
	LandingPageParentSignUp user;
	TakingScreenshot img;
	
	@Test
	public void enterBlankEmailOnly() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("   ");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterBlankEmailOnly");
		
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Can't be blank", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterBlankPasswordOnly() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+sndp01@splashmath.com");
		user.enterParentPassword().sendKeys(" ");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterBlankPasswordOnly");
		
		String pswdErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[2]/span[2]")).getText();
		
		Assert.assertEquals("Can't be blank", pswdErrormsg);
		System.out.println("Error message = " + pswdErrormsg);
	}
	
	
	@Test
	public void enterBlankEmailAndPassword() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys(" ");
		user.enterParentPassword().sendKeys(" ");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterBlankEmailAndPassword");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		String pswdErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[2]/span[2]")).getText();
		
		Assert.assertEquals("Can't be blank", emailErrormsg);
		
		System.out.println("Error message = " + emailErrormsg);
		System.out.println("Error message = " + pswdErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeOne() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+sndpsandeep");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeOne");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeTwo() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+sndp@sandeep");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeTwo");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeThree() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+01@sndp@sandeep");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeThree");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeFour() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn!@#$!@$$@#$@#$");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeFour");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeFive() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("@sandeep.com");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeFive");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeSix() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys(".sn@sandeep.com");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeSix");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeSeven() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn.@sandeep.com");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeSeven");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeEight() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn..@sandeep.com");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeEight");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeNine() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+sndp01@splashmath.com(sandeep.negi)");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeNine");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeTen() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn@splashmath");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeTen");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterInvalidUserEmailTypeEleven() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+sndp01@splashmath..com");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterInvalidUserEmailTypeEleven");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Email is invalid", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterSpaceInUserEmailAndPassword() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("    ");
		user.enterParentPassword().sendKeys("   ");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterSpaceInUserEmailAndPassword");
		
		String emailErrormsg = driver.findElement(By.xpath("//form[@id='new_user']/fieldset/div[1]/span")).getText();
		
		Assert.assertEquals("Can't be blank", emailErrormsg);
		System.out.println("Error message = " + emailErrormsg);
	}
	
	@Test
	public void enterValidEmailAndPasswordTypeOne_smallLetters() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
		String dateAsString = simpleDateFormat.format(new Date());
		
		String parentEmail= "sn+" + dateAsString + "@splashmath.com";
		user.enterParentEmail().sendKeys(parentEmail);
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterValidEmailAndPasswordTypeOne_smallLetters");

		WebDriverWait addChildPage= new WebDriverWait(driver,2000);
		addChildPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button rounded-button-light-orange long full']")));
		
		String AddChildPageHeading= driver.findElement(By.xpath("//div[@class='sp-parent-signup-wizard without-steps']/h1")).getText();
		Assert.assertEquals(AddChildPageHeading, "Share Your Child's Details");
		System.out.println("User On Add child page");
		
	
	}
	
	@Test
	public void enterValidEmailAndPasswordTypeOne_capitalLetters() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
		String dateAsString = simpleDateFormat.format(new Date());
		
		String parentEmail= "SANDEEP+" + dateAsString + "@SPLASHMATH.COM";
		user.enterParentEmail().sendKeys(parentEmail);
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterValidEmailAndPasswordTypeOne_capitalLetters");
		
		WebDriverWait addChildPage= new WebDriverWait(driver,2000);
		addChildPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button rounded-button-light-orange long full']")));
		
		String AddChildPageHeading= driver.findElement(By.xpath("//div[@class='sp-parent-signup-wizard without-steps']/h1")).getText();
		Assert.assertEquals(AddChildPageHeading, "Share Your Child's Details");
		System.out.println("User On Add child page");
		
	
	}
	
	@Test
	public void onlyDigitsinAddressInEmail() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
		String dateAsString = simpleDateFormat.format(new Date());
		
		String parentEmail= "123456+" + dateAsString + "@splashmath.com";
		user.enterParentEmail().sendKeys(parentEmail);
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "onlyDigitsinAddressInEmail");

		WebDriverWait addChildPage= new WebDriverWait(driver,2000);
		addChildPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button rounded-button-light-orange long full']")));
		
		String AddChildPageHeading= driver.findElement(By.xpath("//div[@class='sp-parent-signup-wizard without-steps']/h1")).getText();
		Assert.assertEquals(AddChildPageHeading, "Share Your Child's Details");
		System.out.println("User On Add child page");		
	
	}
	
	@Test
	public void leadingUnderscoreInEmailAddressField() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
		String dateAsString = simpleDateFormat.format(new Date());
		
		String parentEmail= "_+" + dateAsString + "@splashmath.com";
		user.enterParentEmail().sendKeys(parentEmail);
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "leadingUnderscoreInEmailAddressField");
		
		WebDriverWait addChildPage= new WebDriverWait(driver,2000);
		addChildPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button rounded-button-light-orange long full']")));
		
		String AddChildPageHeading= driver.findElement(By.xpath("//div[@class='sp-parent-signup-wizard without-steps']/h1")).getText();
		Assert.assertEquals(AddChildPageHeading, "Share Your Child's Details");
		System.out.println("User On Add child page");		
	
	}
	
	@Test
	public void dashInEmailAddressField() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMddhhmmss");
		String dateAsString = simpleDateFormat.format(new Date());
		
		String parentEmail= "s-n+" + dateAsString + "@splashmath.com";
		user.enterParentEmail().sendKeys(parentEmail);
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "dashInEmailAddressField");

		WebDriverWait addChildPage= new WebDriverWait(driver,2000);
		addChildPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='button rounded-button-light-orange long full']")));
		
		String AddChildPageHeading= driver.findElement(By.xpath("//div[@class='sp-parent-signup-wizard without-steps']/h1")).getText();
		Assert.assertEquals(AddChildPageHeading, "Share Your Child's Details");
		System.out.println("User On Add child page");		
	
	}
	
	@Test
	public void enterExistingUserEmail() throws InterruptedException
	{
		user = new LandingPageParentSignUp(driver);
		img= new TakingScreenshot(driver);
		user.parentsGetStartedForFreeButton().click();
		
		WebDriverWait signUpButtonVisibility = new WebDriverWait(driver,1000);
		signUpButtonVisibility.until(ExpectedConditions.presenceOfElementLocated(By.id("signup-button")));	
		
		user.enterParentEmail().sendKeys("sn+spg01@splashmath.com");
		user.enterParentPassword().sendKeys("123456");
		user.signUpButton().click();
		Thread.sleep(1000);
		img.getScreenshot("LandingPageParentSingUp", "enterExistingUserEmail");
		
		String PageHeading = driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div/div[1]/div/h4")).getText();
		
		WebDriverWait signUpButton = new WebDriverWait(driver, 1000);
		signUpButton.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
		
		Assert.assertEquals(PageHeading, "Join the Splash Math Program");
		System.out.println("Existing User");
		
	}
	
}
