package OpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://kareclouds.com/");
		driver.manage().window().maximize();
		
	List<WebElement> TotalLinks=driver.findElements(By.tagName("a"));
	
	System.out.println("No of links in kareclouds homepage: "+TotalLinks.size());
	
	for (int i = 0; i <TotalLinks.size(); 
			i++) {
	
		System.out.println(TotalLinks.get(i).getText());
	
		
	}
		
	
	}
}	
	
	


