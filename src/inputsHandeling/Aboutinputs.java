package inputsHandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aboutinputs {

	public static void main(String[] args) {
   FirefoxDriver driver=new FirefoxDriver();
   driver.get("https://practicetestautomation.com/practice-test-login/");
   driver.manage().window().maximize();
       //******* To count no of input fields **************
        List<WebElement>Totalinputs=driver.findElements(By.tagName("input"));
        System.out.println("No of inputs fields are: "+Totalinputs.size());
        
       //******* findout a particular input field***********
      WebElement  Usernamefield=driver.findElement(By.id("username"));   
      Usernamefield.clear();
      Usernamefield.sendKeys("student");
      
      WebElement Passwordfield=driver.findElement(By.name("password"));
      Passwordfield.clear();
      Passwordfield.sendKeys("Password123");
      
      driver.findElement(By.className("btn")).click();
      
          
	}

}
