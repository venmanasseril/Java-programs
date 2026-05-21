package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	WebDriver driver;
	@Given("The user is on the login page")
	public void theuserisontheLoginpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	}
	
	@When("The user enters a valid username and password")
	public void theuserentersavalidusernameandpassword() {
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		usernamefield.sendKeys("admin");
		passwordfield.sendKeys("admin");
		
	}
	
	@When("Clicks the login button")
	public void clickstheloginbutton() {
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginbutton.click();
	}
	
	@Then("The user should be redirected to the home page")
	public void usershouldberedirecttothehomepage() {
		String title =driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}
	@When("The user enters invalid username and invalid password")
	public void theuserentersinvalidusernameandpassword() {
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		usernamefield.sendKeys("invalid");
		passwordfield.sendKeys("invalid");
	}
	@Then("An error message should be displayed")
	public void anerrormessageshouldbedisplayed() {
		String errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		System.out.println(errorMessage);
		driver.quit();
	}
	@Then("A validation message should be displayed")
	public void validation_messageshouldbedisplayed() {
		String errorMessage = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("validationMessage");
		System.out.println(errorMessage);
		driver.quit();
	}
	@When("The user enters valid username and invalid password")
	public void the_user_enters_valid_username_and_invalid_password() {
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		usernamefield.sendKeys("admin");
		passwordfield.sendKeys("invalid");
	}
	@When("The user enters invalid username and valid password")
	public void the_user_enters_invalid_username_and_valid_password() {
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		usernamefield.sendKeys("invalid");
		passwordfield.sendKeys("admin");
	}
	
	
	
	@When("The user enters empty username and empty password")
	public void the_user_enters_empty_username_and_empty_password() {
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		usernamefield.sendKeys("");
		passwordfield.sendKeys("");
	}
	
}
