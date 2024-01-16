package genericUtility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.LoginPage;
/**
 * this is the base class to keep all the common features
 * @author Aniruddha Das
 */
public class BaseClass {
	
	public PropertiesUtility PUTIL = new PropertiesUtility();	
	public static WebDriver driver = null;
	
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnectionEstablish()
	{
		System.out.println("db connection successfull!!");
	}
	
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser() throws Exception
	{
		String URL = PUTIL.getDataFromProperties("url");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumFolder\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("browser launched successfully!!");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginApplication() throws Exception
	{
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");		
		//changes
		LoginPage login = new LoginPage(driver);
		login.loginOperation(USERNAME, PASSWORD);
		
		System.out.println("login successfull!!");
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutApplication()
	{		
		HomePage hp = new HomePage(driver);
		hp.logoutOperation();
		
		System.out.println("logout successfull!!");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("browser closed!!");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDbConnection()
	{
		System.out.println("db connection closed!!");
	}
}
