package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonDemo extends Base{
	public  void verifyradiobuttonDemo() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobuttondemo = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radiobuttondemo.click();
		Boolean flag = radiobuttondemo.isSelected();
		WebElement showselectedvalue = driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedvalue.click();
	}

	public static void main(String[] args) {
		RadioButtonDemo radiobuttondemo = new RadioButtonDemo();
		radiobuttondemo.initializeBrowser();
		radiobuttondemo.verifyradiobuttonDemo();
		

	}

}
