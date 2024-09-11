package Amazon.Project_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_B2C_Reach_Add_To_Cart_Page_WO_Login {
//Reach Add to cart without Login
	
	WebDriver driver;
	//Step1:
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_bar;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement first_pro_ele;
	
	@FindBy(xpath="//span[@id='dealsx_atc_btn']")
	WebElement addTo_cart_button;
	
	
	//step2:
	public void search_product()
	{
		search_bar.sendKeys("shoes");
		search_bar.sendKeys(Keys.ENTER);
	}
	
	public void clicking_first_product()
	{
		first_pro_ele.click();
	}
	
	public void add_product_to_cart()
	{		
		addTo_cart_button.click();		
	}
	
	
	//step3:
	public Amazon_B2C_Reach_Add_To_Cart_Page_WO_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
