package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import mydemoPackage1.System;

public class Assignment1 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		driver.manage().window().maximize();
        String urlName=driver.getCurrentUrl();
        System.out.println(urlName);
		Thread.sleep(5000);
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		
		// launch Browser & GetUrl & navigate Other page & close window
		
		
		
		
		
		
		
		

	}

}
