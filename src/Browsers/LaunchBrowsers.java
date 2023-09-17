package Browsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriverManager.chromedriver().setup();
		WebDriver driver= new EdgeDriver(); 
		driver.get("https://www.google.com/");
		Thread.sleep(5000);  
		driver.close();
		
		//WebDriverManager.chromedriver().setup();

	}

}
