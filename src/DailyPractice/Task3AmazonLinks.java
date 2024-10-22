package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3AmazonLinks {

	public static void main(String[] args) {
   
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	List<WebElement>Elements=driver.findElements(By.tagName("a"));
	
	System.out.println("No of links in Amazon homepage is: "+Elements.size());
	
	for (int i = 0; i < Elements.size(); i++) {
		
		System.out.println(Elements.get(i).getText());
		
	
	
	//System.out.println(driver.findElement(By.id("nav-top")).getText());
		
	}

}
}