package Amazon.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Edit_Profile {
	
	WebDriver driver;
	//step1:
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement hover_over_signin_ele;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signIn_link;
	
	@FindBy(id="ap_email")
	WebElement mailid_ele;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti_btn_ele;
	
	@FindBy(id="ap_password")
	WebElement pass_ele;
	
	@FindBy(id="signInSubmit")
	WebElement sigin_btn_ele;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement hover_over_signin_ele1;
	
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement manage_profile_link;
	
	@FindBy(xpath="//a[.='View']")
	WebElement view_link;
	
	@FindBy(xpath="//span[@class='editProfile']") 
	WebElement edit_uname;
	 
	
	//step2:	
	public void hv_link(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover_over_signin_ele).perform();
	}
	
	public void click_singIn_link()
	{
		signIn_link.click();
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
	}
	
	public void hv_link1(WebDriver driver) 
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hover_over_signin_ele1).perform();
		
	}
	
	public void click_manage_profile() 
	{
		manage_profile_link.click();
		
	}
	
	public void clcik_view_link()
	{
		view_link.click();
	}
	
	public void click_uname_icon()
	{
		edit_uname.click();
	}
	
	
	
	//step3:
	public Amazon_B2C_Edit_Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
