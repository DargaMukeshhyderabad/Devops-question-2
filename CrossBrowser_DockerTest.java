package DevopsAssignment2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_DockerTest {
	 WebDriver driver;
	
  @Parameters({"bname"})
  @Test
  public void browserTest(String bname) throws MalformedURLException, InterruptedException
  {
	  if(bname.equalsIgnoreCase("chrome")) 
	  {
		 ChromeOptions options = new  ChromeOptions();
		 driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Connection Established with chrome browser");
	  }
	   if(bname.equalsIgnoreCase("firefox")) 
	  {
		  FirefoxOptions options = new  FirefoxOptions();
		 driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Connection Established with firefox browser");
	  }
	   if(bname.equalsIgnoreCase("edge"))
	  {
		  EdgeOptions options = new  EdgeOptions();
			 driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Connection Established with edge browser");
	  }
	  Thread.sleep(2000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(2000);
	  System.out.println("Application Excecuting parallelly");
	  driver.quit();
	  
  }
}
