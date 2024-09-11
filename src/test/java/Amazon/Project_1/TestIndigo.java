package Amazon.Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestIndigo {
	
	@Test
	public void setUp()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.switchTo().alert().dismiss();
		driver.manage().window().maximize();
		
	}

}
