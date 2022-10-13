package org.learningmaven.selenuimproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Wording {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		String titles= driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(titles);
		
	

	}

}
