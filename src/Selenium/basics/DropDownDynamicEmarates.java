package Selenium.basics;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDynamicEmarates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("https://www.southwest.com/");
		
	WebElement depart= driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_originationAirportCode']"));
	
	depart.clear();
	depart.sendKeys("wash");
	
	
	List <WebElement> airports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
	
	System.out.println(airports.size());
	
	for(WebElement element: airports) {
		
	try {	if (element.getText().contains("BWI")) 
			element.click();
		break;
	 
	}catch(StaleElementReferenceException e){
	
		System.out.println("Element is no longer attached to dom");
		}
	}

	
		Utility.screenshot(driver, "C:\\Users\\mohib\\Desktop\\my java work space\\SeleniumProject\\output", "Airlin Image");

	
	}

}
