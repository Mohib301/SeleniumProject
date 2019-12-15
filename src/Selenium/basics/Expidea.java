package Selenium.basics;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expidea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.aa.com/homePage.do");
		
		WebElement departure = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport' and @class='aaAutoComplete ui-autocomplete-input']"));

		
		departure.clear();
		departure.sendKeys("Wash");
	}

}
