package Selenium.basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1 Declare a String and assign a null value to it. name of String should be browser.

//		[12:54 PM]
		//00000000// write a switch case to switch for each browsers. 
				//if case is FF it opens FF browser.  if case is chrome it opens chrome browser.
		       // and default should open chrome.
				
			WebDriver driver = null;
      String browser = "Internet Explorer";
      
      switch(browser){
    	  case "Chrome":
    		  
    		  System.setProperty("webdriver.chrome.drive", "c:\\chromedriver");
    		  
    		   driver= new ChromeDriver();
    		  
    		  break;
    		  
    	  case "Firefox":
    	  
    	  System.setProperty("webdriver.geckodriver.drive", "c:\\geckodriver");
    	   driver = new FirefoxDriver();
    	  
    	  break;
    	  
    	  case "Internet Explorer":
    	  System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
    	   driver = new InternetExplorerDriver();
    	  
    	  break;
    	  
    	  default:
    		  System.setProperty("webdriver.chrome.drive", "c:\\chromedriver");
		  
		   driver= new ChromeDriver();
		  
		  break;
      }
      driver.get("https://www.google.com/");
      
      driver.getTitle();
      
      String expectedResult = "google";
      String title = driver.getTitle();
      System.out.println("this is title: "+ title);
      
      if(expectedResult.equalsIgnoreCase("google")) {
    	  System.out.println("this is expected result: "+ title);
      }else {
    	  System.out.println(" this is wrong result");
      }
           
	}

}
