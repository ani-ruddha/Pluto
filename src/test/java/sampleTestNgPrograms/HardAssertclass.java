package sampleTestNgPrograms;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertclass {
	@Test
	public void hardAssertStrictComaprison()
	{
		String expectedValue = "raja";
		String actualValue  = "Raja";
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("assertion passed!!");
	}	
	@Test
	public void hardAssertContainsComaprison()
	{
		String expectedValue = "Maharaja";
		String actualValue  = "raja";
		
		Assert.assertTrue(expectedValue.contains(actualValue));
		System.out.println("Contains passed!!");
	}
}





