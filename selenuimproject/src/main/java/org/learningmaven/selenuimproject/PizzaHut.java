package org.learningmaven.selenuimproject;

import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizzaHut {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div/div/div/div/div[2]/div[1]/div/a/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/div/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("w2-address")).sendKeys("2570 chain bridge rd");
		driver.findElement(By.id("w2-address2")).sendKeys("101");
		driver.findElement(By.id("w2-city")).sendKeys("vienna");
		driver.findElement(By.id("w2-state")).sendKeys("VA");
		driver.findElement(By.id("w2-zip")).sendKeys("22181");
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/form/div[3]/button")).click();	
        Thread.sleep(5000);	
		driver.findElement(By.xpath("(//*[text()='Select'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='SWITCH TO CARRYOUT']")).click();
		int links = driver.findElements(By.linkText("a")).size();
		System.out.println("number of links"+links);
		
		
		
		
	}
	

}
