package Amazon.Project_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_B2C_Register_Page_TestCases {
	
	WebDriver driver;
	@Test
	public void amazon_registration() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Amazon_B2C_Register_Page regPage = new Amazon_B2C_Register_Page(driver);
		regPage.hv_on_sigIn_link(driver);
		regPage.start_here();
		regPage.click_singIn();
		
		regPage.emailid_tf();
		regPage.contiune_btn();
		regPage.password_tf();
		regPage.click_signIn_btn();
		
		
	}

}
