package Autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Editormarkcomplete extends Setup{
//String project;


	


	
	

	
	
	
	
@Test(priority=20)
public void Markallcomplete() throws InterruptedException {
	
	
		
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush.soni@47billion.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Pirat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
Thread.sleep(2000);		
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[4]/ul[1]/button[1]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Video Final')]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//button[contains(text(),'Mark All Complete')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'Yes, Proceed')]")).click();
Thread.sleep(2000);	
}
	
@AfterMethod
public void tearDown() {
	
driver.quit();
}
	
	

}
	
	
	
	
	
	
	
	
	
	














