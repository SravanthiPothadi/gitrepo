package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFBRegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		//TC-1 Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//TC-2 Goto FB registration page
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement firstName1=driver.findElement(By.name("firstname"));
		//TC-3 Fill FirstName with Input
		firstName1.sendKeys("SRAVANTHI");
		Thread.sleep(2000);
		
		//TC-4 Clear Input from FirstName textBox ("Clear text")
		firstName1.clear();
		Thread.sleep(2000);
		
		//TC-5 Again Fill FirstName with Input
		firstName1.sendKeys("SRAVANTHI");
		Thread.sleep(2000);
		
		//TC-6 Get the input from TextBox and display it in console ('Get Attribute')
		String getNameInConsole=firstName1.getAttribute("value");
		System.out.println(getNameInConsole);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		

	}

}
