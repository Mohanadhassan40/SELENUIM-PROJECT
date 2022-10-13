package Amazon_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
		
		@FindBy (linkText = "Kindle Books") WebElement Kb;
		
		
	
		public void KindleBooksClick() {
			Kb.click();
		}
		
		
		public Home(WebDriver driver) {
			
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}


		public void FieldToEmail(Integer n) {
			// TODO Auto-generated method stub
			
		}


		public void passwordTofield(String s) {
			// TODO Auto-generated method stub
			
		}


		public void loginbtclick() {
			// TODO Auto-generated method stub
			
		}

	}


