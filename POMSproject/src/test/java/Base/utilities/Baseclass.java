package Base.utilities;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;


import browserfactory.Browserclass;

public class Baseclass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		Browserclass b= new Browserclass();

		driver=b.browserlaunch(driver, "chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
	@AfterTest
	public void closedata() {
		Browserclass.quit(driver);
	}

}
