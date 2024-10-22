package OpenBrowser;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFunction {

	public static void main(String[] args) {
    
   FirefoxDriver driver=new FirefoxDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
     driver.close();
    
  EdgeDriver driver1=new EdgeDriver();
 driver1.get("https://www.amazon.in/");
  driver1.manage().window().maximize();
  driver1.close();
    
    
		
	}

}
