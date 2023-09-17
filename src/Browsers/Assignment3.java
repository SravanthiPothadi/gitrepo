package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		String urlname=driver.getCurrentUrl();
		System.out.println(urlname);
		driver.close();

		
		
		
	/*TC1: Launch Chrome Browser
	       TC2: Goto Test url https://www.google.com/
		   TC3:  Specify wait time for 5 sec
		   TC4:  Get the Title of page
		   TC5:  Minimize browser 
		   TC 6: Maximize browser
		   TC7: Get current URL
		   TC8: Close the Browser */
	}

}