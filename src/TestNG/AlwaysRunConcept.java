package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlwaysRunConcept {
	public WebDriver driver;
	
	@Test
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	
	@Test(dependsOnMethods="setup")
	public void gotoUrl() {
	driver.get("https://www.saucedemo.com/");
	}
	
	@Test(dependsOnMethods="gotoUrl")
	public void type_UserName() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	Thread.sleep(2000);
	}
	
	//intentionally made this testcase failure by mentioning wrong Xpath,next testcases will sip because of this failure at this time we can mention always run
	@Test(dependsOnMethods="type_UserName()",alwaysRun=true)
	public void type_Password() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='Passwor']")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods="type_Password")
	public void clickLogin() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(2000);
	}

	@Test(dependsOnMethods="clickLogin")
	public void tearDown() {
	driver.close();
}
}