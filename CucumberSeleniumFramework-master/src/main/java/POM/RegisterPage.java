package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public WebDriver driver;
	public RegisterPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(@title,'Log in to your customer account')]")
	public WebElement SignIn;

	@FindBy(xpath = "//input[@id='email_create']")
	public WebElement email;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	public WebElement createAnAccount;

	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement mr;

	@FindBy(xpath = "//input[@id='id_gender2']")
	public WebElement mrs;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement password;

	@FindBy(xpath = "//select[@name='days']")
	public WebElement days;

	@FindBy(xpath = "//select[@name='months']")
	public WebElement months;

	@FindBy(xpath = "//select[@name='years']")
	public WebElement years;

	@FindBy(xpath = "//input[@name='company']")
	public WebElement company;

	@FindBy(xpath = "//input[@name='address1']")
	public WebElement address1;

	@FindBy(xpath = "//input[@name='address2']")
	public WebElement address2;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;

	@FindBy(xpath = "//select[@name='id_state']")
	public WebElement state;

	@FindBy(xpath = "//input[@name='postcode']")
	public WebElement zip;

	@FindBy(xpath = "//select[@name='id_country']")
	public WebElement country;

	@FindBy(xpath = "//input[@name='phone_mobile']")
	public WebElement mobile;


	@FindBy(xpath = "//button[@id='submitAccount']")
	public WebElement register;

}
