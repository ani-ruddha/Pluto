package testScriptRepo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
@Listeners(genericUtility.ListenersImplementationClass.class)
public class FC_001 extends BaseClass {

	@Test(groups = {"regression"})
	public void tc003() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
	String CATEGORY = 	EUTIL.getDataFromExcel("FAQ Category", 2, 1);
		driver.findElement(By.xpath("//span[text()='FAQs Management']")).click();
		driver.findElement(By.xpath("//span[text()='FAQ-Category']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Category']"))
		.sendKeys(CATEGORY);		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		System.out.println("tc003 execution successfull!!");
		Thread.sleep(5000);
		
	}
}
