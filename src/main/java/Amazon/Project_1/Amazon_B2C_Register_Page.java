package Amazon.Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Register_Page {
	
	//WebDriver driver;
	//Step1:
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement hover_over_signin_ele;
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement click_start_here_link;
	
	@FindBy(xpath="//a[@class='a-link-emphasis']")
	WebElement click_already_have_an_account;
	
	@FindBy(id="ap_email")
	WebElement mailid_ele;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti_btn_ele;
	
	@FindBy(id="ap_password")
	WebElement pass_ele;
	
	@FindBy(id="signInSubmit")
	WebElement sigin_btn_ele;
	
	

	
	
	//Step2:
	public void hv_on_sigIn_link(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover_over_signin_ele).perform();		
			
	}
	
	public void start_here()
	{
		click_start_here_link.click();
	}
	
	public void click_singIn()
	{
		click_already_have_an_account.click();
	}
	
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
	
	//step3:	
	public Amazon_B2C_Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
