package Amazon.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_B2C_Item_Quantity_and_Removing_Product {
	//Test updating item quantities and removing items from the cart
	
	//step1
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement hoverOver_ele;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signIn_ele;
	
	@FindBy(id="ap_email")
	WebElement mailid_ele;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti_btn_ele;
	
	@FindBy(id="ap_password")
	WebElement pass_ele;
	
	@FindBy(id="signInSubmit")
	WebElement sigin_btn_ele;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement cart_ele;
	
	@FindBy(xpath="//select[@name='quantity']")
	WebElement qty_dd_ele;
	
	@FindBy(xpath="//span[@data-action ='delete']/span/input")
	WebElement dlt_ele;
	
	
	
	//step2
	public void hoverOvering_singIn(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOver_ele).perform();
	}
	
	public void clicking_signIn()
	{
		signIn_ele.click();
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
	
	public void clickOn_cart()
	{
		cart_ele.click();
	}
	
	public void add_qty()
	{
		Select s1 = new Select(qty_dd_ele);
		s1.selectByIndex(2);
		
	}
	
	public void delete_pro()
	{
		dlt_ele.click();
	}
	
	
	//step3:
	public Amazon_B2C_Item_Quantity_and_Removing_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
