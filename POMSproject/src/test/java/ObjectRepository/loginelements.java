package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginelements {
	WebDriver driver;
	
	
	@FindBy  (xpath="//input[@id='login1']")
	private  WebElement Username;
	
	@FindBy  (xpath="//input[@id='password']")
	private  WebElement password;
	
	@FindBy  (xpath="//input[@name='proceed']")
	private  WebElement button;
	
//	public loginelements(WebDriver driver){
//		this.driver=driver;
//	}
	
	public void userfield(String un,String pwd) throws InterruptedException {
		Username.sendKeys(un);
		Thread.sleep(3000);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		button.click();
	}
	
	
}
