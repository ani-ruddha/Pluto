package sampleTestNgPrograms;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertClass {	
	@Test
	public void softAssertStrictComaprison()
	{
		String expectedValue = "raja";
		String actualValue  = "Raja";		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedValue, actualValue);		
		System.out.println("soft assert hard comparison passed!!");
		sa.assertAll();
	}
	@Test
	public void softContainsStrictComaprison()
	{
		String expectedValue = "maharaja";
		String actualValue  = "nbnjbjnbjb";		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(expectedValue.contains(actualValue));	
		System.out.println("soft assert contains comparison passed!!");
		sa.assertAll();
	}
}
