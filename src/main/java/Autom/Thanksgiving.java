package Autom;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Thanksgiving extends Setup{
	
	
	
	
@BeforeMethod
public void brokerGetUrl() {
setUpVideomsLogin();

			
			
}


@Test(priority=23)

public void uploadThanksImage() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//a[normalize-space()='Custom Shots / B-Roll']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//button[normalize-space()='Add Custom Shots / B-Roll'])[1]")).click();
driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Testt");
driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Test");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Upload']")).click();
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\47Billion\\Desktop\\Images P\\Screenshot_1.png");
Thread.sleep(5000);
driver.findElement(By.xpath("//span[contains(text(),'Screenshot_1(1).png')]")).click();
Thread.sleep(20000);
}

}
