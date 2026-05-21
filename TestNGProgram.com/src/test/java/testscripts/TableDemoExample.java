package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableDemoExample {
	WebDriver driver;
	@Test
	public void tablehandling() {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
		List <WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows :"+rows.size());
		
		for(int i=1; i< rows.size(); i++) {
			List <WebElement> column = rows.get(i).findElements(By.tagName("td"));
			for(WebElement cell: column) {
				System.out.println(cell.getText()+"|");
			}
			
			System.out.println();
		}
		driver.quit();
		
	}

}
