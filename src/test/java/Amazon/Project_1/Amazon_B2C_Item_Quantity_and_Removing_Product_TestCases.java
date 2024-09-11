package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Item_Quantity_and_Removing_Product_TestCases {
	
	WebDriver driver;
	
	@Test
	public void adding_item_quantity_removing()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Amazon_B2C_Item_Quantity_and_Removing_Product addQuantity = 
		new Amazon_B2C_Item_Quantity_and_Removing_Product(driver);
		
		addQuantity.hoverOvering_singIn(driver);
		addQuantity.clicking_signIn();
		addQuantity.emailid_tf();
		addQuantity.contiune_btn();
		addQuantity.password_tf();
		addQuantity.click_signIn_btn();
		addQuantity.clickOn_cart();
		addQuantity.add_qty();
		addQuantity.delete_pro();
		
	}

}
