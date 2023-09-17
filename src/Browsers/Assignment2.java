package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		/* TC1 : Launch Chrome browser;
		  TC2: Go to Test URL https://www.google.com
		  TC3: Navigate to test URL https://www.gmail.com
		 * TC4: Navigate back to Test Url https://www.google.com
		 * TC5: Navigate one step forward to https://www.gmail.com
		 * TC6: Refresh the Current page
		 * TC7: Close the Browser */
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		driver.close();
		

	}

}