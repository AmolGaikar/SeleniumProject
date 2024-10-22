package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartDropdown {

	public static void main(String[] args) {

	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/tyy/4io/~cs-8x94gv5fh4/pr?sid=tyy,4io&collection-tab-name=OPPO+K12x+5G&pageCriteria=default&param=9198981");
	driver.manage().window().maximize();
	
    List <WebElement>	ele=driver.findElements(By.tagName("select"));
    
    System.out.println("Total no dropdown are: "+ele.size());
    
   WebElement drop=driver.findElement(By.xpath("//select[@class='Gn+jFg']"));
    
    Select sle=new Select(drop);
    sle.selectByIndex(2);
	}

}
