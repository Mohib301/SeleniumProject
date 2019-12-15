package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// .deleteAllCookies method will delete cookies or data sent from browser.
		driver.manage().deleteAllCookies();
		
		String baseURL = "https:/tekschoolofamerica.com/test-environment/";
		driver.get(baseURL);
		
		//create object of action class in order to se its methods
		//the action class always taken the driver as an argument.
		Actions actions= new Actions(driver);
		
		WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
		
		// mouse over to an element
		actions.moveToElement(component).build().perform();
		Thread.sleep(5000);
		
		// double click on an element. any option has double click it works.
		actions.doubleClick(component).build().perform();
		Thread.sleep(3000);
		
		// right click on web page we will never used on test but at the interview will ask.
		//also the context is part of the browser not driver.
		actions.contextClick(component).build().perform();
		
		//navigate to bellow url
		// http://jqueryui.com/resources/demos/droppable/default.html
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		actions.dragAndDrop(source, target).build().perform();
		
	   

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
