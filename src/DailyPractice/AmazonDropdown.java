package DailyPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown {

	public static void main(String[] args) {
//    WebDriver driver=new ChromeDriver();
//    driver.get("https://www.amazon.in");
//    driver.manage().window().maximize();
//    
//  List<WebElement>  element=driver.findElements(By.tagName("select"));
//  System.out.println("No of dropdown in amazon are: "+element.size());
//    
//  WebElement  Drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//
//   Select sel=new Select(Drop);
//    sel.selectByIndex(9); 
//    
//	}
//
//}
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	List<WebElement> ele=driver.findElements(By.tagName("select"));
	System.out.println("No of dropdown in amazon home page are: "+ele.size());
	
   WebElement	drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
    Select sel=new Select(drop);
    sel.selectByIndex(4);


	}		
}
	