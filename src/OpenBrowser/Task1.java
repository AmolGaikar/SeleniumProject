package OpenBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Task1 {

	public static void main(String[] args) {
    FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com/login");
    driver.manage().window().maximize();
    
    
	}

}
