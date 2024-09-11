package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Search_Product_TestCases {
	WebDriver driver;
	@Test
	public void amz_search_product()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Search_Product srh_prod = new Amazon_B2C_Search_Product(driver);
		srh_prod.hv_link(driver);
		
		srh_prod.click_singIn_link();
		
		srh_prod.emailid_tf();
		srh_prod.contiune_btn();
		srh_prod.password_tf();
		srh_prod.click_signIn_btn();
		srh_prod.search_product();
		
		
	}
	
}
