package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
		//create object of chromeOptions
		ChromeOptions chromeOptions = new ChromeOptions();
		//add headless arguments to chromeOptions object
		chromeOptions.addArguments("--headless");
		
		//instantiated chrome browser
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	   
		//go to tek school page and print out title
		driver.get("https://tekschoolofamerica.com/");
		System.out.println(driver.getTitle());
	}

}
