package Selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FfBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gekodriver.driver", "c:\\gekodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
