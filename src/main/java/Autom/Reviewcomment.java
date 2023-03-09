package Autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Reviewcomment extends Setup {
	
//*String project;

	
	




	
@Test(priority=19)
public void approveComments() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
Thread.sleep(2000);	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[4]/ul[1]/button[1]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[4]/ul[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/li[1]/a[1]/span[1]")).click();
Thread.sleep(5000);	
driver.findElement(By.xpath("//button[contains(text(),'Accept Comments')]")).click();
Thread.sleep(2000);	
}
	
@AfterMethod
public void tearDown() {
	
driver.quit();
}

}
