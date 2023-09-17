package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateFBUsingLocatorsEdge {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("sravanthi");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Reddy");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("sravanthip1234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sravanthip1234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
		Thread.sleep(3000);
	    Select day=new Select(driver.findElement(By.id("day")));
	    day.selectByValue("21");
	    Select month=new Select(driver.findElement(By.id("month")));
	    month.selectByVisibleText("Aug");
	    Select year=new Select(driver.findElement(By.id("year")));
	    year.selectByValue("2020");
	    driver.close();

	}

}
