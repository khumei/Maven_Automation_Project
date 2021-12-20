package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Opening_FireFox {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Khurram Afzal");
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("KhurramAfzal");
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Khurram Afzal");
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("KhurramAfzal");
		driver.findElement(By.xpath("//select[(@id='country')]")).sendKeys("canada");
	}

}
