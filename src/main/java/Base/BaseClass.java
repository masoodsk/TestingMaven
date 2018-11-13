package Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import driverUtils.setupDriver;

public class BaseClass {

	public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	
	@BeforeMethod()
	public  void Init() {
		
		try {
			WebDriver driver=setupDriver.driverSetup("Firefox");
			setWebDriver(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		} catch (IllegalAccessException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	public  void setWebDriver(WebDriver driver) {
		
		dr.set(driver);
	}
	
	public WebDriver getWebDriver() {
		
		return dr.get();
	}
	
	
	public static void main(String[] args) {

	}
}
