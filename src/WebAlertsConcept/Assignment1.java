package WebAlertsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Open test URL "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Switch into Frame
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		
		//Click on Tryit Button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		
		//Send the text into Alert
		driver.switchTo().alert().sendKeys("sravanthi");
		Thread.sleep(5000);
		
		//Accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//Get text displayed on page into console
		String alert=driver.findElement(By.xpath("//p[text()='Hello sravanthi! How are you today?']")).getText();
		System.out.println(alert);
		driver.close();;
	}

}
