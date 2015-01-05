package actionBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/demos/draggable/");
		 Thread.sleep(10000);
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		 WebElement drag_item=driver.findElement(By.xpath("//*[@id='draggable']"));
		 new Actions(driver).dragAndDropBy(drag_item, 120, 120).build().perform();
	}

}
