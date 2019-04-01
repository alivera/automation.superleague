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
	
	//Tutorial:: Selector Styles
		//driver.findElement(By.xpath("//li[text()=' Selenium ']"))'
		//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]"));
		//driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	
	
	//Page Objects-------------
		
	//FacebookLogo
	//@FindBy(xpath = "[class='fb_logo img sp_X-9DNUJiWfS sx_6b1cd1']")
	@FindBy(xpath = "//i[contains(@class, 'fb_logo')]")
	WebElement logo;
	
	//Header1 Page Text
	@FindBy(css = ".pbm:nth-child(2) ._3ma")
	WebElement pageHeader1;
	
	//Header2 Page Text
	@FindBy(css = ".pbm:nth-child(3) ._3ma")
	WebElement pageHeader2;
	
	//Header3 Page Text
	@FindBy(css = ".pbm:nth-child(4) ._3ma")
	WebElement pageHeader3;
	
	//email
	@FindBy(xpath = "//html[@id='facebook']//input[@id='email']")
	 WebElement email;
	
	//password
	@FindBy(xpath = "//html[@id='facebook']//input[@id='pass']")
	 WebElement password;
	
	//submit
	@FindBy(xpath = "//html[@id='facebook']//label[@id='loginbutton']")
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
	
	public WebElement pageHeader1() {
		return pageHeader1;
	}
	
	public WebElement pageHeader2() {
		return pageHeader2;
	}
	
	public WebElement pageHeader3() {
		return pageHeader3;
	}
	

}
