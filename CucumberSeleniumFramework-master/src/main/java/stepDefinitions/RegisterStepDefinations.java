package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.RegisterPage;
import businessLib.GuiLib;




//data table with maps : for parameterization of test cases

public class RegisterStepDefinations {
	WebDriver driver;
	public GuiLib gui;
	public RegisterPage rp;
	public RegisterStepDefinations(WebDriver driver) {
		gui = new GuiLib(driver);
		rp = new RegisterPage(driver);
	}
	
	
	
	@Given("User is on Register Page")
	public void user_is_on_register_page() {
		System.out.println("launch Chrom");
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe"); driver
		  = new ChromeDriver(); System.out.println("Enter URL for Free CRM APP");
		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		 
		
	}

	@When("Title of page is My Store")
	public void title_of_page_is_my_store() {
		String title = driver.getTitle();
		 System.out.println(title);
		Assert.assertEquals("My Store", title);

	}

	@When("Click on Sign In")
	public void click_on_sign_in() {
		rp.SignIn.click();

	}

	@When("Enter a Valid Email ID")
	public void enter_a_valid_email_id() {
		rp.email.sendKeys("sdfsfdfsdfgdf@gmai.com");

	}

	@When("Click on Create an Account")
	public void click_on_create_an_account() {
		rp.createAnAccount.click();

	}

	@When("Enter a Title")
	public void enter_a_title() {
		rp.mr.click();

	}

	@When("Enter First Name")
	public void enter_first_name() {
			rp.firstName.sendKeys("rtyrtyrty");

	}

	@When("Enter Last Name")
	public void enter_last_name() {
		rp.lastName.sendKeys("sdgfdsgd");

	}

	@When("Enter Password")
	public void enter_password() {
		rp.password.sendKeys("3535wrewerfsf");

	}

	@When("Date of Birth")
	public void date_of_birth() {


	}

	@When("Enter Company")
	public void enter_company() {


	}

	@When("Enter Address")
	public void enter_address() {


	}

	@When("Enter City")
	public void enter_city() {


	}

	@When("Enter State")
	public void enter_state() {


	}

	@When("Enter ZIP")
	public void enter_zip() {


	}

	@When("Enter Country")
	public void enter_country() {


	}

	@When("Enter Additional Details")
	public void enter_additional_details() {


	}

	@When("Enter Home Phone")
	public void enter_home_phone() {


	}

	@When("Enter Mobile Phone")
	public void enter_mobile_phone() {


	}

	@When("Click on Register")
	public void click_on_register() {


	}

	@Then("Verify User is Created")
	public void verify_user_is_created() {


	}
}
