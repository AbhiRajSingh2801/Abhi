import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
//class name =ChromDriver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Drive (F)\\project tools\\shishira\\Maven\\My_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	
		System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	//System.out.println(driver.getPageSource());
	driver.navigate().to("http://yahoo.com");
	driver.navigate().back();
	//driver.navigate().forward();
	driver.close();
	//driver.quit();
	}

}
