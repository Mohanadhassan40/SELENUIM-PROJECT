package org.learningmaven.selenuimproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Actiontocontrol {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		WebElement Singed=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act=new Actions(driver);
		act.moveToElement(Singed).perform();
		WebElement primemember=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[3]/a[11]/span")); 
		Actions on=new Actions(driver);
		act.moveToElement(primemember).perform();
		act.click();
		
		
	}

}
