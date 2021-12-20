package chromeoptionsconcepts;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_O {

	public static SoftAssert softassert = new SoftAssert();
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		driver = new ChromeDriver (options);
		driver.get("https://rediff.com");
		
		
	}

}
