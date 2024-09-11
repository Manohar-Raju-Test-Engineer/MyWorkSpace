package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Edit_Profile_TestCases {
	
	@Test
	public void amazon_edit_profile()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Amazon_B2C_Edit_Profile abep = new Amazon_B2C_Edit_Profile(driver);
		abep.hv_link(driver);
		abep.click_singIn_link();
		
		
		abep.emailid_tf();
		abep.contiune_btn();
		abep.password_tf();
		abep.click_signIn_btn();
		abep.hv_link1(driver);
		abep.click_manage_profile();
		abep.clcik_view_link();
		abep.click_uname_icon();
	}
	
	
	
}
