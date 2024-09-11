package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Search_Product_Using_Filters_TestCases {
	
	WebDriver driver;
	@Test
	public void amz_search_product_with_filters()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Search_Product_Using_Filters srh_prod_filters = new Amazon_B2C_Search_Product_Using_Filters(driver);
		srh_prod_filters.hv_link(driver);
		
		srh_prod_filters.click_singIn_link();
		
		srh_prod_filters.emailid_tf();
		srh_prod_filters.contiune_btn();
		srh_prod_filters.password_tf();
		srh_prod_filters.click_signIn_btn();
		srh_prod_filters.search_product();
		srh_prod_filters.filter_the_product();

}
}
