package org.learningmaven.selenuimproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiWindowSwitch {
	public static WebDriver Driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\chromedriver.exe");
		
		Driver=new ChromeDriver();
		Driver.get("https://www.amazon.com");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        WebElement Kindele= Driver.findElement(By.linkText("Kindle Books"));
     
        Actions ob=new Actions(Driver);
        ob.keyDown(Keys.SHIFT).build().perform();
        Kindele.click();
        ob.keyUp(Keys.SHIFT).build().perform();
        Set<String> Windowsis=   Driver.getWindowHandles();
        Iterator<String> iterator=Windowsis.iterator();
        String FirstWindowHandle=iterator.next();
        String secondWindowHandle=iterator.next();
        Driver.switchTo().window(secondWindowHandle);
        System.out.println(FirstWindowHandle);
        System.out.println(secondWindowHandle);
        Thread.sleep(3000);
        WebElement Stopover= Driver.findElement(By.linkText("The Stopover"));
        Stopover.click();
        
        
        
        
        

	}

}
