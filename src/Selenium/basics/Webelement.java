package Selenium.basics;


import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// this method will delete cookies or data sent from browser
		driver.manage().deleteAllCookies();
		//String url = "https://tekschoolofamerica.com";
		driver.getTitle();
		String actualTitle = driver.getTitle();
		String expectedTitle = "TEK SCHOOL";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle);
		}	else
				System.out.println("Title is not correct");
		
//		List<WebElement> logo = driver.findElements(By.tagName("a"));
		
		
		//driver.findElements(By.tagName("a"));
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement webLinks : links) {
	
			String elementText = webLinks.getText();
			System.out.println(elementText);
			//if element text = to Phone & PDAs then click
		if (elementText.equals("Phone & PDAs")) {
			webLinks.click();
			break;
		}
		
		}
		//find all webElements in Test Envirenment with tag "div"
		//print number of webelements
		//print text of all webElements
		//List<WebElement> logo1 = driver.findElements(By.tagName("div"));
		List <WebElement> links1 = driver.findElements(By.tagName("div"));
		System.out.println(links1.size());
		
//		for (WebElement weblinks: links1) {
//			String elementText = weblinks.getText();
////		}
	
	
	//differences between findelement and findelements:
		//1.findelement returns single element and find elements list of elements
		//2.if element is not exist: 
		     //1.findelement will throw NoSuchElement exception
             //findelements it will return an empty list  	
	
	
	}

}