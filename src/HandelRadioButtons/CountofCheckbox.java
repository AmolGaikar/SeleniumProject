package HandelRadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountofCheckbox {

	public static void main(String[] args) {
     FirefoxDriver driver=new FirefoxDriver();
     driver.get("http://omayo.blogspot.com/");
     driver.manage().window().maximize();
     //******* To count no of checkbox ****************
//   List<WebElement>Checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
//    System.out.println("Total no of Checkbox are: "+Checkbox.size());
//    
//    //******** Names of each and every checkbox*****8
//    for (int i = 0; i < Checkbox.size(); i++) {
//    	System.out.println(Checkbox.get(i).getAttribute("value")); 
//    	
    	//*******selecting particular checkbox***********
    WebElement	Box=driver.findElement(By.id("checkbox2"));
    Box.click();
    // ********Check whether checkbox selected or not********
    if (Box.isSelected()) {
    	System.out.println("Checkbox is selected");
    }else {
    	System.out.println("Not selected");
    }
    	
		
	}
    
    
	}


