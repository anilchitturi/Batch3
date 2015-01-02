package inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ByInheritance extends Driver{

private static WebDriver driver=null;

	public static void main(String[] args) throws Exception{
	    //getting webdriver instance by extending the base class
		driver=driverInstance("firefox");
		System.out.println("driver value "+driver);
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("gbqfq"));
		Thread.sleep(10000);
		element.sendKeys("books");
		element.submit();		
		driver.quit();	
	}

}
