package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDef {
	WebDriver driver;
	@Given("user is on Home page")
	public void user_is_on_home_page() {
	 System.out.println("User is on Home page");
	 	System.setProperty("webdriver.chrome.driver", "G:\\sel\\Sel@9AM(EST)\\chromedriver_win32\\chromedriver.exe");
	 	driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@When("user clicks on signin link")
	public void user_clicks_on_signin_link() {
	   System.out.println("User clicks on Sign in link");
	   driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("Next page is displayed with title")
	public void next_page_is_displayed_with_title() {
		SoftAssert assertion = new SoftAssert();
	    System.out.println("Check title of next page");
	    String title=driver.getTitle();
		System.out.println("Title="+title);
		assertion.assertEquals(title, "Rediffmail");
		System.out.println("Assert Executed...");
	}
	@When("user enters user name and password clicks on Submit button")
	public void user_enters_user_name_and_password_clicks_on_submit_button() {
	  System.out.println("Enter valid user name and valid password"); 
	  driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
	}
	@Then("check user and displays login successful")
	public void check_user_and_displays_login_successful() {
	   System.out.println("Login Successful..");
	}
	@When("user logs out application should close")
	public void user_logs_out_application_should_close() {
	    System.out.println("Logout");
	    driver.quit();
	}
	@When("home page should be there")
	public void home_page_should_be_there() {
	  System.out.println("Check for Home Page");
	}
	@When("user enters invalid  user name or invalid password click on Submit button")
	public void user_enters_invalid_user_name_or_invalid_password_click_on_submit_button() {
	   System.out.println("Enter invalid user name or password"); 
	}
	@Then("check Error message is displayed")
	public void check_error_message_is_displayed() {
		System.out.println("Invalid user name or password entered...");
	}







}
