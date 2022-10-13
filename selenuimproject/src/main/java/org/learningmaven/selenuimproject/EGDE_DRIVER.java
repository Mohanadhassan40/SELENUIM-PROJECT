package org.learningmaven.selenuimproject;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class EGDE_DRIVER {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ibrowser("edge");
		
		
	}  
        public static void Ibrowser(String NameOfBrowser) {
        	if (NameOfBrowser.equalsIgnoreCase("chrome")) {
        		
        		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\chromedriver.exe");
        		
        		driver=new ChromeDriver();
        		driver.get("https://www.facebook.com");
        		
        		driver.manage().window().maximize();
        	} else if (NameOfBrowser.equalsIgnoreCase("edge")) {
        		System.setProperty("webdriver.edge.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\msedgedriver.exe");
       		 
                driver=new EdgeDriver();
                driver.get("https://www.amazon.com");
        		
        		driver.manage().window().maximize();
                
        	}	
        	}
       public static void Screenshots() throws IOException  {
    	   Date ob=new Date();
    	   System.out.println(ob);
    	   String files= ob.toString().replace("", "").replace(":", "_");
    	   System.out.println(files);
    	   File HomeSTPage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  org.openqa.selenium.io.FileHandler.copy(HomeSTPage, new File("C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\Pic\\"+files+"Home.JPG"));
    	  
       }
        				
        		
        	
		
			
			
		}
        	
      

	
		
		

