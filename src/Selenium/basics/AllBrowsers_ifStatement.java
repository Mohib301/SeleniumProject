package Selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers_ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		String browser = "ie";
		
		if(browser.contentEquals("chrome")){
				System.setProperty("webdriver.chrome.drive", "c:\\chromedriver");
				driver = new ChromeDriver();
		
		}else if(browser.contentEquals("firefox")){
			  
	    	  System.setProperty("webdriver.geckodriver.drive", "c:\\geckodriver");
	    	   driver = new FirefoxDriver();
	    	   
		}else if(browser.contentEquals("ie")){
			System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
	    	   driver = new InternetExplorerDriver();
		
		}else {
			System.setProperty("webdriver.chrome.drive", "c:\\chromedriver");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com/");

	}

}
