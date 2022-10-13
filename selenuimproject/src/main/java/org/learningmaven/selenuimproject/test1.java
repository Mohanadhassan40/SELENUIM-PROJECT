package org.learningmaven.selenuimproject;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohanad Elmazahy\\eclipse-workspace\\selenuimproject\\drivers\\chromedriver.exe");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.navigate().back();
		driver.getCurrentUrl();
		Thread.sleep(1000);
		//driver.navigate().forward();
		String Windows= driver.getWindowHandle();
		System.out.println(Windows);
		String K1=driver.getCurrentUrl();
		System.out.println(K1);
		String Titel=driver.getTitle();
		System.out.println(Titel);
		WebElement UserField=   driver.findElement(By.id("email"));
		UserField.sendKeys("Mohanad.elmazahy@potomacforallseas.com");
		WebElement PaswordField= driver.findElement(By.name("pass"));
		PaswordField.sendKeys("N00000");
		//WebElement LogButton= driver.findElement(By.name("login"));
		//LogButton.click();
		//Thread.sleep(6000);
		//WebElement ForgotPasword= driver.findElement(By.partialLinkText("Forgot password?"));//driver.findElement(By.linkText("Forgot password?"));
		//ForgotPasword.click();
		//*[contains(text(),'Forgot password?')]
		
		WebElement Creatnewacc = driver.findElement(By.linkText("Create new account"));
		Creatnewacc.click();
		Thread.sleep(3000);
		
		//WebElement entername =driver.findElement(By.name("firstname"));
		//entername.sendKeys("Moo");
		driver.findElement(By.name("firstname")).sendKeys("Moo");
		
		WebElement lastname =driver.findElement(By.name("lastname"));
		lastname.sendKeys("momom");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("dood@dood.com");
		
		WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
		reemail.sendKeys("dood@dood.com");
		
		WebElement pass =driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("dood");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Month);
		ob.selectByVisibleText("Sep");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select ov=new Select(Day);
		ov.selectByVisibleText("25");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select ou=new Select (Year);
		ou.selectByVisibleText("1982");
		
		//driver.findElement(By.xpath("//div[@id = 'birthday_age']/following-sibling::div[1]/span[1]/child::span[2]/child::input[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/label")).click();
		//WebElement gender = driver.findElement(By.name("sex"));
		//gender.click();
		//"/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/label"
		///html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label
		
		//driver.findElement(By.name("websubmit")).click();
		//driver.findElement(By.xpath("(//button[@tybe='submit'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']")).click();
		Thread.sleep(10000);
		driver.close();
	
	
		
				
		
		
		
		

		

	}

	
	}


