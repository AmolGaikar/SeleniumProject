package HandelLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task1Getcountoflinks {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
   List<WebElement> NoOfinputs=driver.findElements(By.tagName("input"));
   
   System.out.println("No of links in a flipkartHomepage: "+NoOfinputs.size());
   
    
    
	}
}
	
	
	
	
	

     