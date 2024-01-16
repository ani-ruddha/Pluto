package sampleTestNgPrograms;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*
 * If we want to create a dependency in between methods we have to use "dependsOn" method..
 * We can use multiple methods in @test annotation argument
 * If we want to remove a test case from execution we have to use a method called as "enabled = false"..
 * If we want to execute a function multiple times we have to use a method called as "invocationCount"..
 * If we want to pass any useful information in our report we have use a static method named as "log(String)" which is
 * present in Reporter class.
 */
public class SampleClass2 {
	@Test(priority = 1 , enabled = true , invocationCount = 5)
	public void createUser()
	{
		System.out.println("user created!!");
	}
	@Test(priority = 2 , dependsOnMethods = "createUser")
	public void modifyUser()
	{
		System.out.println("user modified!!");
		Reporter.log("modify user depends on createUser");
	}
	
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("user deleted!!");
	}
}
