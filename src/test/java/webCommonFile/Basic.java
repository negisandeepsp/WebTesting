package webCommonFile;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basic 
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","/Users/sandeep/Desktop/sandeepBackUp/Workspace_Neha/SplashmathProjectUsingMaven/splashmathTesting/Drivers/chromedriver");
		driver = new ChromeDriver();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenResolution = new Dimension((int) 
		toolkit.getScreenSize().getWidth(), (int) 
		toolkit.getScreenSize().getHeight());
		driver.manage().window().setSize(screenResolution);
		
		driver.get("https://staging-1.splashmath.com/");
	// to verify landing Page	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
