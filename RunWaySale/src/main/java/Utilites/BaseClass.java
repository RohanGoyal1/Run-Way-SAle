package Utilites;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;
import pomclass.HomePageBeforeLogin;
import pomclass.Homepage;

public class BaseClass {
	static int count=0;
	public static WebDriver driver;
	

	@BeforeClass	
	public void launchingBrowser() throws Throwable{	
	System.out.println("---------------launching Browser-------");

	
	String browser= "chrome";
	if(browser.equals("chrome")) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(option);
	}
	
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		}
	

	else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
	}
	else  {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://myrunway.co.za/");
	
	}
	@BeforeMethod
	public void loginToApplication() throws Throwable
	{
//	count++;
		System.out.println("---------------login To Application-------");
		HomePageBeforeLogin HPBL = new HomePageBeforeLogin(driver);
		Thread.sleep(2000);
		HPBL.getAccountbutton().click();
		Thread.sleep(2000);
//		HPBL.getSigninbutton().click();
		HPBL.getEmail().sendKeys("rohangoyal555555@gmail.com");
		Thread.sleep(2000l);
		HPBL.getPass().sendKeys("Rohan1234@");
		HPBL.getSigninbutton().click();
//		HPBL.getHomeloginiconButton().click();
	}
	
	
	@AfterMethod
	public void LogoutFromApplication() throws Throwable
	{
		System.out.println(" Log out From Application "); 
		Homepage HP= new Homepage(driver);
		
		HP.getAfterloginaccountbutton().click();
		Thread.sleep(5000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scrollBy(776,437);");
		HP.getLogout().click();
		Thread.sleep(2000);
		HP.getLogouttohomepage().click();
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
	
	}

	@AfterClass
	public void TestServerStop()
	{
		System.out.println("stop");
//	driver.quit();	
	}
	
}

