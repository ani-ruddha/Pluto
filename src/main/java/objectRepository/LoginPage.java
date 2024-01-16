package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the POM class for Login Page
 * @author Aniruddha Das
 */
public class LoginPage {

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signInBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	/**
	 * this is the business library to perform login operation
	 * @param user
	 * @param pass
	 */
	public void loginOperation(String user , String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		signInBtn.click();
	}
	
}
