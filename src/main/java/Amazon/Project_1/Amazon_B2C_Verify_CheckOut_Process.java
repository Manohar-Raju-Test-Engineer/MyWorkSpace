package Amazon.Project_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Verify_CheckOut_Process {
	
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
	
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement choose_first_product;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addTo_cart_button;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_toBuy;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[3]")
	WebElement select_addrs;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement clik_useThis_addrs;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement cc_section;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement netBank_section;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[7]")
	WebElement cod_select;
	
	@FindBy(xpath="(//input[@class='a-button-input a-button-text'])[21]")
	WebElement useThisadd_ele;
	
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
		search_bar.sendKeys("shoes");
		search_bar.sendKeys(Keys.ENTER);
	}
	
	public void click_first_product()
	{
		choose_first_product.click();
	}
	
	public void add_product_to_cart(WebDriver driver)
	{		
		Set<String>brwoser_ids=driver.getWindowHandles();
		Iterator<String> pAndc_id=brwoser_ids.iterator();
		String p_id = pAndc_id.next();
		String c_id = pAndc_id.next();
		driver.switchTo().window(c_id);
		
		addTo_cart_button.click();		
	}
	
	public void pro_buy()
	{
		proceed_toBuy.click();
	}
	
	public void del_add()
	{
		select_addrs.click();
	}
	
	public void address_sel()
	{
		clik_useThis_addrs.click();
	}
	
	public void scel_cc()
	{
		cc_section.click();
	}
	
	public void net_sec()
	{
		netBank_section.click();
	}
	
	public void cod_selection()
	{
		cod_select.click();
	}
	
	public void click_Use_thisAddress()
	{
		useThisadd_ele.click();
	}
	
	
	
	//step3:
	public Amazon_B2C_Verify_CheckOut_Process(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
