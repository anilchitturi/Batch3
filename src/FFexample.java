import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FFexample {

	public FFexample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 
		 System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element=driver.findElement(By.id("gbqfq"));
		Thread.sleep(10000);
		element.sendKeys("books");
		element.submit();		
		driver.quit();	
	}

}
