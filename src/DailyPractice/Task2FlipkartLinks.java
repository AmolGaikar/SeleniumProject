package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2FlipkartLinks {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    
    List<WebElement>  elements=driver.findElements(By.tagName("a"));
    System.out.println("No of links in flipkart homepage is: "+elements.size());  
    
    for (int i = 0; i < elements.size(); i++) {
    	
    	System.out.println(elements.get(i).getText());
		
	}
    
    
    
    
	}

}
