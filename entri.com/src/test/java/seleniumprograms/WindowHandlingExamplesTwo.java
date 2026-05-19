package seleniumprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WindowHandlingExamplesTwo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.qabible.in/window-popup.php");

		driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']")).click();

		String mainWindow = driver.getWindowHandle();

		// Switch to child window
		for (String window : driver.getWindowHandles()) {
		    if (!window.equals(mainWindow)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement email = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.id("email"))
		);

		email.sendKeys("test");

		driver.close();
		driver.switchTo().window(mainWindow);

	}
}
