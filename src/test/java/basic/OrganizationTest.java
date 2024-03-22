package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {
	@Test
	public void CreateOrganizationTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Login to application
		driver.get("http://localhost:8888/");
		
		//Login to application
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
	}
}
							