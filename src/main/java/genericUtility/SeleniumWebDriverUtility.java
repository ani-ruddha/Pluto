package genericUtility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * this class is for all seleniumWebDriver methods
 * @author AniruddhaDas
 */
public class SeleniumWebDriverUtility {

	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * select option in a drop down based on index
	 * @param element
	 * @param indexNum
	 */
	public void selectOptionFromDropdown(WebElement element , int indexNum)
	{
		Select s = new Select(element);
		s.selectByIndex(indexNum);
	}
	/**
	 * select option in a dropdown based on value
	 * @param element
	 * @param value
	 */
	public void selectOptionFromDropdown(WebElement element , String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * Select option in a dropdown based of visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionFromDropdownByVisibleText(WebElement element , String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	/**
	 * move to an Element
	 * @param driver
	 * @param element
	 */
	public void movingToAnElement(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * right click on an element
	 * @param driver
	 * @param element
	 */
	public void rightClickOnAnElement(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * this method is to perform drag and drop
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void dragAndDropOperation(WebDriver driver , WebElement src , WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target);
	}
	/**
	 * to accept an alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	/**
	 * to reject an alert
	 * @param driver
	 */
	public void rejectAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	/**
	 * to fetch the alert msg
	 * @param driver
	 * @return
	 */
	public String fetchAlertMsg(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String alertmsg =	alt.getText();
		return alertmsg;
	}
}





