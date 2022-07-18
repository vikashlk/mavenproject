package Testcase;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.utilities.Baseclass;
import Base.utilities.ConfigData;
import ObjectRepository.loginelements;

public class Login extends Baseclass{
	ConfigData cn;
	@Test
	public void loginpage() throws InterruptedException {
		
		loginelements log=   PageFactory.initElements(driver, loginelements.class);
		 cn=new ConfigData();
		 Thread.sleep(3000);
		log.userfield(cn.config_user(),cn.config_passw());
		
		
	}

}
