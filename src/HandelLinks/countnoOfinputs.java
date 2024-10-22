package HandelLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countnoOfinputs {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("http://omayo.blogspot.com/");
   List<WebElement> inputelements=driver.findElements(By.tagName("input"));
   
   System.out.println("No of Input Elements:   "+inputelements.size());
   
    
    
	}

}
