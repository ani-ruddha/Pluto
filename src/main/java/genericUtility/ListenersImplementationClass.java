package genericUtility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.google.common.io.Files;
/**
 * this class is used to implements listener concept to monitor each and every test case as well
 * as capture the status of the test case.
 * @author Aniruddha Das
 */
public class ListenersImplementationClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	String methodName =	result.getMethod().getMethodName();
	Reporter.log(methodName +" execution starts!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName =	result.getMethod().getMethodName();
		Reporter.log(methodName +" execution successfull!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName =	result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
	File src =	ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(".\\ScreenShotFolder\\" + methodName +".png");
	
	try {
		Files.copy(src, dest);
	} catch (IOException e) {		
		e.printStackTrace();
	}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		String methodName =	result.getMethod().getMethodName();
		Reporter.log(methodName +" execution skipped!!");
	}				
}
