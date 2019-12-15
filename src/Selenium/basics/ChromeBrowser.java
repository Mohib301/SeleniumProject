package Selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//0. Set System property for browser
		// syntax = System.setProperty("webdriver.chrome.driver.exe");
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		//1. create object of WebDriver
		
		WebDriver driver= new ChromeDriver();
		
		// OPEN GOOGEL.COM 
		// URL = https://www.google.com/
		
		// HOW to say the browser to open the url for me
		
		//.get( method opens browser
		driver.get("https://www.google.com/");
		
		
		
	}

}
