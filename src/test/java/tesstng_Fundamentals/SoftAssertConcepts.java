package tesstng_Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertConcepts {
	static SoftAssert softassert = new SoftAssert();
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();

	@Test
	public static void launchBrowser () {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
//		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTile = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		softassert.assertEquals(actualTitle, expectedTile);
		softassert.assertAll();
		}
	
	@Test
	public static void signinclick() {
		softassert.assertEquals(driver.findElement(By.className("signin")).isEnabled(),false);
		softassert.assertAll();
	}

}
