package browserfactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browserclass {
	
	public static  WebDriver driver;
	//browsers
	
	public  WebDriver browserlaunch(WebDriver driver , String browser , String url ) throws InterruptedException 
	{
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			driver= new FirefoxDriver();
			
			
		}else if(browser.equals("explore")) {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			driver= new InternetExplorerDriver();
			
		}else {
			System.out.println("this browser is not present");
		}
		//added line
		
		driver.get(url);
		return driver;
	}
	
	public static void quit(WebDriver driver) {
		driver.close();
	}
	

}
