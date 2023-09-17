package HandleMultipeTabs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Learn more")).click();
		Thread.sleep(2000);
	//Handle Tabs (ArrayList)
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		
	//Swith from 0 tab to 1st tab
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
	
	//Get text  into console
		String getTheText=driver.findElement(By.linkText("Using Facebook")).getText();
		System.out.println(getTheText);
		Thread.sleep(2000);
		
	//Swith from 1 tab to 0 tab
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		driver.close();
		
	//Swith from 0 tab to 1st tab
				driver.switchTo().window(tabs.get(1));
				Thread.sleep(2000);
		
		driver.close();
		
		
		
		

	}

}
