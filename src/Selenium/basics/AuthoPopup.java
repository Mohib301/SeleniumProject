package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthoPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		String userName = "admin";
		String passWord = "admin";
		
		//http://the-internet.herokuapp.com/basic_auth
		
		//syntax for bypassing authoPopups
		// http://username:password@the-internet.herokuapp.com/basic_auth
		 
		
		String url= "http://"+ userName + ":"+ passWord + "@" + "the-internet.herokuapp.com/basic_auth";
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
	}

}











