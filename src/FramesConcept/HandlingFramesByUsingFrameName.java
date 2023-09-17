package FramesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class HandlingFramesByUsingFrameName {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(2000);
		
		//Handling frame Using Frame Name )
		//Switch to 1st frame 
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Switch to 2nd frame
		//for that we need to come to defualt frame and then switch to 2 nd frmae
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		Thread.sleep(2000);
		
		//Click on Alert
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		
		String getName=driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();
		System.out.println(getName);
		
		

	}

}
