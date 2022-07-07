package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators_linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	     	String baseUrl = "https://demo.opencart.com/";					
	        System.setProperty("webdriver.chrome.driver","chromedriver");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        driver.get(baseUrl);	
	        
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        WebElement element = driver.findElement(By.linkText("MacBook"));
	        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	        jse2.executeScript("arguments[0].scrollIntoView()", element);
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).click().build().perform();
	        
	        //JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	        //jse2.executeScript("arguments[0].click()", element); 
	        //element.click();
	        //Thread.sleep(3000);
	        
//	        WebDriverWait wait  = new WebDriverWait(driver,30);
//	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        
	        //JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	        //jse2.executeScript("arguments[0].scrollIntoView()", element);
	        //jse2.executeScript("arguments[0].click()", element); 
	        
	        //element.click();
	        
//	        Actions actions = new Actions(driver);
//	        actions.moveToElement(element).click().build().perform();
	        
//	        Thread.sleep(3000);
//	        //driver.manage().wait(3);
//	        //driver.wait(1000);
//	        driver.findElement(By.linkText("MacBook")).click();					
//	        System.out.println("Title of page is: " + driver.getTitle());							
	        driver.quit();	
		
		

	}

}
