package tesstng_Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {
	public static WebDriver driver;
	
	
	@BeforeMethod
	public static void begin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	}
	@Test
	public static void siginLinkClick()
	{
		WebElement signinlink = driver.findElement(By.xpath("//a[@class = 'signin']"));
		if(signinlink.isEnabled() == true) {
			signinlink.click();
						}
		else {
			System.out.println("The link is not working");
		}
		
	}
	@Test
	
	public void loginPage() {
		driver.findElement(By.xpath("//input[@id= 'login1']")).sendKeys("Seleniumpanada@rediffmail.com");
		
	}
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
	
}
