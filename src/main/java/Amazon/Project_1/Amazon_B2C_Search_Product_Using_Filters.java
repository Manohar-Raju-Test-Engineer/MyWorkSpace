package Amazon.Project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Search_Product_Using_Filters {
	
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
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_bar;
	
	@FindBy(xpath="//span[.='Under ₹500']")
	WebElement under500_ele;
	
		
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
	
	public void search_product()
	{
		search_bar.click();
		search_bar.sendKeys("shoes");
		search_bar.sendKeys(Keys.ENTER);
	}
	
	public void filter_the_product()
	{
		under500_ele.click();
	}
	
	//step3:
	public Amazon_B2C_Search_Product_Using_Filters(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
