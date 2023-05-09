package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectLocation = System.getProperty("user.dir"); 

		  

		System.out.println("projectLocation ->" + projectLocation); 

  

		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/drivers/chromedriver.exe"); 

  

		WebDriver driver = new ChromeDriver(); 

  

		driver.manage().window().maximize(); 

  

		driver.get("https://www.google.com/"); 
	}

}
