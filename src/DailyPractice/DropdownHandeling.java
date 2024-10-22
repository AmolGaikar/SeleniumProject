package DailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandeling {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://the-internet.herokuapp.com/dropdown");
    driver.manage().window().maximize();
    
  WebElement  DD=driver.findElement(By.xpath("//select[@id='dropdown']"));
  
  Select sel=new Select(DD);
  
  sel.selectByIndex(2);
     
     
    }

}

