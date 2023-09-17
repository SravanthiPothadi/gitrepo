package WebAlertsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Open test URL "https://http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm"
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Switch into 0 Frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		//Click on Tryit Button
		String alert1=driver.findElement(By.xpath("//p[text()='You've found my HTML tutorial site, which is    my final year computing project. ']")).getText();
		System.out.println(alert1);
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
