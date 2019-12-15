package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		String url = ("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.get(url);
		
	// store choose file element in a webelement obj
		
		WebElement uploadfile = driver.findElement(By.xpath("//input[@type='file']"));
		
		// we use sendKeys method to upload file in selenium
		// path of file\\filename.ext
		
	//	uploadfile.sendKeys("C:\\Users\\mohib\\Desktop\\Selenium lessons\\new.jpg");
	    uploadFileMethod(uploadfile, "C:\\Users\\mohib\\Desktop\\Selenium lessons\\newtext.txt");
	    uploadfile.findElement(By.xpath("//input[@type='submit']")).click();;
	}
	
	
	//create a method to perofrm uploading a fiel.
	//this method has two arguments (webelement and string path).
	
	public static void uploadFileMethod (WebElement element, String path ) {
		
		element.sendKeys(path);
		
	}

	}

