package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FB_LandingPage {
	
	//initialize driver;
	public FB_LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Page Objects-------------
		
	//FacebookLogo
	//@FindBy(xpath = "[class='fb_logo img sp_X-9DNUJiWfS sx_6b1cd1']")
	@FindBy(css="a[title='Go to Facebook Home']")
	WebElement logo;
	
	//Header1 Page Text: See photos and updates 
	@FindBy(css="div:nth-child(2) > div._6a._6b.product_desc > span.mtl._3ma._6p._6s._6v")
	WebElement pageHeader1;
	
	//Header2 Page Text: Share what's new
	@FindBy(css="div:nth-child(3) > div._6a._6b.product_desc > span.mtl._3ma._6p._6s._6v")
	WebElement pageHeader2;
	
	//Header3 Page Text: Find more
	@FindBy(css="div:nth-child(4) > div._6a._6b.product_desc > span.mtl._3ma._6p._6s._6v")
	WebElement pageHeader3;
	
	//email
	@FindBy(xpath="//input[@name='email']")
	 WebElement email;
	
	//password
	@FindBy(xpath="//input[@name='pass']")
	 WebElement password;
	
	//submit
	@FindBy(css="input[data-testid='royal_login_button']")
	WebElement submit;
	
	
	//Get Objects----------------
	
	public WebElement getLogo() {
		return logo;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement GetPageHeader1() {
		return pageHeader1;
	}
	
	public WebElement GetPageHeader2() {
		return pageHeader2;
	}
	
	public WebElement GetPageHeader3() {
		return pageHeader3;
	}
	

}
