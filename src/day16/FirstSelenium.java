package day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://www.opensource-demo.orangehrmlive.com/";					
        System.setProperty("webdriver.chrome.driver","chromedriver");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);	
        
        driver.manage().window().maximize();
        driver.quit();
        
        

	}

}
