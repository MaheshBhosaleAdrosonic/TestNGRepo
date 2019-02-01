package DemoTest.TestNGDemoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void getChorme() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		System.out.println("Browser Opened ");
		driver.close();
		System.out.println("Browser Closed ");
	}
}
