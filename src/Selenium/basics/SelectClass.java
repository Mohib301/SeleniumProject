package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// .deleteAllCookies method will delete cookies or data sent from browser.
		driver.manage().deleteAllCookies();
		
		
driver.get("https://tekschoolofamerica.com/test-environment/");
		
		WebElement phone_PDAS =driver.findElement(By.xpath("//a[text()='Phones & PDAs']"));
		phone_PDAS.click();
		
		// To handle static dropdowns we use Select class 
		WebElement sortByElement = driver.findElement(By.xpath("//select[@id='input-sort']"));
		
		Select select = new Select(sortByElement);
		
		//select.selectByVisibleText("Price (High > Low)");
		//1. selectbyVlaue
		//select.selectByValue("https://tekschoolofamerica.com/test-environment/index.php?route=product/category&path=24&sort=p.price&order=DESC");
		//2. selectyIndex
		select.selectByIndex(4);
		
		
		// .close(); close the current window
		//driver.close();
		
		//.quit(); close all the windows
		//driver.quit();

		
		// thread.sleep slow down the web browser ...not recomonded
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
