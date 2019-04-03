package testcases;
import org.testng.annotations.Test;
import pageobjects.SignUpPage_Login_PF;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import resources.Setup;

public class SignUpPage_Login_Test extends Setup {
	
	@Test(dataProvider = "getData")
	public void LoginToAccount(String url, String email, String password) throws IOException {
	
		//initialize
		SignUpPage_Login_PF login = new SignUpPage_Login_PF(driver);
		driver.get(url);
		Log.info("Opening Page: " + driver.getTitle());
		
		//begin test		
		login.getEmail().click();
		Log.info("Email textbox is clicked");
		
		login.getEmail().sendKeys(email);
		Log.info("email: " + email + " is sent");
		
		login.getPassword().click();
		Log.info("Login Button is displayed");
		
		login.getPassword().sendKeys(password);
		Log.info("password: " + password + " is sent");
		
		login.getSubmit().click();
		Log.info("Submit Button is clicked");
	}
	
	//login using two users. First case is invalid, second case is valid.
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		
		//first test invalid login
		data[0][0] = "https://www.superleague.com/login/";
		data[0][1] = "failedtest@gmail.com";
		data[0][2] = "12345678";
		
		//second test valid login
		data[1][0] = "https://www.superleague.com/login/";
		data[1][1] = "buffboyali@gmail.com";
		data[1][2] = "messenger";	
		
		return data;
	}
	
}
