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
	@FindBy(css="i.fb_logo")
	WebElement logo;
	
	//Header1 Page Text: share what's new
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[1]/div[1]/div[2]/span[1]")
	WebElement pageHeader1;
	
	//Header2 Page Text: See photos and updates
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[1]/div[1]/div[2]/span[1]")
	WebElement pageHeader2;
	
	//Header3 Page Text: Find more
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[1]/div[3]/div[2]/span[1]")
	WebElement pageHeader3;
	
	//email
	@FindBy(xpath="//input[@name='email']")
	 WebElement email;
	
	//password
	@FindBy(xpath="//input[@name='pass']")
	 WebElement password;
	
	//submit
	@FindBy(css="#u_0_2")
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
