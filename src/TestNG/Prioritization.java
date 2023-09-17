package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prioritization {
	public WebDriver driver;
	
	@Test(priority=1)
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	
	@Test(priority=2)
	public void gotoUrl() {
	driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=3)
	public void type_UserName() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void type_Password() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void clickLogin() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(2000);
	}

	@Test(priority=6)
	public void tearDown() {
	driver.close();
}
}