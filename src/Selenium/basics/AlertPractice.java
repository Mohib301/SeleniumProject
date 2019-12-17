package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is my first jenkins pipeline file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement GoButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		GoButton.click();
			
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	
		
		
	}

}
