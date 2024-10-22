package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.Argument;

public class JStask1 {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    //****** To perform scroll operation**************
    JavascriptExecutor js= ((JavascriptExecutor)driver);
    js.executeScript("window.scrollBy(0,900)");	
    js.executeScript("window.scrollBy(0,900)");	
    //******** To perform click operation on a Web link********
   WebElement ele=driver.findElement(By.xpath("//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice\"]"));
   //ele.click();
  // WebElement ele1=driver.findElement(By.xpath("//a[@href=\"/gp/goldbox?ref_=na\"]"));
 //  WebElement ele2=driver.findElement(By.xpath("//a[@href=\"/gp/goldbox?ref_=na\"]"));

   js.executeScript("arguments[0].click();",ele); 
	
	}

}
