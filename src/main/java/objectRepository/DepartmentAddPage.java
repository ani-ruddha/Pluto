package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentAddPage {

	@FindBy(xpath = "//input[@placeholder='Department Name']")
	private WebElement departmentName;
	
	@FindBy(xpath = "//span[@class='ant-select-selection-item']")
	private WebElement status;
	
	@FindBy(xpath ="//span[text()='Active']")
	private WebElement activestatus;
	
	@FindBy(xpath ="//span[text()='Inactive']")
	private WebElement inactiveStatus;
	
	@FindBy(xpath ="//button[text()='Submit']")
	private WebElement submitBtn;

	public DepartmentAddPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getDepartmentName() {
		return departmentName;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getActivestatus() {
		return activestatus;
	}

	public WebElement getInactiveStatus() {
		return inactiveStatus;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	/**
	 * submit with active status
	 * @param name
	 */
	public void submitByActive(String name)
	{
		departmentName.sendKeys(name);
		status.click();
		activestatus.click();
		submitBtn.click();
	}
	/**
	 * submit with Inactive status
	 * @param name
	 */
	public void submittByInActive(String name)
	{
		departmentName.sendKeys(name);
		status.click();
		inactiveStatus.click();
		submitBtn.click();
	}
	
	
}
