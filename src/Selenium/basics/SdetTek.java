package Selenium.basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetTek {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //.1 instantiate chromeDriver
        WebDriver driver = new ChromeDriver();
        //. browser manage commands:
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        String url = "https://tekschoolofamerica.com/";
        driver.get(url);
        String tekSchoolPageTitle =driver.getTitle();
        System.out.println(tekSchoolPageTitle);
        
        
       
        
        //driver.findElement(By.xpath("//a[text()='Test Environment']")).click();
        driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
        String testEnvPageTitle = driver.getTitle();
        System.out.println(testEnvPageTitle);
        
        Utility.screenshot(driver, "C:\\Users\\mohib\\Desktop\\my java work space\\SeleniumProject\\output", "SdetTek");
        
        
	}

}
