package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples extends Base {
	
	public void selectclassexamples() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectdropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(selectdropDown); //dropdowns menu handling class by selenium
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
		
	}
	
	
	public static void main(String[] args) {
		DropDownExamples dropdownexamples = new DropDownExamples();
		dropdownexamples.initializeBrowser();
		dropdownexamples.selectclassexamples();
		dropdownexamples.browserQuit();

	}

}
