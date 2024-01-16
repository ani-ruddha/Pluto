package sampleTestNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementSample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://pmt.abym.in/login");
		Thread.sleep(3000);
	WebElement element =	driver.findElement(By.xpath("//input[@placeholder='Email']"));
	element.sendKeys("abymemp34@gmail.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	element.sendKeys("abymemp34@gmail.com");
	}
}
