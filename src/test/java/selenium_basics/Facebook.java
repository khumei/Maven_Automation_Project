package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Tony");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Pony");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("test@test.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("test@test.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("test@test.com");
		Thread.sleep(1000);
		
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("11");
		
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Feb");
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1989");
		

	}

}
