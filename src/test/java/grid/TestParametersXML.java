package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersXML {

	public WebDriver driver;
	public DesiredCapabilities cap = new DesiredCapabilities();
	
	
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browser) throws MalformedURLException {
		
		
		if(browser.equals("chrome"))
		{
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("chrome");
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
		}else if(browser.equals("ie")) {
			
			
			cap.setPlatform(Platform.WINDOWS);
			cap.setBrowserName("ie");
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/grid/console"),cap);
		
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.quit();
	
	}
	
	
}
