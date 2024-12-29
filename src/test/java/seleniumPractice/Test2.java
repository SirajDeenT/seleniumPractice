package seleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\siraj\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.google.co.in/");
		}

	}

	


