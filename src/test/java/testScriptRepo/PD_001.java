package testScriptRepo;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;

@Listeners(genericUtility.ListenersImplementationClass.class)
public class PD_001 extends BaseClass
{

	@Test(groups = {"smoke" ,"regression"})
	public void tc001() throws Exception {
		
		/*read data from Excel*/
		ExcelUtility EUTIL = new ExcelUtility();
		String CATEGORY =	EUTIL.getDataFromExcel("Promotions and discounts", 2, 1);
		String SLUG = 	EUTIL.getDataFromExcel("Promotions and discounts", 2, 2);
		driver.findElement(By.xpath("//span[text()='Promotions & Discounts']")).click();
		driver.findElement(By.xpath("//span[text()='Categories']")).click();
		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Category']")).sendKeys(CATEGORY);
		driver.findElement(By.xpath("//input[@placeholder='Slug']")).sendKeys(SLUG);
		
		driver.findElement(By.xpath("//input[@id='basic_Type']")).click();
		driver.findElement(By.xpath("//div[text()='Others']")).click();
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("Tc01 execution suucessfull!!");
		Thread.sleep(6000);	
	}
}



