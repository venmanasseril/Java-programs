package seleniumprograms;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locators extends Base{
	
	
	public void locatorsExamples() {
		
	
		WebElement idAttribute = driver.findElement(By.id("button-one"));
		WebElement nameAttribute = driver.findElement(By.name("description"));
		WebElement linkText = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Buttons Demo"));
		WebElement className = driver.findElement(By.className("card-header"));
		WebElement tagName = driver.findElement(By.tagName("button"));
		WebElement cssSelector = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssSelector2 = driver.findElement(By.cssSelector("button.btn btn-primary"));
		WebElement cssSelector3 = driver.findElement(By.cssSelector("button[id='button-one']"));
	}
	
	public void xpathLocators() {
		WebElement xpath = driver.findElement(By.xpath("//input[@id='single-input-field']")); //simple xpath
		WebElement xpathcontains = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]"));
		WebElement xpathstartswith = driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]"));
		WebElement xpathtextof = driver.findElement(By.xpath("//button[text()='Show Message']"));
	}
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		// Open new tab and switch to it
		driver.manage().window().maximize();
	
		driver.findElement(By.id("value-a")).sendKeys("10");
		driver.findElement(By.id("value-b")).sendKeys("100");
		driver.findElement(By.id("button-two")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		//driver.findElement(By.partialLinkText("Checkbox ")).click();
		List <WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(WebElement element:elements)System.out.println(element.getText());
		
	}

}
