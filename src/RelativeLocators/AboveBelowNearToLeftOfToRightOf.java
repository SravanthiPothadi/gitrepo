 package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AboveBelowNearToLeftOfToRightOf {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
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
	    
		//Relative Locators : when we are not able to find address of web element, will create indirect address for it by using RL
	    //Above/Below/NearTo/ToLeftOf/ToRightOf
		//Above:: By emailLocator = RelativeLocator.with(By.tagName("input")).below(By.id("password"));
	    
		By FemaleRB=RelativeLocator.with(By.tagName("input")).below(By.name("birthday_day"));
		driver.findElement(FemaleRB).click();
		Thread.sleep(3000);
		
		//Below:: By emailLocator = RelativeLocator.with(By.tagName("input")).below(By.id("password"));
		
		By maleRB= RelativeLocator.with(By.tagName("input")).below(By.name("birthday_month"));
		driver.findElement(maleRB).click();
		Thread.sleep(3000);
		
		
		//ToRightOf: By submitLocator = RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"));
		
		/*By customRB=RelativeLocator.with(By.tagName("input")).toRightOf(maleRB);
		driver.findElement(customRB).click();
		Thread.sleep(3000);*/
		
		//ToRightOf: By submitLocator = RelativeLocator.with(By.tagName("button")).toLefttOf(By.id("cancel"));
		
		/*		By maleRB1=RelativeLocator.with(By.tagName("input")).toLeftOf(customRB);
				driver.findElement(maleRB1).click();
				Thread.sleep(3000);*/
						
				
		//Nearer: By submitLocator = RelativeLocator.with(By.tagName("button")).toLefttOf(By.id("cancel"));
		//GetText
			
				By plainText=RelativeLocator.with(By.tagName("p")).near(maleRB);
				String text=driver.findElement(plainText).getText();
				System.out.println(text);
		driver.close();
		
		
	

	}

}
