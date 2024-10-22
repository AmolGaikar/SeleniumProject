package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLinkshandling {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	List<WebElement>ele=driver.findElements(By.tagName("a"));
	System.out.println("No of links inside amazon page are: "+ele.size());
	
	for (int i = 0; i <ele.size(); i++) {
		
		System.out.println(ele.get(i).getText());
		
	}
	}

}
