package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Check_Adding_Coupon_Code_TestCases {
	
	@Test
	public void adding_coupon_code_while_ordering()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		Amazon_B2C_Check_Adding_Coupon_Code addingccode = 
				new Amazon_B2C_Check_Adding_Coupon_Code(driver);
		
		addingccode.hoverOveringTheElement(driver);
		addingccode.clickSingIn();
		addingccode.emailid_tf();
		addingccode.contiune_btn();
		addingccode.password_tf();
		addingccode.click_signIn_btn();
		addingccode.searchtheProduct();
		addingccode.select_the_product();
		addingccode.add_prod_to_cart();
		addingccode.procedToBuyproduct();
		addingccode.selecting_delivery_address();
		addingccode.useThisAddress();
		/*
		 * addingccode.couponCodeApply(); addingccode.apply_couponCode();
		 */
		//addingccode.amz_pay_bal();
	}

}
