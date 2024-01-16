package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/**
 * this is implementation class for retry Analyzer
 * @author Aniruddha Das
 */
public class RetryAnalyzerImplementationClass implements IRetryAnalyzer {

	int count = 0;
	int retryCount = 3;
	@Override
	public boolean retry(ITestResult result) {
		
		while(count<retryCount)
		{
			count++;
			return true;
		}
		return false;
	}

	
}
