package Selenium.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
	
	searchButton.click();
		
		//to handle window popus we will use switch method
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	 
	
	//get title of the page
	System.out.println(driver.getTitle());
	
	
	WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
	crm.click();

	// In order to switch from parent window to child window we need to do below actions
	// 1. get all window Handlers and store in a SET.
	Set<String> WindowHandles = driver.getWindowHandles();
	//2.  Use Iterator to iterate in window Hndlers SET.
	Iterator<String> it = WindowHandles.iterator();
	
	//3. Store parent window handler in a string.
	String parentWindow = it.next();
	//4. store child window handlerin a string.
	String childWindow = it.next();
	//5. use SwitchTo.Window method for switching form parent to child.
	driver.switchTo().window(childWindow);
	
	System.out.println(driver.getTitle());
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.close();
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
