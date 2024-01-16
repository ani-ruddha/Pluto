package testScriptRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.DepartMentManagementHomepAge;
import objectRepository.DepartmentAddPage;
import objectRepository.HomePage;


@Listeners(genericUtility.ListenersImplementationClass.class)
public class DM_001 extends BaseClass {

	@Test//(groups ={"smoke"} , retryAnalyzer = genericUtility.RetryAnalyzerImplementationClass.class)
	public void testCase2() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String DEPTNAME =	EUTIL.getDataFromExcel("Department management", 2, 1);
		Thread.sleep(4000);
		HomePage hp = new HomePage(driver);
		hp.clickOnDepartmentManagement();
		
		DepartMentManagementHomepAge dhp = new DepartMentManagementHomepAge(driver);
		dhp.clickOnAdd();		
		
		DepartmentAddPage dap = new DepartmentAddPage(driver);
		dap.submitByActive(DEPTNAME);
		System.out.println("TC2 execution successfull!!");
		Thread.sleep(6000);
		
	}
}
