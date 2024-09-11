package Amazon.Project_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Verify_CheckOut_Process_TestCases {
	
	WebDriver driver;
	@Test
	public void verifying_checkout_process()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Amazon_B2C_Verify_CheckOut_Process verify_checkProcess = new Amazon_B2C_Verify_CheckOut_Process(driver);
		verify_checkProcess.hv_link(driver);
		
		verify_checkProcess.click_singIn_link();
		
		verify_checkProcess.emailid_tf();
		verify_checkProcess.contiune_btn();
		verify_checkProcess.password_tf();
		verify_checkProcess.click_signIn_btn();
		verify_checkProcess.search_product();
		verify_checkProcess.click_first_product();		
				
		verify_checkProcess.add_product_to_cart(driver);
		verify_checkProcess.pro_buy();
		verify_checkProcess.del_add();
		verify_checkProcess.address_sel();
		verify_checkProcess.scel_cc();
		verify_checkProcess.net_sec();
		verify_checkProcess.cod_selection();
		verify_checkProcess.click_Use_thisAddress();
	}
}

