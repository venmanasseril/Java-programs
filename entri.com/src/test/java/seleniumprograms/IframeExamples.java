package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExamples extends Base{
	
	
	public void iframesamples() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e"); //inside iframe by its id
		WebElement iframeElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		iframeElement.click();
		driver.switchTo().defaultContent(); //get outside  iframe
		
		
	}
	
	
	public static void main(String[] args) {
		IframeExamples iframeexamples = new IframeExamples();
		iframeexamples.initializeBrowser();
		iframeexamples.iframesamples();
		iframeexamples.browserQuit();

	}

}
