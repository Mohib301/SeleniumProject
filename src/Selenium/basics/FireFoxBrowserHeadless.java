package Selenium.basics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.geckodriver.driver", "c:\\geckodriver.exe");
		//2. create object of firefox Options
		
		FirefoxOptions fo = new FirefoxOptions();
		//add headless arguments to firefoxoptions
		fo.addArguments("--headless");
		
		//3 instantiate firefox and print its title
		
		WebDriver driver = new FirefoxDriver(fo);
		
		//open tek school page and ptint its title
		driver.get("https://tekschoolofamerica.com/");
		System.out.println(driver.getTitle());
			
		//take screenshot
		try {
			Utility.screenshot(driver, "C:\\Users\\mohib\\Desktop\\my java work space\\SeleniumProject\\output", "TEKSCHOOL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	
	
	
	
	
	
	
	}

}
