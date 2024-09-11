package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_B2C_Login_With_Incorrect_Details_TestCases {
	
	

	WebDriver driver;
	@Test
	public void login_To_amazon_with_wrong_details()
	{
		driver = new ChromeDriver();  
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742234347%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8066717558620067329%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007799%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		Amazon_B2C_Login_With_Incorrect_Details amz_wd = new Amazon_B2C_Login_With_Incorrect_Details(driver);
		amz_wd.emailid_tf();
		amz_wd.contiune_btn();
		amz_wd.password_tf();
		amz_wd.click_signIn_btn();
		
		
	}

}
