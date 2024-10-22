package HandelRadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountofRadio {

	public static void main(String[] args) {
     FirefoxDriver driver=new FirefoxDriver();
     driver.get("http://omayo.blogspot.com/");
     driver.manage().window().maximize();
     // **********To count of no of Radio Buttons  ***************
      List<WebElement> Btn=driver.findElements(By.xpath("//input[@type='radio']"));
      System.out.println("Total radio buttons are: "+Btn.size()); 
      // ***** Selecting a particular Radio button **********
//    WebElement  Femalebtn=driver.findElement(By.id("radio2"));
//    Femalebtn.click(); 
    
    //********** Names of each and every Radio buttons **************
    
    for (int i = 0; i < Btn.size(); i++) {
 	
  	System.out.println(Btn.get(i).getAttribute("value"));
	
    	// ***** Check whether Radio button selected or not **********
    WebElement maleBtn=driver.findElement(By.id("radio1"));
    maleBtn.click();
    
     if (maleBtn.isSelected()) {
    System.out.println("Male radio btn is Clicked");
     } else {
    	System.out.println("Not Clicked");
     }
	}
    
     
	}
}


