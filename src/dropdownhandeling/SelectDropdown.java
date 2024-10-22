package dropdownhandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.mercurytravels.co.in/");
    driver.manage().window().maximize();
     
    WebElement typeofholidays=driver.findElement(By.xpath("//select[@name='theme']"));// To find Particular dropdown 
  
    Select sel=new Select(typeofholidays);
   // sel.selectByIndex(15);
   //sel.selectByValue("15");
     sel.selectByVisibleText("Family");
	}

}
