package takingScreenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakingScreenshot 
{
public WebDriver driver ;
	
	//https://github.com/anshooarora/extentreports-java/issues/243
	
	public TakingScreenshot(WebDriver driver)
	{
		this.driver = driver;
	}

	public void getScreenshot(String FolderName , String imageName)
	{
		
		try 
		{
			TakesScreenshot photo=(TakesScreenshot)driver;
			File source = photo.getScreenshotAs(OutputType.FILE);
			
			String dest = "./SplashmathScreenShots/" + FolderName+ "/" + imageName + ".png";
			File destination = new File(dest);
			
			FileUtils.copyFile(source, destination);
			System.out.println(imageName + " ScreenShot Taken");
			
		} 
		
		catch (Exception e) 
		{
			System.out.println("Exception while taking Screenshot" + e.getMessage());
		}
		
		
	}

}
