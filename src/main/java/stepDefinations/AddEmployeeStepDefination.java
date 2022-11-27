package stepDefinations;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddEmployeeStepDefination {
	
	WebDriver driver;
	
	@Given("^User is already logged in$")
	public void user_is_already_logged_in() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^User click on PIM$")
	public void user_click_on_PIM() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
	}

	@Then("^user click on AddEmployee$")
	public void user_click_on_AddEmployee() throws Throwable {
		Thread.sleep(3000);
	   driver.findElement(By.linkText("Add Employee")).click();
	}

	@Then("^user enters firstname and lastname and user click on save$")
	public void user_enters_and_and(DataTable credentials) throws InterruptedException
	{	
		for(Map<String,String> data : credentials.asMaps(String.class, String.class))
		{
			Thread.sleep(3000);
			driver.findElement(By.name("firstName")).sendKeys(data.get("fname"));
			driver.findElement(By.name("lastName")).sendKeys(data.get("lname"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Add Employee")).click();
		}
	}
	@Then("^user exits$")
	public void user_exits() throws Throwable {
		driver.quit();
	}
}
