package Amazon.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amazon_B2C_Login_Page {
	
	WebDriver driver;
	//Step1:	
	@FindBy(id="ap_email")
	WebElement mailid_ele;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti_btn_ele;
	
	@FindBy(id="ap_password")
	WebElement pass_ele;
	
	@FindBy(id="signInSubmit")
	WebElement sigin_btn_ele;
	
	
	//Step2:	
	public void emailid_tf()
	{
		mailid_ele.sendKeys("manoharraj30@gmail.com");
	}
	
	public void contiune_btn()
	{
		conti_btn_ele.click();
	}
	
	public void password_tf()
	{
		pass_ele.sendKeys("Prime@123");
	}
	
	public void click_signIn_btn()
	{
		sigin_btn_ele.click();
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		//Reporter.log("Login with correct crediential is pass");
	}
	
	//step3: creating contstructor for the class Amz_Login use PageFatoryclass
	public Amazon_B2C_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
