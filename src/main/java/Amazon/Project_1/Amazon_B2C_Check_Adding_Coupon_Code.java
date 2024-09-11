package Amazon.Project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Check_Adding_Coupon_Code {
	
	//adding coupon code while ordering the product
	
	//Step1:
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement hoverOver_ele;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement sigin_ele;
	
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
	
	@FindBy(xpath="//div[@class='_bGlmZ_itemImage_1kTKp _bGlmZ_expandedItemImageT1_23GyI']")
	WebElement select_product_ele;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addTocart_ele;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proces_to_buy_ele;
	
	@FindBy(xpath="(//div[@class='a-row address-row'])[2]")
	WebElement delever_address_ele;
	
	@FindBy(xpath="//span[@id='shipToThisAddressButton']")
	WebElement use_this_address_ele;
	
	
	 @FindBy(xpath="//input[@id='pp-4bsZvx-101']") 
	 WebElement	 coupon_code_text_ele;
	 
	
	
	  @FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']") 
	  WebElement  apply_btn_ele;
	 
	
	//@FindBy(xpath="//input[@id='pp-WcWB3w-100']")
	//WebElement use_amazon_pay_ele;
	
	//step2:
	public void hoverOveringTheElement(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOver_ele).perform();
	}
	
	public void clickSingIn()
	{
		sigin_ele.click();
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
	
	public void searchtheProduct()
	{
		search_bar.sendKeys("shoes");
		search_bar.sendKeys(Keys.ENTER);
	}
	
	public void select_the_product()
	{
		select_product_ele.click();
	}
	
	public void add_prod_to_cart()
	{
		addTocart_ele.click();
	}
	
	public void procedToBuyproduct()
	{
		proces_to_buy_ele.click();
	}
	
	public void selecting_delivery_address()
	{
		delever_address_ele.click();
	}
	
	public void useThisAddress()
	{
		use_this_address_ele.click();
	}
	
	
	 public void couponCodeApply() 
	 { 
		 coupon_code_text_ele.sendKeys("MANO");
	 }
	
	
	 public void apply_couponCode() 
	 { 
		 apply_btn_ele.click(); 
	 }
	 
	
	//public void amz_pay_bal()
	//{
		//use_amazon_pay_ele.click();
	//}
	
	//step3:
	public Amazon_B2C_Check_Adding_Coupon_Code(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
