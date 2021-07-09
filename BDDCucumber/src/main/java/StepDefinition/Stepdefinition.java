package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition {
	 WebDriver driver;
	 
	@Given("^User in login page$")
	public void user_in_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "E:\\E\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://chic.uat.solartis.net/");

	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Title of login in CHIC$")
	public void title_of_login_in_CHIC() throws Throwable {
		String s=driver.getTitle();
		System.out.println(s);
		Assert.assertEquals("CHIC | Taxi Insurance, Limousine Insurance and Rideshare Insurance Company",s);
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Enter the \"([^\"]*)\"$")
	public void enter_the_Username(String username) throws Throwable {
		driver.findElement(By.id("login_username")).sendKeys(username);

	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Enter \"([^\"]*)\"$")
	public void enter_the_Password(String password) throws Throwable {
		driver.findElement(By.id("login_password")).sendKeys(password);

	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr[5]/td/input[6]")).click();
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	}

}
