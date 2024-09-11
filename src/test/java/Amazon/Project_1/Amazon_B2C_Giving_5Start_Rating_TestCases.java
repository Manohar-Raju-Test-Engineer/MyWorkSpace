package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon_B2C_Giving_5Start_Rating_TestCases {
	
	WebDriver driver;
	@Test
	public void giving_5Star_review()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Giving_5Start_Rating givingReview = new Amazon_B2C_Giving_5Start_Rating(driver);
		givingReview.hv_link(driver);
		
		givingReview.click_singIn_link();
		
		givingReview.emailid_tf();
		givingReview.contiune_btn();
		givingReview.password_tf();
		givingReview.click_signIn_btn();
		givingReview.goTo_orders();		
		givingReview.orders();
		givingReview.write_revi();
		givingReview.star();
		
		
	}
}
