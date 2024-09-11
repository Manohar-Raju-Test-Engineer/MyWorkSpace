package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Check_Product_Add_To_Cart_TestCases {
	
	WebDriver driver;
	@Test
	public void amz_search_product_with_filters()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		
		Amazon_B2C_Check_Product_Add_To_Cart add_product = new Amazon_B2C_Check_Product_Add_To_Cart(driver);
		add_product.hv_link(driver);
		
		add_product.click_singIn_link();
		
		add_product.emailid_tf();
		add_product.contiune_btn();
		add_product.password_tf();
		add_product.click_signIn_btn();
		add_product.search_product();
		add_product.select_product();
		add_product.addTocart(driver);
		
		

}	

}
