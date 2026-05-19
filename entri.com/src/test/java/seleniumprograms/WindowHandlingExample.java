package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");//main window
		driver.findElement(By.xpath("//a[text()='Click Here']")).click(); //chil window open
		String mainWindow = driver.getWindowHandle();//current window unique id stored in string variable
		for(String window: driver.getWindowHandles()) {//more than 1 window fetching
			if(!window.equals(mainWindow)) { //true if id not that of mainwinow
				driver.switchTo().window(window);// switch to that id window
				break;
			}
			
		}
		//get text of child
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.close();
		driver.switchTo().window(mainWindow);
		String title= driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
