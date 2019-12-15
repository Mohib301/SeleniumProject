package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// how to handle the frames
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //.1 instantiate chromeDriver
        WebDriver driver = new ChromeDriver();
        //. browser manage commands:
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        
        // SWITCH TO FRAME
        //
        driver.switchTo().frame("main");
        
        WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
       System.out.println(header.getText());
       //switcing to default page
        driver.switchTo().defaultContent();
        
        
        // please print the "footer"
        //h2[contains(text(),'Footer')];
        driver.switchTo().frame("bot");
        WebElement footer = driver.findElement(By.xpath("//h2[text()='Footer ']"));
        System.out.println(footer.getText());
        driver.switchTo().defaultContent();
        
        
        
        
        
        
        
	}

}
