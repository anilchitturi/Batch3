package inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver=null;

	
	public static WebDriver driverInstance(String browerType){
		WebDriver driver=null;	
		if(browerType=="firefox"){
		 driver = new FirefoxDriver();}
		else if(browerType=="chrome"){
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		driver = new ChromeDriver();
	}
		System.out.println("driver"+driver);
		return driver;
}
	
	public static WebDriver driverInstance1(String browerType){
		//WebDriver driver=null;	
		if(browerType=="firefox"){
		 driver = new FirefoxDriver();}
		else if(browerType=="chrome"){
		System.setProperty("webdriver.chrome.driver", "D:/Chromedriver.exe");
		driver = new ChromeDriver();
	}
		System.out.println("driver"+driver);
		return driver;
}
	

}
