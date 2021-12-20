package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Homework {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		/*
		 * //*XPATH SIGN IN 01
		 */		
//		 driver.findElement(By.xpath("//a[@class = 'signin']")).click();
//		 driver.findElement(By.xpath("//input[@id= 'login1']")).sendKeys("Seleniumpanada@rediffmail.com");
//		 driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("Selenium@123");
//		 driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		 driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		
		/*
		 * //*XPATH SIGN IN 02
		 */		
//		driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
//		driver.findElement(By.xpath("//input[@name= 'login']")).sendKeys("Seleniumpanada@rediffmail.com");
//		driver.findElement(By.xpath("//input[@name= 'passwd']")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[@class= 'signinbtn']")).click();
//		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		
			
		/*
		 * //XPATH SIGN IN 03
		 */		
//		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
//		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("Seleniumpanada@rediffmail.com");
//		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
//		driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
		
		/*
		 * //XPATH SIGN IN 04
		 */
//		driver.findElement(By.xpath("//a[starts-with(@class, 'signin')]")).click();
//		driver.findElement(By.xpath("//input[starts-with(@id, 'login1')]")).sendKeys("Seleniumpanada@rediffmail.com");
//		driver.findElement(By.xpath("//input[starts-with(@id, 'password')]")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[starts-with(@name,'proceed)']")).click();
//		driver.findElement(By.xpath("//a[starts-with(@class,'rd_logout')]")).click();
		
		/*
		 * //*XPATH SIGN IN 05
		 */		
//		driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[1]")).click();
//		driver.findElement(By.xpath("//div[@class= 'cell']/child::input[@id='login1']")).sendKeys("Seleniumpanada@rediffmail.com");
//		driver.findElement(By.xpath("//div[@class= 'cell']/child::input[@id='password']")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//div[@class= 'cell']/child::input[@class='signinbtn']")).click();
//		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();

		/*
		 * //*cssSelectors SIGN IN
		 */		
//		 driver.findElement(By.xpath("//a[@class = 'signin']")).click();
//		 driver.findElement(By.xpath("//input[@id= 'login1']")).sendKeys("Seleniumpanada@rediffmail.com");
//		 driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("Selenium@123");
//		 driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		 driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		
		/*
		 * //*cssSelectors SIGN IN 02
		 */		
//		driver.findElement(By.cssSelector("a[class=signin]")).click();
//		driver.findElement(By.cssSelector("input[id= login1")).sendKeys("seleniumpanda@rediffmail.com");
//		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Selenium@123");
//		driver.findElement(By.cssSelector("input[class = signinbtn]")).click();
//		driver.findElement(By.cssSelector("div.setting_rd>a.rd_logout")).click();
		
	}
	

}
