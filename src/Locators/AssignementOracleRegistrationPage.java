package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;public class AssignementOracleRegistrationPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.findElement(By.xpath("//*[@id='sView1:r1:0:email::content']")).sendKeys("sravs123@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:password']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:retypePassword']")).sendKeys("1234");
		
		
		
		
		
		
		

	}

}
