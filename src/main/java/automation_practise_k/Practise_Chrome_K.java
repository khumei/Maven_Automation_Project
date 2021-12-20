package automation_practise_k;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise_Chrome_K {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static WebDriverWait wait;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		}
	
	
	
}
