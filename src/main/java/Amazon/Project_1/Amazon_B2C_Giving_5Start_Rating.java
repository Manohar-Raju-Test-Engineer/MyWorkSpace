package Amazon.Project_1;

	import java.util.List;

import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class Amazon_B2C_Giving_5Start_Rating {
		
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
		
		@FindBy(xpath="(//span[@class='nav-line-1'])[2]")
		WebElement click_orders;
		
		@FindBy(xpath="//select[@id='time-filter']")
		WebElement click_ur_orders;
		
		@FindBy(xpath="//a[@id='Write-a-product-review_2']")
		WebElement write_review;
		
		@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
		WebElement give_star;
		
				
			
			
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
		
		public void goTo_orders()
		{
			click_orders.click();
		}
		
		public void orders()
		{
			
			
			Select s1 = new Select(click_ur_orders);
			s1.selectByIndex(2);		
		}
		
		public void write_revi()
		{
			write_review.click();
		}
		
		public void star()
		{
			give_star.click();
		}
		
		
		
		
		//step3:
		public Amazon_B2C_Giving_5Start_Rating(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
