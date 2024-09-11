package Amazon.Project_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Select_Payment_Method_TestCases {
	
	WebDriver driver;
	@Test
	public void select_payment_method()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Select_Payment_Method spm = new Amazon_B2C_Select_Payment_Method(driver);
		spm.hv_link(driver);
		
		spm.click_singIn_link();
		
		spm.emailid_tf();
		spm.contiune_btn();
		spm.password_tf();
		spm.click_signIn_btn();
		spm.search_product();
		spm.click_first_product();
		
		Set<String>brwoser_ids=driver.getWindowHandles();
		Iterator<String> pAndc_id=brwoser_ids.iterator();
		String p_id = pAndc_id.next();
		String c_id = pAndc_id.next();
		driver.switchTo().window(c_id);
		
		spm.add_product_to_cart();
		spm.pro_buy();
		spm.del_add();
		spm.address_sel();
		spm.scel_cc();
		spm.net_sec();
		
		

}

}
