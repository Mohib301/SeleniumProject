package Selenium.basics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.get("https://tekschoolofamerica.com/");
//		//webdriver wait obj

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.textToBePresentInElement(
				driver.findElement(By.xpath("//a[text()='Test Environment']")), "Test Environment"));
		
		
		
	}

}

