package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Base.BaseClass;

public class BrowserNavigation extends BaseClass {

	@Test()
	
	public void Test1() {
		getWebDriver().get("https://www.fromatob.com/");
	}
	
	
	/*@AfterMethod()
	
	public void CloseBrowser() {
		
		getWebDriver().close();
	}*/
}
