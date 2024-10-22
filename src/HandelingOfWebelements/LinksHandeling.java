package HandelingOfWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksHandeling {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.mercurytravels.co.in/");
    driver.manage().window().maximize();
    
    List<WebElement> elements=driver.findElements(By.tagName("a")); // elements its a collection name
    // To get the count of links we use size(); method
     System.out.println("No of Links Inside the page is: "+elements.size());
     // How to get names of every link
     // getText(); is a method which is used to get the name of the elements
     
     for (int i=0; i < elements.size();
    		 i++) {
    	 
      System.out.println(elements.get(i).getText());
      
      
    	
     }
     
 
    
    
    }

}

