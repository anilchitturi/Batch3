package inheritance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ByInstance{

private static WebDriver driver=null;

	public static void main(String[] args) throws Exception{
		
		//create a class object instance and getting the driver object
		Driver dv=new Driver();
		driver=dv.driverInstance("chrome");
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("gbqfq"));
		Thread.sleep(10000);
		element.sendKeys("books");
		element.submit();		
		driver.quit();	
	}

}
