package Amazon.Project_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Reach_Add_To_Cart_Page_WO_Login_TestCases {
	
	WebDriver driver;
	@Test
	public void reachAddtoCart() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Amazon_B2C_Reach_Add_To_Cart_Page_WO_Login reach_to_cart 
		= new Amazon_B2C_Reach_Add_To_Cart_Page_WO_Login(driver);
		reach_to_cart.search_product();
		
		//clicking first product 
		reach_to_cart.clicking_first_product();
		
		Set<String>brwoser_ids=driver.getWindowHandles();
		Iterator<String> pAndc_id=brwoser_ids.iterator();
		String p_id = pAndc_id.next();
		String c_id = pAndc_id.next();
		driver.switchTo().window(c_id);
		
		reach_to_cart.add_product_to_cart();
		
		
	}

}
