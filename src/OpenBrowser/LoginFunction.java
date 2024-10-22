package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFunction {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		
	int	totalnooflinks=driver.findElements(By.tagName("a")).size();
	System.out.println("Total no of links are:"+totalnooflinks);
		
		
	}
	} 
		