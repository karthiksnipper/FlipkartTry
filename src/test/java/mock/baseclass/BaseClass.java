package mock.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void anyDriver(String browserName) {
			
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
//				ChromeOptions co = new ChromeOptions ();
//				co.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")){
				driver=new FirefoxDriver();
	}
			else if(browserName.equalsIgnoreCase("ie")) {
				driver=new InternetExplorerDriver(); }
			
	        else if(browserName.equalsIgnoreCase("edge")){
				driver=new EdgeDriver();
				
			}
			}

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
		}
	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream(getProjectPath()+"\\Config\\config.properties"));
		Object object = properties.get(key);
		String value=(String)object;
		return value;

	}
	
	public static void getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	public static void enterApplUrl(String url) {
		driver.get(url);
		}
	
	public static  void maximizewindow() {
		driver.manage().window().maximize();
		}
	
	public static void elementInsertValue(WebElement element, String data) {
		element.sendKeys(data);
		}
	
	public static void elementClick(WebElement element) {
		element.click();
		}
	
	public static String elementGetText(WebElement element) {
		String text = element.getText();
		return text; }
		
		public static String elementGetAttribute(WebElement element, String value) {
			String attribute = element.getAttribute("value");
			return attribute;
			}
	
		public static  void closeCurrentWin() {
			driver.close();
		}
		
		public static void insertValueByJs(WebElement element, String data) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].setAttribute('value"+data+"')", element);

		}
		
		public static void clickByJs(WebElement element , String data) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",element);
			}
		
		public void windowHandleToParent() {
			String parentWinId = driver.getWindowHandle();
	        Set<String> allWinIds = driver.getWindowHandles();
	       for(int i = 0; i <allWinIds.size(); i++)  {
	            if (!(allWinIds.equals(parentWinId)))
	                driver.switchTo().window(parentWinId);
	        };
		}
		
		public static byte[] scenarioScreenShot() {
            TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] b= ts.getScreenshotAs(OutputType.BYTES);		
			return b;
		}
		
		
		public static void quitWindow() {
			driver.quit();

		}
		
}
