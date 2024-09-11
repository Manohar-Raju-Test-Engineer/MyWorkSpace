package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Product_Page_Sorted_Details_TestCases {
	
	WebDriver driver;
	@Test
	public void sorting_product()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Product_Page_Sorted_Details srh1_prod = new Amazon_B2C_Product_Page_Sorted_Details(driver);
		srh1_prod.hv_link(driver);
		
		srh1_prod.click_singIn_link();
		
		srh1_prod.emailid_tf();
		srh1_prod.contiune_btn();
		srh1_prod.password_tf();
		srh1_prod.click_signIn_btn();
		srh1_prod.search_product();
		srh1_prod.sel_dd();

	}
}


