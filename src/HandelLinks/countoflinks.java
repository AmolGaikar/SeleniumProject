package HandelLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countoflinks {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    List<WebElement>totalwebelements=driver.findElements(By.tagName("a"));
    System.out.println("no of links in flipkart Home page is:   "+totalwebelements.size());
    
  
    
    
	}

}
