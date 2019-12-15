package Selenium.basics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0. set system property for chrome browser
	System.setProperty("webdriver.chrome.drive", "c:\\chromedriver");
	//1. instnatiate chromDriver
		 WebDriver  driver= new ChromeDriver();
		
		   
		// 2. get to facebook page
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 
		 //3. get facebook title
		 driver.get("www.faceboo.com");
		 
		 //get facebook title
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "Facebook - log In or Sign Up";
		 
		 if (actualTitle.equals(expectedTitle)) {
			 System.out.println("title is correct");
		 }else
			 System.out.println("wrong title");
		//4. store title in string name actual title
		
		//find email or phone element
		 driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("email")).clear();
		
		//clearing password field
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("u_02")).click();
	}

}
