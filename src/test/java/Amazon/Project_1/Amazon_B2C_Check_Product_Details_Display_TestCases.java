package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Check_Product_Details_Display_TestCases {
	
	WebDriver driver;
	@Test
	public void amz_search_product_with_filters()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Check_Product_Details_Display prod_details1 = new Amazon_B2C_Check_Product_Details_Display(driver);
		prod_details1.hv_link(driver);
		
		prod_details1.click_singIn_link();
		
		prod_details1.emailid_tf();
		prod_details1.contiune_btn();
		prod_details1.password_tf();
		prod_details1.click_signIn_btn();
		prod_details1.search_product();
		
		prod_details1.click_first_product();
		prod_details1.check_price_visible();
		

}

}
