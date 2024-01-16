package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class is for Seo Home page
 * @author Aniruddha Das
 */
public class SeoPage {

	@FindBy(xpath = "//input[@placeholder='Reference Name']")
	private WebElement referneceName;
	
	@FindBy(xpath = "//input[@placeholder='Slug']")
	private WebElement slug;
	
	@FindBy(xpath = "//input[@placeholder='Seo Title']")
	private WebElement seoTitle;
	
	@FindBy(xpath = "//button[text()='Filter']")
	private WebElement filter;
	
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement add;

	public SeoPage(WebDriver driver) {
		
		PageFactory.initElements(driver , this);
	}

	public WebElement getReferneceName() {
		return referneceName;
	}

	public WebElement getSlug() {
		return slug;
	}

	public WebElement getSeoTitle() {
		return seoTitle;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getAdd() {
		return add;
	}
	/**
	 * this is a filter operation to by reference Name
	 * @param refName
	 */
	public void filterOperation(String refName)
	{
		referneceName.sendKeys(refName);
		filter.click();
	}
	/**
	 * this is a filter operation to by reference Name and slug name
	 * @param refName
	 * @param slugName
	 */
	public void filterOperation(String refName , String slugName)
	{
		referneceName.sendKeys(refName);
		slug.sendKeys(slugName);
		filter.click();
	}
	/**
	 * this is a filter operation to by reference Name , slug name and title name
	 * @param refName
	 * @param slugName
	 * @param title
	 */
	public void filterOperation(String refName , String slugName , String title)
	{		
		referneceName.sendKeys(refName);
		slug.sendKeys(slugName);
		seoTitle.sendKeys(title);
		filter.click();
	}
	
	
}
