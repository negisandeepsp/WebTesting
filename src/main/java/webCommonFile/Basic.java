package webCommonFile;

import java.awt.Toolkit;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basic 
{
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		try {
		System.setProperty("webdriver.chrome.driver","C:\\git\\WebTesting\\Drivers\\chromedriver.exe");	
// To remove error alert "Disable Developer Mode Extension" in Chrome	
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		options.addArguments(Arrays.asList("allow-running-insecure-content", "ignore-certificate-errors"));		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	//s	options.addArguments("disable-infobars");
		driver= new ChromeDriver(options);
		
 // To maximize chrome browser window		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenResolution = new Dimension((int) 
		toolkit.getScreenSize().getWidth(), (int) 
		toolkit.getScreenSize().getHeight());
		driver.manage().window().setSize(screenResolution);
		
		driver.get("https://staging-1.splashmath.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		
		catch(Exception e)
		{
			System.out.println("Exception is = "+ e.getMessage());
		}
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
