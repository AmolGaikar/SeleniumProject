package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebdriver {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"https://practicetestautomation.com/courses/\"]")).click();
		Thread.sleep(1000);
		driver.close();
		
		

	}

}
