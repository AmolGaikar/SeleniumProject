package dropdownhandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountDropdown {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.mercurytravels.co.in/");
    driver.manage().window().maximize();
    
    List<WebElement> elements=driver.findElements(By.tagName("select"));
    System.out.println("Total No of DropDown are: "+elements.size());
	}

}
