package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SemeniumMethods {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
	    String	Data=driver.getTitle();
	    System.out.println(Data);
		
	   String Url=driver.getCurrentUrl();
	   System.out.println(Url);
	   
	  String page=driver.getPageSource();
	  System.out.println(page);
	  
	 String WindowID=driver.getWindowHandle();
	 System.out.println(WindowID);
	 
	List<WebElement> Links=driver.findElements(By.tagName("a"));
	
	System.out.println("No of links are: "+Links.size());
	
	for (int i = 0; i<Links.size(); i++)
	{
		
	System.out.println(Links.get(i).getText());	
	
	}

}
}
