package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoforJS {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new FirefoxDriver();
    driver.get("http://omayo.blogspot.com/");    
    driver.manage().window().maximize();
    
  JavascriptExecutor js= ((JavascriptExecutor)driver);
   js.executeScript("window.scrollBy(0,900)");
   Thread.sleep(5000);
   js.executeScript("window.scrollBy(0,900)");
    
  WebElement ele=driver.findElement(By.xpath("//a[@href=\"http://omayo.blogspot.com/2013/05/page-one.html\"]"));
  //ele.click();
  WebElement ele1=driver.findElement(By.xpath("//a[@href=\"http://omayo.blogspot.com/2013/05/page-one.html\"]"));
  WebElement ele2=driver.findElement(By.xpath("//a[@href=\"http://omayo.blogspot.com/2013/05/page-one.html\"]"));
  WebElement ele3=driver.findElement(By.xpath("//a[@href=\"http://omayo.blogspot.com/2013/05/page-one.html\"]"));

  js.executeScript("arguments[0].click();",ele,ele1,ele2,ele3);
  
  
	}

}
