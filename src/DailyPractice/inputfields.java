package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inputfields {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("http://omayo.blogspot.com/");
    driver.manage().window().maximize();
    
   List<WebElement> InputFields=driver.findElements(By.tagName("input"));
   System.out.println("Total no of inputs are: "+InputFields.size());
    
   WebElement TextField=driver.findElement(By.id("ta1"));
   TextField.clear();
   TextField.sendKeys("Automation Testers");
   
   WebElement Searchbox=driver.findElement(By.name("q"));
   Searchbox.clear();
   Searchbox.sendKeys("Daily routine");
   
   
	}

}
