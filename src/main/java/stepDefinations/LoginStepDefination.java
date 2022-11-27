package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^title of the page is OrangeHRM$")
	public void title_of_the_page_is_OrangeHRM() throws Throwable {
		String actual_title = driver.getTitle();
		String expected_title = "OrangeHRM";
		Assert.assertEquals(expected_title, actual_title);
	}

	@Then("^user enters username \"(.*)\" and user enters password \"(.*)\"$")
	public void user_enters_username_and_user_enters_password(String arg1, String arg2) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^user gets on Dashboard$")
	public void user_gets_on_Dashboard() throws Throwable {
		Thread.sleep(3000);
		boolean flag1 = driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed();
		Assert.assertTrue("User Unable to login !", flag1);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		driver.quit();
	}

}
