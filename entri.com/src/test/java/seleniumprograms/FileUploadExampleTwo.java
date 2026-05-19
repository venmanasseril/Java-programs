package seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadExampleTwo {
	
	
public static void main(String args[]) throws AWTException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://smallpdf.com/word-to-pdf");
		WebElement chooseFilesClick=driver.findElement(By.xpath("//span[text()='Choose Files']"));
		chooseFilesClick.click();
		//Wrap the raw string into object
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\Netcom\\Downloads\\AnandVL_CV_april.docx");
		//get system clipboard and set content
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   
		  
		   Robot robot = new Robot();//keyboard and mouse event programmingly controlled for window dialogue box
		   robot.delay(250);
		   robot.keyPress(KeyEvent.VK_ENTER);// enter key press
		   robot.keyRelease(KeyEvent.VK_ENTER); // enter key release
		   
		    robot.keyPress(KeyEvent.VK_CONTROL);//control key press 
			robot.keyPress(KeyEvent.VK_V);// v key press
			robot.keyRelease(KeyEvent.VK_V); // v key release
			robot.keyRelease(KeyEvent.VK_CONTROL); // control key release
			robot.keyPress(KeyEvent.VK_ENTER);//enter key press (file upload)
			robot.delay(90); //wait
			robot.keyRelease(KeyEvent.VK_ENTER); // enter key release
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			// Wait for file upload and Convert button
	        WebElement convertBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Convert']"))
	        );
	        convertBtn.click();
	        

	        // Wait for Download (Done) button
	        WebElement downloadBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Download')]"))
	        );
	        downloadBtn.click();

	        System.out.println("File uploaded and converted successfully!");

	      
	        driver.quit();

}
}
