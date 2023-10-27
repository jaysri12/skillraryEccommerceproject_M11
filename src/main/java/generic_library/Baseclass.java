package generic_library;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xslf.model.PropertyFetcher;
import org.bouncycastle.util.test.TestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
   public WebDriver driver;
   public PropertyFile pdata = new PropertyFile();
   
   @BeforeTest
   public void openApp() throws Throwable {
	   WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		//implicit 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get(pdata.getpropertydata("url"));
	    
	@AfterMethod
	public void CloseApp(ITestResult res) throws Throwable{
	    	int status = res.getStatus();
	    	String name = res.getName();
	    	
	    	if (status ==2) {
	    		photo p = new photo();
	    		p.getphoto(driver,name);
	    	}
	    	driver.quit();
	    }
   }
}
