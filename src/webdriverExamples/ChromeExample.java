package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		WebElement element=driver.findElement(By.name("q"));
		element.clear();
		element.sendKeys("books");
		Thread.sleep(10000);
		element.submit();	
		Thread.sleep(10000);

		//driver.quit();	
	}

}
