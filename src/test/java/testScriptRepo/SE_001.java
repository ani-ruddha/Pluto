package testScriptRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.HomePage;
import objectRepository.SeoPage;
public class SE_001 extends BaseClass{

	@Test
	public void filterOperation() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
	String REFNAME =	EUTIL.getDataFromExcel("Seo", 2, 1);
	String SLUGNAME = 	EUTIL.getDataFromExcel("Seo", 2, 2);
	String TITLE =	EUTIL.getDataFromExcel("Seo", 2, 3);
	
	HomePage hp = new HomePage(driver);
	hp.clickOnSeo();
	
	SeoPage sp = new SeoPage(driver);
	sp.filterOperation(REFNAME, SLUGNAME, TITLE);
	Thread.sleep(3000);
		
	}
}
