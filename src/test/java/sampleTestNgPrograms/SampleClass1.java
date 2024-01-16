package sampleTestNgPrograms;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/*
 * @Test is mandatory for all the test cases otherwise it will not consider as test case
 * @Test we can provide in class level also but it is not a recommended choice , we should always provide in function
 * level.
 * To execute the test cases in custom order we have to use a method called as "priority"
 * the lowest number will get the first priority
 * priority can be negative also
 * If we don't provide priority it will execute alphabetical order.
 */

public class SampleClass1 {
	@Test(priority = 1)
	public void createUser()
	{
		System.out.println("user created!!");
	}
	@Test(priority = 2)
	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("user deleted!!");
	}
}
