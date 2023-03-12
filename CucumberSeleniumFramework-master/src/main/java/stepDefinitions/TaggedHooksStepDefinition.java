package stepDefinitions;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TaggedHooksStepDefinition {
	public WebDriver driver;
	@Before(order=0)
	public void setUP(){
		
		/*
		 * System.out.println("launch Chrom");
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe"); driver
		 * = new ChromeDriver(); System.out.println("Enter URL for Free CRM APP");
		 * driver.get("http://automationpractice.com/index.php");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.manage().window().maximize();
		 */
	}

	@After(order=0)
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	/*
	 * @Before(order=1) public void setUP1(){ System.out.println("launch FF");
	 * System.out.println("Enter URL for Free CRM APP"); }
	 */

	@After(order=1)
	public void tearDown1(){
		System.out.println("close the browser");
	}
	
	
	/*
	 * @Before("@First") public void beforeFirst(){
	 * System.out.println("before only first scenario"); }
	 * 
	 * @After("@First") public void afterFirst(){
	 * System.out.println("after only first sceanrio"); }
	 * 
	 * @Before("@Second") public void beforeSecond(){
	 * System.out.println("before only second scenario"); }
	 * 
	 * @After("@Second") public void afterSecond(){
	 * System.out.println("after only second sceanrio"); }
	 * 
	 * @Before("@Third") public void beforeThird(){
	 * System.out.println("before only third scenario"); }
	 * 
	 * @After("@Third") public void afterThird(){
	 * System.out.println("after only third sceanrio"); }
	 */
	
			
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("1st stepsdfsdfsdf");
		
	}
	@Given("^this is the first step1$")
	public void this_is_the_first_step1() throws Throwable {
		System.out.println("1st stepsdfsdfsdf");
		Assert.assertEquals(true,false);
	}
	
	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("2nd step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("3rd step");
	}
	
	
	

}
