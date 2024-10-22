package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1HandelLinks {

	public static void main(String[] args) {
    
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
	List<WebElement> TotalElements=driver.findElements(By.tagName("a"));
	System.out.println("Total no of links in meesho homepage is: "+TotalElements.size());
	
	for (int i = 0; i < TotalElements.size(); i++) {
		
	System.out.println(TotalElements.get(i).getText());
		
		
		
		
	}
	
	
		
		
	}

}
