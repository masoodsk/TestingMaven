package driverUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fileutils.getAbsolpath;

public class setupDriver {

	public static WebDriver driverSetup(String typedriver) throws IllegalAccessException, IOException {
		WebDriver driver = null;
		String getdir = getAbsolpath.getpath();
		switch (typedriver) {
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", getdir + ".\\src\\main\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", getdir + ".\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "IE":
			System.setProperty("webdriver.ie.driver", getdir + ".\\src\\main\\resources\\drivers\\IEDriverServer.exe");
			driver = new ChromeDriver();
			break;

		default:
			throw new IllegalAccessException();
		}
		return driver;
	}

}
