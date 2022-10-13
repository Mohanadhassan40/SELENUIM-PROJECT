package Facebook_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	@FindBy(name = "email") WebElement FieldEmail;
	@FindBy(name = "pass") WebElement Password;
	@FindBy(name = "login") WebElement Login;
	public Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void FiledToEmail (String name) {
		
		FieldEmail.clear();
		FieldEmail.sendKeys(name);
		
		
		
			
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
