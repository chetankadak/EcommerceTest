package Base_Class;

import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigReader;

public class browserClass {

	public static String Browser= ConfigReader.getProperty("browser");
	public static String url = ConfigReader.getProperty("url");	
	public static WebDriver driver;
	
	
	public static void browsers(String Browser, String url) {
		switch(Browser) {
		case "chrome":
		//WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--window-size=1920,1080");
		
		

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
		driver.get(url);
		break;
		
		case "firefox":
		//WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
        driver = new FirefoxDriver(opt);
		driver.get(url);
		break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public static void browserQuit() {
		driver.quit();
	}
	
	

}
