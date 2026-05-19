package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;    //global
	
	public void initializeBrowser() {
		driver = new ChromeDriver();	
		driver.get("https://selenium.qabible.in/simple-form-demo.php");// url launching
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//all web elements stored in entri project 
		driver.manage().window().maximize();  //window size maximising
	}
	
	public void browserQuit() {  
		//driver.close();  current page close not browser
		driver.quit();  //complete browser close
	}
	
	public static void main(String args[]) {
		Base base = new Base();
		base.initializeBrowser();
		base.browserQuit();
	}
	
	
	
}
