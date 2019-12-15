package Selenium.basics;

import java.io.IOException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.aa.com/homePage.do");
		// 1. grab the departure box xpath
					// 2. Store in a WebElment object
					// 3. Clear the box
					// 4. send (Wash) value
					// 5. create a list for storing webElments of dropdowns
					// 6. Create a for each loop to travel to list indexes
					// 7. write an if condition to click or select value we want
					// 8. break from the loop
					
					WebElement departure = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport' and @class='aaAutoComplete ui-autocomplete-input']"));

					
					departure.clear();
					departure.sendKeys("Wash");

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
				
					
					//storing departure date in a webelement obj
					WebElement departureCalendar= driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
					// selecting desire date using JSExecutor class
					Utility.selectDateByJS(driver, departureCalendar, "11/21/2019");
					
					WebElement returnCalendar = driver.findElement(By.xpath("//input[@id='aa-returningFrom']"));
					Utility.selectDateByJS(driver, returnCalendar, "11/30/2019");
					
					
					
					
					
					
					
					
					
					Utility.screenshot(driver, "C:\\Users\\mohib\\Desktop\\my java work space\\SeleniumProject\\output", "ReservationHeal");

		
	}

}
