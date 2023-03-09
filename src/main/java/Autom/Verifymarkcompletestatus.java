package Autom;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Verifymarkcompletestatus extends Setup {

//String project;	
	
	
	
	

@BeforeMethod
public void brokerGetUrl() {
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://videoms-qa.47billion.com/");
	driver.manage().window().maximize();
	}

		
		

			
	
@Test(priority=21)
public void verifyCommentStatusPM() throws InterruptedException{
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
Thread.sleep(2000);	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[4]/ul[1]/button[1]")).click();
driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[4]/ul[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/li[1]/a[1]/span[1]")).click();
Thread.sleep(5000);		
boolean completeStatus = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]")).isDisplayed();
Assert.assertTrue(completeStatus);
}

@Test(priority=22)
public void verifyCommentStatusBroker() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")).click();
driver.findElement(By.xpath("//strong[contains(text(),'"+project+"')]")).click();
Thread.sleep(4000);	
driver.findElement(By.xpath("//tbody/tr[1]/td[2]/span[1]/a[1]")).click();
ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
//switch to active tab
driver.switchTo().window(wid.get(1));
Thread.sleep(4000);		
boolean brokercommentstatus = driver.findElement(By.xpath("//span[@title='Completed']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).isDisplayed();
Assert.assertTrue(brokercommentstatus);
	
	
	
}

@AfterMethod
public void tearDown() {
	
driver.quit();
}	
	
}
