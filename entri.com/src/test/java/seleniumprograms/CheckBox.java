package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
	
	public void verifysinglecheckboxDemo(){
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlecheckBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singlecheckBox.click();
		Boolean issinglecheckboxselected = singlecheckBox.isSelected();
		
	}
	

	public static void main(String[] args) {
		CheckBox checkbox = new CheckBox();
		checkbox.initializeBrowser();
		checkbox.verifysinglecheckboxDemo();
		checkbox.browserQuit();
	}

}
